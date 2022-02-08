package com.mycompany.store.product.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.store.product.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
	List<Product> findByCatId(int catid);
	
	Product findById(int id);
}
