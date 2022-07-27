package com.example.bankapplication.balance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankBalanceServiceImplTest {
    private BankBalanceServiceImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new BankBalanceServiceImpl();
    }

    @Test
    @DisplayName("get account balance for correct account number")
    void getBankBalance() {
        String accountNumber = "123456";
        BigDecimal expected = BigDecimal.valueOf(2000);
        BigDecimal result = underTest.getBankBalance(accountNumber);
        assertEquals(result, expected);
    }
}