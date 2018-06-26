package com.lyuben.primavera.service.user;

import com.lyuben.primavera.domain.auth.User;
import com.lyuben.primavera.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);
    User save(UserRegistrationDto registraion);

}
