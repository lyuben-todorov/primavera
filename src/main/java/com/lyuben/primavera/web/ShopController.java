package com.lyuben.primavera.web;

import com.lyuben.primavera.domain.Category;
import com.lyuben.primavera.domain.product.Product;
import com.lyuben.primavera.service.base.CategoryService;
import com.lyuben.primavera.service.base.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/sortBy")
    public String selectCategory(Model model,
                                 @RequestParam(value = "id", defaultValue = "1") String categoryId) {

        List<Product> productList = productService.findByCategoryId(Long.parseLong(categoryId));
        List<Category> categoryList = categoryService.findAll();
        model.addAttribute(categoryList);
        model.addAttribute(productList);
        return "shop";
    }

    @GetMapping(value = "")
    public String selectAll(Model model) {
        List<Product> productList = productService.findAll();
        List<Category> categoryList = categoryService.findAll();
        model.addAttribute(productList);
        model.addAttribute(categoryList);
        return "shop";
    }
}
