package com.myfuturehub.futuionsales.repository;

import com.myfuturehub.futuionsales.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
