package com.lyuben.primavera.config;

import com.lyuben.primavera.service.CategoryServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CategoryServiceImpl categoryService() {
        return new CategoryServiceImpl();
    }
}
