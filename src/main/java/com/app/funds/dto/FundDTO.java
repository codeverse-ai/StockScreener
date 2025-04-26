package com.app.funds.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FundDTO {
    private String schemeCode;
    private String schemeName;
    private String category;
    private String riskLevel;
    private double expenseRatio;
    private double return5Y;
    private int aumCrore;
}