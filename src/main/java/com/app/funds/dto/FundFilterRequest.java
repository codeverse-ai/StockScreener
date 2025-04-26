
package com.app.funds.dto;

import lombok.Data;

@Data
public class FundFilterRequest {
    private String category;
    private String riskLevel;
    private Double minReturn5Y;
    private Double maxExpenseRatio;
    private Integer minAumCrore;
}
