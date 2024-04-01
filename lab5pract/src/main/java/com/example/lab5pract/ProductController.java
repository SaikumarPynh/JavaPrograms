package com.example.lab5pract;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class ProductController {
private List<Product> products = new ArrayList<>();
@GetMapping("/get")
public List<Product> getProduct() {
	return products;
}
@PostMapping("/post")
public ResponseEntity<?> addProduct(@Valid @RequestBody Product product, BindingResult result){
	List<String> getErrors = new ArrayList<>();
	if(result.hasErrors()) {
		List<FieldError> errors = result.getFieldErrors();
		for(FieldError err:errors) {
			getErrors.add(err.getField() + ":" + err.getDefaultMessage());
		}
		return ResponseEntity.badRequest().body(getErrors);
	}
	products.add(product);
	return ResponseEntity.status(HttpStatus.CREATED).body(product);
}
}
