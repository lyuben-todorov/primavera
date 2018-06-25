package com.example.primavera.repository.product;

import com.example.primavera.domain.product.Bowl;
import com.example.primavera.repository.product.base.BaseProductRepository;

import javax.transaction.Transactional;

@Transactional
public interface BowlRepository extends BaseProductRepository<Bowl> {
    Bowl findBowlById(Long id);
}
