package com.example.myapplication;

public class Goods {

    private String shopName;
    private String price;
    private int imageGoods;

    public Goods(String shopName, String price, int imageGoods) {
        this.shopName = shopName;
        this.price = price;
        this.imageGoods = imageGoods;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageGoods() {
        return imageGoods;
    }

    public void setImageGoods(int imageGoods) {
        this.imageGoods = imageGoods;
    }
}
