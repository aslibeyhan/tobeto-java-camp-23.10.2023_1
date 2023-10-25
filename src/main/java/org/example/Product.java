package org.example;

public class Product {
      private  int  id;

      private  String productName;
      private double unitPrice;
      private int unitInStock;

    public Product() {

    }

    public Product(int id, String productName, double unitPrice, int unitInStock) {
        this.id = id;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }
}
