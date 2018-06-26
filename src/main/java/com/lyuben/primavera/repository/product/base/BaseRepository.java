package com.lyuben.primavera.repository.product.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID> {
    @Override
    T getOne(ID id);

    @Override
    long count();

    @Override
    List<T> findAll();
}
