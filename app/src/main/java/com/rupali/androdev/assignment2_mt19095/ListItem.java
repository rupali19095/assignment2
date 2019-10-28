package com.rupali.androdev.assignment2_mt19095;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListItem {
    private String item_name;
    private String price;

    ListItem(String item_name, String price) {
        this.item_name = item_name;
        this.price = price;
    }

    public String getItem_name() {
        return item_name;
    }

    public String getPrice() {
        return price;
    }
}


