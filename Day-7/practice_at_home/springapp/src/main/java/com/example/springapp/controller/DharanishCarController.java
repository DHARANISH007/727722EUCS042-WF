package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.DharanishCar;
import com.example.springapp.service.DharanishCarJava;

@RestController
public class DharanishCarController {
    @Autowired
    private DharanishCarJava carService;

    @PostMapping("/api/car")
    public ResponseEntity<DharanishCar> post(@RequestBody DharanishCar car) {
        if (carService.post(car)) {
            return new ResponseEntity<>(car, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/car")
    public ResponseEntity<List<DharanishCar>> getAll() {
        List<DharanishCar> li = carService.getAll();
        if (li.size() > 0) {
            return new ResponseEntity<>(li, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/car/distinct")
    public ResponseEntity<DharanishCar> getbyDistinct(@RequestParam String currentOwnerName, @RequestParam String address) {
        DharanishCar car = carService.getByDetails(currentOwnerName, address);
        if (car != null) {
            return new ResponseEntity<>(car, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
