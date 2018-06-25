package com.example.primavera.repository.product;

import com.example.primavera.domain.product.Crown;
import com.example.primavera.repository.product.base.BaseProductRepository;

import javax.transaction.Transactional;

@Transactional
public interface CrownRepository extends BaseProductRepository<Crown> {
    Crown findCrownById(Long id);
}
