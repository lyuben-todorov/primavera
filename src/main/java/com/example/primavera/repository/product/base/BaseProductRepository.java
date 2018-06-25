package com.example.primavera.repository.product.base;

import com.example.primavera.domain.product.base.BaseProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseProductRepository<T extends BaseProduct> extends JpaRepository<T, Long> {
    @Override
    T getOne(Long id);
}
