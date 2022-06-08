package com.example.ressfullrs.repository;

import com.example.ressfullrs.entity.Product;

import java.util.List;

public interface ProductRepository {

    Product save(Product obj);

    Product update(Product obj, int id);

    boolean delete(int id);

    List<Product> findAll();

    Product findById(int id);
}
