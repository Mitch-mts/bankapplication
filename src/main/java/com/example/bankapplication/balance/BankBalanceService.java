package com.example.bankapplication.balance;

import java.math.BigDecimal;

public interface BankBalanceService {
    BigDecimal getBankBalance(String accountNumber);
}
