package com.example.primavera.service;

import com.example.primavera.domain.User;
import com.example.primavera.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);

    User save(UserRegistrationDto registraion);

}
