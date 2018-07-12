package com.lyuben.primavera;

import com.lyuben.primavera.domain.product.BaseProduct;
import com.lyuben.primavera.domain.product.ProductInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;

@SpringBootApplication
public class DemoApplication {

    private final Log log = LogFactory.getLog(this.getClass());


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(JpaRepository<BaseProduct, Long> productRepository, EntityManager em) {

        Log loger = LogFactory.getLog(this.getClass());

        return (args) -> {
            ProductInfo p1 = new ProductInfo("Hook 1", "abdul", 2, 50, "4ikii da biim");

            //ProductInfo p2 = new ProductInfo("Hook 2", "habib", 2, 50, "4ikii da biim");

            //ProductInfo p3 = new ProductInfo("Hook 3", "punjab", 2, 50, "4ikii da biim");

            BaseProduct b1 = new BaseProduct(p1);
            productRepository.save(b1);
            em.refresh(b1);

            productRepository.findById(1L);
        };
    }
}
