package com.lyuben.primavera.repository.product;

import com.lyuben.primavera.domain.product.base.Product;
import com.lyuben.primavera.repository.product.base.BaseRepository;

import java.io.Serializable;
import java.util.List;

public interface ProductRepository<T extends Product, ID extends Serializable>
        extends BaseRepository<T, ID> {

    @Override
    T getOne(ID id);

    @Override
    long count();

    @Override
    List<T> findAll();
}
