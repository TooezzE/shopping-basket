package com.example.shoppingbasket;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
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
