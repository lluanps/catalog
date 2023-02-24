package com.luanpinheiro.dscatalog.tests;

import java.time.Instant;

import com.luanpinheiro.dscatalog.dto.ProductDTO;
import com.luanpinheiro.dscatalog.entitites.Category;
import com.luanpinheiro.dscatalog.entitites.Product;

public class Factory {

	public static Product createProduct() {
		Product product = new Product(1L, "Phone", "Good phone", 800.0, "http://img.com/img.png", Instant.parse("2023-01-01T03:00:00Z"));
		product.getCategories().add(createCategory());
		return product;
	}
	
	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}

	public static Category createCategory() {
		return new Category(1L, "Eletrônics");
	}
	
}
