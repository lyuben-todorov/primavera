package com.lyuben.primavera;

import com.lyuben.primavera.service.CategoryServiceImpl;
import com.lyuben.primavera.service.base.ProductService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    private final Log log = LogFactory.getLog(this.getClass());


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CategoryServiceImpl categoryService, ProductService productService) {
        return (args) -> {
        };
    }
}
