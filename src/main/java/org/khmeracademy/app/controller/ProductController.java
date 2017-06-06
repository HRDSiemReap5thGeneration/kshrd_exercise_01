package org.khmeracademy.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.khmeracademy.app.model.Product;
import org.khmeracademy.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping(value={"/","/index"})
	public String index() {
		System.out.println("/index");

		return "index";
	}
	
	
	@RequestMapping("/products")
	public String products(ModelMap m){
		System.out.println("/products");
		List<Product> products = productService.getAllProducts();
		
		for(Product p : products)
			System.out.println(p);
		
		m.addAttribute("products", products);
		
		return "product";
	}
	
	@RequestMapping("/products/price")
	public String products_price(ModelMap m){
		System.out.println("/products/price");
		
		List<Product> products = productService.getAllProducts();
		List<Product> pro_filtered = new ArrayList<>();
		
		for(Product p : products)
			if(p.getPrice()<14.0)
				pro_filtered.add(p);
		
		for(Product p : pro_filtered)
			System.out.println(p);
		
		
		m.addAttribute("products", pro_filtered);
		
		return "product";
	}
}
