package com.example.bankapplication.data;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class AccountBalanceData {
    final static String ACCOUNT_NUMBER = "123456";

    public static BigDecimal accountBalance(String accountNumber){
        if(accountNumber.equals(ACCOUNT_NUMBER)){
            return BigDecimal.valueOf(2000);
        }else{
            log.error("Invalid Account number provided");
            return BigDecimal.ZERO;
        }
    }
}
