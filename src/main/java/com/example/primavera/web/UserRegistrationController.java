package com.example.primavera.web;

import com.example.primavera.domain.User;
import com.example.primavera.service.UserService;
import com.example.primavera.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
@RequestMapping("/register")
public class UserRegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    private DaoAuthenticationProvider daoAuthenticationProvider;

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm(Model model) {
        return "register";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") @Valid UserRegistrationDto userDto,
                                      BindingResult result, HttpServletRequest req, HttpServletResponse res) {


        User existing = userService.findByEmail(userDto.getEmail());

        if (existing != null){
            result.rejectValue("email", "200", "There is already an account registered with that email");
        }

        if (result.hasErrors()){
            return "register";
        }

        userService.save(userDto);


        //auth
        registerAndSetSession(userDto, req);


        
        return "redirect:/register?success";
    }


    //authenticate after registering
    private void registerAndSetSession(UserRegistrationDto user, HttpServletRequest req) {
        String username = user.getEmail();
        String password = user.getPassword();
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);

        req.getSession();

        token.setDetails(new WebAuthenticationDetails(req));
        Authentication authentication = daoAuthenticationProvider.authenticate(token);

        SecurityContextHolder.getContext().setAuthentication(authentication);
    }

}
