package com.accenture.redhattraining.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping(value = "hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> hello() {
        List<String> list = new ArrayList<>();
        list.add("This is red hat training demo");

        if (!list.isEmpty())
            return new ResponseEntity<>(list, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @GetMapping(value = "api/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getAllCustomers() {
        List<String> list = new ArrayList<>();
        list.add("This is test app");
        list.add("Date: " + new Date().toString());

        if (!list.isEmpty())
            return new ResponseEntity<>(list, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
