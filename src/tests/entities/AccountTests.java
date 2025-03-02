package tests.entities;

import entities.Account;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import tests.factory.AccountFactory;

public class AccountTests {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        double amount = 200.0;
        double expectedValue = 196.0;
        Account account = AccountFactory.createEmptyAccount();

        account.deposit(amount);

        Assertions.assertEquals(expectedValue, account.getBalance());
    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount() {

        double expectedValue = 100.0;
        Account account = AccountFactory.createAccount(expectedValue);
        double amount = -200.0;

        account.deposit(amount);

        Assertions.assertEquals(expectedValue, account.getBalance());
    }

    @Test
    public void fullWithdrawShouldClearBalanceAndReturnFullBalance() {

        double expectedValue = 0.0;
        double initialBalance = 800.0;
        Account account = AccountFactory.createAccount(initialBalance);

        double result = account.fullWithdraw();

        Assertions.assertTrue(expectedValue == account.getBalance());
        Assertions.assertTrue(result == initialBalance);
    }
}
