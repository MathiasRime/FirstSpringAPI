package com.ynov.demoapi.controller;

import com.ynov.demoapi.model.ProductModel;
import com.ynov.demoapi.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/product/{name}")
    public ProductModel getProductByName(@PathVariable("name") String name){
        //Simulate the code wich load an existing product by his name
        ProductModel p = new ProductModel();
        p.setName(name);
        p.setDescription("description");
        p.setCost(1);
        //End simulation

        return p;
    }

    @GetMapping("/product")
    public List<ProductModel> getProducts(){

        List<ProductModel> list = new ArrayList<>();
        list.add(service.createNewRandomProduct());
        list.add(service.createNewRandomProduct());

        return list;
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody ProductModel product){
        logger.info(
                product.getName() + " " +
                product.getDescription() + " " +
                product.getCost()
        );
    }
}
