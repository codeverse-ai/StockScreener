package com.app.funds.service;

import com.app.funds.dto.FundDTO;
import com.app.funds.dto.FundFilterRequest;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class MutualFundService {

    private static final List<FundDTO> MOCK_FUNDS = List.of(
            new FundDTO("100001", "HDFC Equity Fund", "Equity", "High", 3.1, 18.6, 15000),
            new FundDTO("100002", "ICICI Balanced Advantage", "Hybrid", "Moderate", 1.5, 12.3, 22000),
            new FundDTO("100003", "SBI Bluechip Fund", "Equity", "Moderate", 2.2, 15.9, 18000),
            new FundDTO("100004", "Axis Short Term Fund", "Debt", "Low", 0.6, 7.2, 10500)
    );

    public List<FundDTO> getAllFunds() {
        return MOCK_FUNDS;
    }

    public FundDTO getFundBySchemeCode(String schemeCode) {
        return MOCK_FUNDS.stream()
                .filter(f -> f.getSchemeCode().equals(schemeCode))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Fund not found"));
    }

    public List<String> getAllCategories() {
        return MOCK_FUNDS.stream()
                .map(FundDTO::getCategory)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<FundDTO> compareFunds(List<String> codes) {
        return MOCK_FUNDS.stream()
                .filter(f -> codes.contains(f.getSchemeCode()))
                .collect(Collectors.toList());
    }

    public List<FundDTO> filterFunds(FundFilterRequest req) {
        return MOCK_FUNDS.stream()
                .filter(f -> req.getCategory() == null || f.getCategory().equalsIgnoreCase(req.getCategory()))
                .filter(f -> req.getRiskLevel() == null || f.getRiskLevel().equalsIgnoreCase(req.getRiskLevel()))
                .filter(f -> req.getMinReturn5Y() == null || f.getReturn5Y() >= req.getMinReturn5Y())
                .filter(f -> req.getMaxExpenseRatio() == null || f.getExpenseRatio() <= req.getMaxExpenseRatio())
                .filter(f -> req.getMinAumCrore() == null || f.getAumCrore() >= req.getMinAumCrore())
                .collect(Collectors.toList());
    }
}
