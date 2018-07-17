package com.lyuben.primavera;

import com.lyuben.primavera.domain.Category;
import com.lyuben.primavera.domain.product.Product;
import com.lyuben.primavera.domain.product.ProductInfo;
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
            categoryService.save(new Category("Hookah"));
            categoryService.save(new Category("Bong"));
            categoryService.save(new Category("Water Piper"));

            Category category = categoryService.findById(Long.parseLong("1"));
            Category category2 = categoryService.findById(Long.parseLong("2"));
            ProductInfo productInfo = new ProductInfo("Habibi shisha 2000",
                    "Jamal Inc", 23, 3, "Lorem ipsum maikati pi4kata", category);
            ProductInfo productInfo2 = new ProductInfo("Habibi BONG 2000",
                    "Jamal Inc", 23, 3, "Lorem ipsum maikati pi4kata", category2);

            productService.save(new Product(productInfo));
            productService.save(new Product(productInfo2));
            productService.findByCategoryId(category.getId()).forEach(product ->
                    log.warn(product.getName())
            );
        };
    }
}
