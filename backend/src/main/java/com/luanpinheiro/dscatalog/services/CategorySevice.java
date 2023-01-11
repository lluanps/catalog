package com.luanpinheiro.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luanpinheiro.dscatalog.dto.CategoryDTO;
import com.luanpinheiro.dscatalog.entitites.Category;
import com.luanpinheiro.dscatalog.repositories.CategoryRepository;

@Service
public class CategorySevice {
	
	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll() {
		List<Category> list = repository.findAll();
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
	
	}
	
	

}
