package com.app.stocks.service;

import com.app.stocks.dto.FilterRequest;
import com.app.stocks.dto.StockDTO;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class StockService {

    private static final List<StockDTO> MOCK_STOCKS = List.of(
            new StockDTO("RELIANCE.NS", "Reliance Industries", "Energy", 24.5, 18.2, 1800000000000L),
            new StockDTO("INFY.NS", "Infosys", "IT", 21.0, 22.5, 780000000000L),
            new StockDTO("TCS.NS", "Tata Consultancy", "IT", 29.5, 26.1, 1200000000000L),
            new StockDTO("HDFCBANK.NS", "HDFC Bank", "Finance", 18.3, 15.7, 900000000000L)
    );


    public List<StockDTO> filterStocks(FilterRequest req) {
        return MOCK_STOCKS.stream()
                .filter(stock -> req.getSector() == null || stock.getSector().equalsIgnoreCase(req.getSector()))
                .filter(stock -> req.getPeRatioMin() == null || stock.getPeRatio() >= req.getPeRatioMin())
                .filter(stock -> req.getPeRatioMax() == null || stock.getPeRatio() <= req.getPeRatioMax())
                .filter(stock -> req.getMarketCapMin() == null || stock.getMarketCap() >= req.getMarketCapMin())
                .filter(stock -> req.getRoeMin() == null || stock.getRoe() >= req.getRoeMin())
                .collect(Collectors.toList());
    }

    public List<StockDTO> getAllStocks() {
        return MOCK_STOCKS;
    }

    public StockDTO getStockBySymbol(String symbol) {
        return MOCK_STOCKS.stream()
                .filter(stock -> stock.getSymbol().equalsIgnoreCase(symbol))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Stock not found"));
    }

    public List<String> getAllSectors() {
        return MOCK_STOCKS.stream()
                .map(StockDTO::getSector)
                .distinct()
                .collect(Collectors.toList());
    }

    public Map<String, String> getMarketCapCategories() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Large Cap", "Top 100 listed companies by market capitalization");
        map.put("Mid Cap", "101st to 250th companies");
        map.put("Small Cap", "251st onwards");
        return map;
    }

    public List<StockDTO> compareStocks(List<String> symbols) {
        return MOCK_STOCKS.stream()
                .filter(stock -> symbols.contains(stock.getSymbol()))
                .collect(Collectors.toList());
    }
}