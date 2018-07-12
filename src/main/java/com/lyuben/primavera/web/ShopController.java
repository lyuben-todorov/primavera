package com.lyuben.primavera.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {

    @GetMapping("/shop")
    public String shop(Model model) {
        //List<Hookah> hookahList = hookahrep.findAll();
        //model.addAttribute(hookahList);
        return "shop";
    }
}
