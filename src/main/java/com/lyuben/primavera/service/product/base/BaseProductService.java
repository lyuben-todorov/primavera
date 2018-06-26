package com.lyuben.primavera.service.product.base;

import com.lyuben.primavera.domain.product.base.Product;

public interface BaseProductService<T extends Product, ID> {
    T findById(ID id);

    T save(T product);
}
