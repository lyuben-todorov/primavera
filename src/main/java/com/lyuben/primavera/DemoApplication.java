package com.lyuben.primavera;

import com.lyuben.primavera.domain.product.Product;
import com.lyuben.primavera.domain.product.ProductInfo;
import com.lyuben.primavera.repository.ProductRepository;
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
    public CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return (args) -> {
            Log loger = LogFactory.getLog(this.getClass());


            ProductInfo p1 = new ProductInfo("Hook1", "lorem", 2, 50, "desc");

            ProductInfo p2 = new ProductInfo("Hook2", "lorem", 2, 50, "desc");

            Product b1 = new Product(p1);
            productRepository.save(b1);

            productRepository.save(new Product(p2));

            productRepository.findAll().forEach(product -> loger.warn(product.getName()));
        };
    }
}
