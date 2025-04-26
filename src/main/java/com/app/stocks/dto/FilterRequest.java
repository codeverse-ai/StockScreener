package com.app.stocks.dto;

import lombok.Data;

@Data
public class FilterRequest {
    private String sector;
    private Double peRatioMin;
    private Double peRatioMax;
    private Long marketCapMin;
    private Double roeMin;
}
