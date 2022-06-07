package com.example.OrderManagement.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getProducts()
    {
        return productRepository.findAll();
    }
    public Product getProductByID(int id)
    {
        return productRepository.findById(id).get();
    }
    public void addProduct(Product product)
    {
        productRepository.save(product);
    }
}
