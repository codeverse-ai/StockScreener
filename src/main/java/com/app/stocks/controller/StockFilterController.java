package com.app.stocks.controller;

import com.app.stocks.dto.FilterRequest;
import com.app.stocks.dto.StockDTO;
import com.app.stocks.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stocks")
@RequiredArgsConstructor
public class StockFilterController {

    private final StockService stockService;

    @PostMapping("/filter")
    public List<StockDTO> filterStocks(@RequestBody FilterRequest filterRequest) {
        return stockService.filterStocks(filterRequest);
    }
}
