package com.luanpinheiro.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luanpinheiro.dscatalog.entitites.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
