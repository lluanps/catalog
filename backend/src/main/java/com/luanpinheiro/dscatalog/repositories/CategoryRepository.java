package com.luanpinheiro.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luanpinheiro.dscatalog.entitites.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
