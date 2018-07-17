package com.lyuben.primavera.service.base;

import com.lyuben.primavera.domain.product.Product;

import java.util.List;

public interface ProductService {
    Product findById(Long Id);

    Product save(Product product);

    List<Product> findAll();

    List<Product> findByCategoryId(Long Id);
}
