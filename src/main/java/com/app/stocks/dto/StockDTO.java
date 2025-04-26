package com.app.stocks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StockDTO {
    private String symbol;
    private String companyName;
    private String sector;
    private Double peRatio;
    private Double roe;
    private Long marketCap;
}