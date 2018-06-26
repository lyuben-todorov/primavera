package com.lyuben.primavera;

import com.lyuben.primavera.domain.product.Bowl;
import com.lyuben.primavera.service.product.ProductService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Component
    public class CommandLineRunnerApp implements CommandLineRunner {

        private final Log logger = LogFactory.getLog(this.getClass());


        @Autowired
        ProductService<Bowl, Long> service;


        @Override
        public void run(String... args) {
        }
    }
}
