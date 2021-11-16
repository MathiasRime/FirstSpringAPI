package com.ynov.demoapi.service;

import com.ynov.demoapi.model.ProductModel;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public ProductModel createNewRandomProduct()
    {
        ProductModel p = new ProductModel();
        p.setName("random product");
        p.setDescription("Un Produit");
        p.setCost(20);

        return p;
    }
}