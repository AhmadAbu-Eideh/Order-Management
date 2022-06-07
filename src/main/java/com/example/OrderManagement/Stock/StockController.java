package com.example.OrderManagement.Stock;

import com.example.OrderManagement.Product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {
    private StockService stockService;
    @Autowired
    public StockController(StockService stockService)
    {
        this.stockService=stockService;
    }
    @GetMapping("/getAllStocks")
    public List<Stock> getStocks()
    {
        return stockService.getStocks();
    }
    @GetMapping("/getStocksById")
    public Stock getStocksById(@PathVariable int id)
    {
        return stockService.getStockByID(id);
    }
    @PostMapping("/addStocks")
    public void addStocks(@RequestBody Stock stock)
    {
        stockService.addStock(stock);
    }
}
