package com.lyuben.primavera.repository.product;

import com.lyuben.primavera.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository<T extends Product, ID extends Serializable>
        extends JpaRepository<T, ID> {

    @Override
    List<T> findAll();

    @Override
    <S extends T> List<S> saveAll(Iterable<S> entities);

    @Override
    void flush();

    @Override
    <S extends T> S saveAndFlush(S entity);

    @Override
    T getOne(ID id);

    @Override
    <S extends T> S save(S entity);

    @Override
    Optional<T> findById(ID id);

    @Override
    boolean existsById(ID id);

    @Override
    long count();

    @Override
    void deleteById(ID id);

    @Override
    void deleteAll();
}
