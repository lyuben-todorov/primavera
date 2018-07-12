package com.lyuben.primavera.service.product;

import com.lyuben.primavera.domain.product.Product;
import com.lyuben.primavera.repository.product.ProductRepository;
import com.lyuben.primavera.service.product.base.BaseProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class ProductService<T extends Product, ID extends Serializable> implements BaseProductService<T, ID> {

    @Autowired
    ProductRepository<T, ID> repository;

    @Override
    public T findById(ID id) {
        return repository.getOne(id);
    }

    @Override
    public T save(T product) {
        return repository.save(product);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public long count() {
        return repository.count();
    }
}
