package com.capg.greatoutdoor.productms.service;

import java.util.List;

import com.capg.greatoutdoor.productms.entity.ProductDTO;

public interface ProductService {
	

		public List<ProductDTO> viewAllProducts();
		
		public boolean addProduct(ProductDTO product);
		public boolean editProduct(ProductDTO product);
		 public boolean deleteProduct(String productId);
		
	}

