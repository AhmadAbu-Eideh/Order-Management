package com.example.OrderManagement.ProductOrder;
import com.example.OrderManagement.Order.Order;
import com.example.OrderManagement.Product.Product;

import javax.persistence.*;


@Entity
@Table(name = "productOrders")
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "order_id",referencedColumnName = "id" )
    private Order order;
    private int quantity;
    private double price;
    private double VAT;

    public ProductOrder() {
    }

    public ProductOrder(Product product, Order order, int quantity, double price, double VAT) {
        this.product= product;
        this.order = order;
        this.quantity = quantity;
        this.price = price;
        this.VAT = VAT;
    }

    public Product getProductId() {
        return product;
    }

    public void setProductId(int productId) {
        this.product = product;
    }

    public Order getOrderId() {
        return order;
    }

    public void setOrderId(int orderId) {
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
}
