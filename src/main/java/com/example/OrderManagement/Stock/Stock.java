package com.example.OrderManagement.Stock;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "stocks")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name= "product_id",referencedColumnName = "id")
    private int productId;
    private int quantity;
    private Date updateAt;

    public Stock() {
    }

    public Stock(int id, int productId, int quantity, Date updateAt) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.updateAt = updateAt;
    }

    public Stock(int productId, int quantity, Date updateAt) {
        this.productId = productId;
        this.quantity = quantity;
        this.updateAt = updateAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
