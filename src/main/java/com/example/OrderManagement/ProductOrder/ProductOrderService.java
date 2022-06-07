package com.example.OrderManagement.ProductOrder;
import com.example.OrderManagement.Order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProductOrderService {

    final private ProductOrderRepository productOrderRepository;

    @Autowired
    public ProductOrderService(ProductOrderRepository productOrderRepository) {
        this.productOrderRepository = productOrderRepository;
    }
    public List<ProductOrder> getProductOrders()
    {
        return productOrderRepository.findAll();
    }
    public ProductOrder getProductOrderByID(int id)
    {
        return  productOrderRepository.findById(id).get();
    }
    public void addProductOrder(ProductOrder Productorder)
    {
        productOrderRepository.save(Productorder);
    }
}
