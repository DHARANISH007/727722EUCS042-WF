package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.model.DharanishProduct;
import com.examly.springapp.service.DharanishProductService;

@RestController
public class DharanishProductController {
    @Autowired
    DharanishProductService service;

    @PostMapping("/api/Product")
    public ResponseEntity<DharanishProduct> postMethod(@RequestBody DharanishProduct s) {
        if (service.post(s)) {
            return new ResponseEntity<DharanishProduct>(s, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product")
    public ResponseEntity<List<DharanishProduct>> dndcjk() {
        List<DharanishProduct> page = service.getAll();
        if (!page.isEmpty()) {
            return new ResponseEntity<List<DharanishProduct>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/category/{productCategory}")
    public ResponseEntity<List<DharanishProduct>> getbyid(@PathVariable String productCategory) {
        List<DharanishProduct> p = service.getProduct(productCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<DharanishProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @GetMapping("/api/product/category/priceCategory/{priceCategory}")
    public ResponseEntity<List<DharanishProduct>> getbdyid(@PathVariable String priceCategory) {
        List<DharanishProduct> p = service.getProductbyprice(priceCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<DharanishProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
