package org.khmeracademy.app.service;

import java.util.List;

import org.khmeracademy.app.model.Product;
import org.khmeracademy.app.repository.ProductRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {
	ProductRepoImp productRepo;
	
	@Autowired
	public ProductServiceImp(ProductRepoImp p){
		this.productRepo = p;
	}
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> products = productRepo.getAllProducts();
		return products;
	}
}
