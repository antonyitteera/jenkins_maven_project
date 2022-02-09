package com.mycompany.store.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.store.product.dao.ProductRepository;
import com.mycompany.store.product.entity.Product;

@CrossOrigin("*")
@RestController
public class ProductController {
	@Autowired
	ProductRepository prodRepo;

	@RequestMapping("/product/{id}")
	public Product getProduct(@PathVariable int id) {
		return prodRepo.findById(id);
	}
	
	@RequestMapping("/products")
	public List<Product> getProductId(@RequestParam int id ){
		return prodRepo.findByCatId(id);
	}
}
