package com.example.bankapplication.dto;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@Data
public class BankBalanceDto {
    private BigDecimal amount;

    private BankBalanceDto(BigDecimal amount){
        this.amount = amount;
    }

    public static BankBalanceDto of(BigDecimal amount) {
        return new BankBalanceDto(amount);
    }
}
