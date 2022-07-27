package com.example.bankapplication.balance;

import com.example.bankapplication.data.AccountBalanceData;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class BankBalanceServiceImpl implements BankBalanceService{

    @Override
    public BigDecimal getBankBalance(String accountNumber) {
        return AccountBalanceData.accountBalance(accountNumber);
    }
}
