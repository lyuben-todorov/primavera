package com.lyuben.primavera.service;

import com.lyuben.primavera.domain.Category;
import com.lyuben.primavera.domain.product.Product;
import com.lyuben.primavera.repository.ProductRepository;
import com.lyuben.primavera.service.base.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product findById(Long Id) {
        Optional<Product> product = productRepository.findById(Id);
        if (product.isPresent()) {
            return productRepository.findById(Id).get();
        } else {
            //fix this asap
            return null;
        }
    }

    @Override
    public List<Product> findByCategory(Category category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
