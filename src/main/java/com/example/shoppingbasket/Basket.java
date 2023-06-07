package com.example.shoppingbasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Integer> productsIds;


    public Basket() {
        this.productsIds = new ArrayList<>();
    }

    public void setProductsIds(List<Integer> products) {
        for (Integer product : products) {
            productsIds.add(product);
        }
    }

    @Override
    public String toString() {
        return  "Basket{" +
                "productsIds=" + productsIds.toString()
                + "}";

    }
}
