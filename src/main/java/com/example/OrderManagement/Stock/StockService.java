package com.example.OrderManagement.Stock;
import com.example.OrderManagement.Order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class StockService {

    private final StockRepository stockRepository;

    @Autowired
    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }
    public List<Stock> getStocks()
    {
        return stockRepository.findAll();
    }
    public Stock getStockByID(int id)
    {
        return stockRepository.findById(id).get();
    }
    public void addStock(Stock stock)
    {
        stockRepository.save(stock);
    }
}
