package com.example.OrderManagement.Product;
import com.example.OrderManagement.ProductOrder.ProductOrder;
import com.example.OrderManagement.Stock.Stock;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String slug;
    private String name;
    private String reference;
    private double price;
    private double VAT;
    private boolean stockable;


   List<Product> productList=new ArrayList<>();

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Product() {
    }

    public Product(int id, String slug, String name, String reference, double price, double VAT, boolean stockable) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.reference = reference;
        this.price = price;
        this.VAT = VAT;
        this.stockable = stockable;
    }

    public Product(String slug, String name, String reference, double price, double VAT, boolean stockable) {
        this.slug = slug;
        this.name = name;
        this.reference = reference;
        this.price = price;
        this.VAT = VAT;
        this.stockable = stockable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public boolean isStockable() {
        return stockable;
    }

    public void setStockable(boolean stockable) {
        this.stockable = stockable;
    }
}
