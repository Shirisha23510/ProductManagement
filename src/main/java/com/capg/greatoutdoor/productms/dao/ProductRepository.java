package com.capg.greatoutdoor.productms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.capg.greatoutdoor.productms.entity.ProductDTO;

public interface ProductRepository  extends JpaRepository<ProductDTO, String>

{

}
