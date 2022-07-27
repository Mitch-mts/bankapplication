package com.example.bankapplication.api;

import com.example.bankapplication.dto.BankBalanceDto;
import com.example.bankapplication.balance.BankBalanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping(path = "/bank")
@Slf4j
public class BankBalanceRestController {
    private final BankBalanceService bankBalanceService;

    public BankBalanceRestController(BankBalanceService bankBalanceService) {
        this.bankBalanceService = bankBalanceService;
    }

    @GetMapping(path = "/balance/{accountNumber}")
    public ResponseEntity<BankBalanceDto> getBankBalance(@PathVariable String accountNumber){
        BigDecimal bankBalance = bankBalanceService.getBankBalance(accountNumber);
        return ResponseEntity.ok(BankBalanceDto.of(bankBalance));
    }
}
