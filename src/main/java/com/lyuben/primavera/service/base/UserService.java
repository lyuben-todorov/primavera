package com.lyuben.primavera.service.base;

import com.lyuben.primavera.domain.auth.User;
import com.lyuben.primavera.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);
    User save(UserRegistrationDto registraion);

    List<User> findAll();

}
