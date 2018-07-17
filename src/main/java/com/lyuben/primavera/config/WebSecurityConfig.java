package com.lyuben.primavera.config;

import com.lyuben.primavera.handler.AuthenticationSuccessHandlerImpl;
import com.lyuben.primavera.handler.LogoutSuccessHandlerImpl;
import com.lyuben.primavera.service.base.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationSuccessHandlerImpl authenticationSuccessHandler;

    @Autowired
    private LogoutSuccessHandlerImpl logoutSuccessHandler;

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests()
                    .antMatchers(
                            "/",
                            "/home",
                            "/register",
                            "/shop/**",
                            "/resources/**",
                            "/js/**",
                            "/css/**",
                            "/img/**",
                            "/images/**",
                            "/webjars/**").permitAll()
                    .anyRequest().authenticated()
                .and()
                .authorizeRequests()
                .antMatchers("/admin/**").access("hasAnyAuthority('ADMIN')")
                .and()
                    .formLogin()
                        .loginPage("/login")

                .successHandler(authenticationSuccessHandler)
                            .permitAll()
                .and()
                    .logout()
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .deleteCookies("JSESSIONID")
                .logoutUrl("/auth_logout")
                .logoutRequestMatcher(new AntPathRequestMatcher("/auth_logout"))
                .logoutSuccessHandler(logoutSuccessHandler)
                        .permitAll();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(userService);
        auth.setPasswordEncoder(passwordEncoder());
        return auth;
    }

    @Autowired
    public void initialize(AuthenticationManagerBuilder authenticationManagerBuilder){
        authenticationManagerBuilder.authenticationProvider(authenticationProvider());

    }

}
