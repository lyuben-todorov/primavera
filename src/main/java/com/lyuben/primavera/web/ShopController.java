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


    @GetMapping(value = "")
    public String selectAll(Model model) {
        List<Product> productList = productService.findAll();
        List<Category> categoryList = categoryService.findAll();
        model.addAttribute(productList);
        model.addAttribute(categoryList);
        return "shop";
    }

    @RequestMapping(value = "/sortBy")
    public String selectCategory(Model model,
                                 @RequestParam(value = "categoryId") String categoryId) {

        List<Product> productList = productService.findByCategoryId(Long.parseLong(categoryId));
        List<Category> categoryList = categoryService.findAll();
        model.addAttribute(categoryList);
        model.addAttribute(productList);
        model.addAttribute(categoryService.findById(Long.parseLong(categoryId)));
        return "shop";
    }

    @RequestMapping(value = "**/product")
    public String selectProduct(Model model,
                                @RequestParam(value = "productId") String productId) {
        Product product = productService.findById(Long.parseLong(productId));

        List<Category> categoryList = categoryService.findAll();

        model.addAttribute(categoryList);
        model.addAttribute(product);
        return "shop/product";

    }
}
