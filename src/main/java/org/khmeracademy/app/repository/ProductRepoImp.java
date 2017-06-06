package org.khmeracademy.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.khmeracademy.app.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepoImp implements ProductRepo{
	List<Product> products = new ArrayList<>();
	
	public ProductRepoImp(){
		Product p = new Product(1,"Coca Cola",12.3);
		products.add(p);
		p = new Product(2,"ABC",23.4);
		products.add(p);
		p = new Product(3,"Anchor",12.6);
		products.add(p);
		p = new Product(4,"Bacass",23.5);
		products.add(p);
		p = new Product(5,"Red Bull",6.1);
		products.add(p);
		p = new Product(6,"Vital",10.4);
		products.add(p);
		p = new Product(7,"Angkor",20.4);
		products.add(p);
		p = new Product(8,"Freshi",14.0);
		products.add(p);
		p = new Product(9,"Koi",1.72);
		products.add(p);
		p = new Product(10,"Amazon",5.4);
		products.add(p);
		p = new Product(11,"Mocha Frape",2.1);
		products.add(p);
	}
	
	@Override
	public List<Product> getAllProducts() {
		return products;
	}
}
