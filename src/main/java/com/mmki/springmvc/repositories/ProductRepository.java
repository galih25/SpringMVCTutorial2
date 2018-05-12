package com.mmki.springmvc.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mmki.springmvc.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
