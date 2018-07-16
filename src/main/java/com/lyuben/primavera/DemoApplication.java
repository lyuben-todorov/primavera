package com.lyuben.primavera;

import com.lyuben.primavera.domain.Category;
import com.lyuben.primavera.service.CategoryServiceImpl;
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
    public CommandLineRunner commandLineRunner(CategoryServiceImpl categoryService) {
        return (args) -> {
            categoryService.save(new Category("hook"));
            categoryService.save(new Category("hook2"));
            categoryService.save(new Category("bong"));

        };
    }
}
