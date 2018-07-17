package com.lyuben.primavera.service.base;

import com.lyuben.primavera.domain.Category;

import java.util.List;

public interface CategoryService {

    Category findById(Long Id);

    Category save(Category category);

    List<Category> findAll();

}
