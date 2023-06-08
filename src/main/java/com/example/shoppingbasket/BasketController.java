package com.example.shoppingbasket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class BasketController {
    private BasketServiceImpl basketService;

    public BasketController(BasketServiceImpl basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public String addProduct(@RequestParam("id") List<Integer> products){
            basketService.addProducts(products);
        return "Added: " + products.toString();
    }

    @GetMapping(path = "/get")
    public String getBasketProducts(){
            return basketService.getBasketInJSON();
    }

}
