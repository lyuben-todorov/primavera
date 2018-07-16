package com.lyuben.primavera.repository;

import com.lyuben.primavera.domain.Category;
import com.lyuben.primavera.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(Category category);
}
