package com.spring.boot.aop.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public void printAllProduct(){
        System.out.println("Print all products ");

    }

}
