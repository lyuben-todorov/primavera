package com.lyuben.primavera.web;

import com.lyuben.primavera.service.base.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @Autowired
    ProductService productService;

    @GetMapping("/admin/orders")
    public String orders(Model model) {
        return "admin/orders";
    }


    @GetMapping("/admin/customers")
    public String customers(Model model) {
        return "admin/customers";
    }

    @GetMapping("/admin/products")
    public String products(Model model) {
        model.addAttribute(productService.findAll());
        return "admin/products";
    }
}
