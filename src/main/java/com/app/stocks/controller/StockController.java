package com.app.stocks.controller;

import com.app.stocks.dto.StockDTO;
import com.app.stocks.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/stocks")
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @GetMapping
    public List<StockDTO> getAllStocks() {
        return stockService.getAllStocks();
    }

    @GetMapping("/{symbol}")
    public StockDTO getStockBySymbol(@PathVariable String symbol) {
        return stockService.getStockBySymbol(symbol);
    }

    @GetMapping("/sectors")
    public List<String> getAllSectors() {
        return stockService.getAllSectors();
    }

    @GetMapping("/market-cap-categories")
    public Map<String, String> getMarketCapCategories() {
        return stockService.getMarketCapCategories();
    }

    @GetMapping("/compare")
    public List<StockDTO> compareStocks(@RequestParam List<String> symbols) {
        return stockService.compareStocks(symbols);
    }
}