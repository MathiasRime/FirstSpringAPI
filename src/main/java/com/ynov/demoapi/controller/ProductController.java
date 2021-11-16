package com.ynov.demoapi.controller;

import com.ynov.demoapi.model.ProductModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

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
        ProductModel p1 = new ProductModel();
        p1.setName("name1");
        p1.setDescription("description1");
        p1.setCost(1);

        ProductModel p2 = new ProductModel();
        p2.setName("name2");
        p2.setDescription("description2");
        p2.setCost(2);

        List<ProductModel> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);

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
