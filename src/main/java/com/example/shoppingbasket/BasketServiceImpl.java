package com.example.shoppingbasket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope(scopeName = "prototype")
public class BasketServiceImpl {
    private Basket basket;

    public BasketServiceImpl() {
        this.basket = new Basket();
    }

    public void addProducts(List<Integer> products){
       basket.setProductsIds(products);
    }

    public String getBasketInJSON() {
        return basket.toString();
    }
}
