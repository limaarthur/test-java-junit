package tests.entities;

import entities.Account;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AccountTests {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        double amount = 200.0;
        double expectedValue = 196.0;
        Account account = new Account(1L, 0.0);

        account.deposit(amount);

        Assertions.assertEquals(expectedValue, account.getBalance());
    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount() {

        double expectedValue = 100.0;
        Account account = new Account(1L, expectedValue);
        double amount = -200.0;

        account.deposit(amount);

        Assertions.assertEquals(expectedValue, account.getBalance());
    }
}
