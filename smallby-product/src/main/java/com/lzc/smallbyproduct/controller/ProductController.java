package com.lzc.smallbyproduct.controller;

import com.lzc.smallbyproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @AUTHOR HG-captain
 * @Data 2020/1/6
 * @Description
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/getAll")
    public List getProductAll(){
        System.out.println("产品全查");
        return productService.getProductAll();
    }
}
