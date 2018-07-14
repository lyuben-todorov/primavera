package com.lyuben.primavera.web;

import com.lyuben.primavera.domain.product.Product;
import com.lyuben.primavera.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ShopController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/shop")
    public String shop(Model model) {
        List<Product> productList = productRepository.findAll();
        model.addAttribute(productList);
        return "shop";
    }
}
