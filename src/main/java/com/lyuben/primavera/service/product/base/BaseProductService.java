package com.lyuben.primavera.service.product.base;

import com.lyuben.primavera.domain.product.Product;

import java.util.List;

public interface BaseProductService<T extends Product, ID> {
    T findById(ID id);

    List<T> findAll();
    T save(T product);

    long count();
}
