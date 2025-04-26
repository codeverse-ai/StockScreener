package com.app.funds.controller;

import com.app.funds.dto.FundDTO;
import com.app.funds.dto.FundFilterRequest;
import com.app.funds.service.MutualFundService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mutualfunds")
@RequiredArgsConstructor
public class MutualFundController {

    private final MutualFundService mutualFundService;

    @GetMapping
    public List<FundDTO> getAllFunds() {
        return mutualFundService.getAllFunds();
    }

    @GetMapping("/{schemeCode}")
    public FundDTO getFundBySchemeCode(@PathVariable String schemeCode) {
        return mutualFundService.getFundBySchemeCode(schemeCode);
    }

    @PostMapping("/filter")
    public List<FundDTO> filterFunds(@RequestBody FundFilterRequest filterRequest) {
        return mutualFundService.filterFunds(filterRequest);
    }

    @GetMapping("/categories")
    public List<String> getAllCategories() {
        return mutualFundService.getAllCategories();
    }

    @GetMapping("/compare")
    public List<FundDTO> compareFunds(@RequestParam List<String> codes) {
        return mutualFundService.compareFunds(codes);
    }
}
