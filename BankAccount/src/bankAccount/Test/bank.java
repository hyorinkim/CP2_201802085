package bankAccount.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bankAccount.BankAccount;

class bank {
	BankAccount account=new BankAccount("±Ë»ø∏∞",300000,0.1);

	@Test
	void testDeposit() {
		assertEquals(400000,account.deposit(100000));
	}

	@Test
	void testWithdraw() {
		assertEquals(200000,account.withdraw(100000));
	}

	@Test
	void testGetBalance() {
		assertEquals(300000,account.getBalance());
	}

	@Test
	void testGetName() {
		assertEquals("±Ë»ø∏∞", account.getName());
	}

	@Test
	void testInstallmentSavingPredict() {
		assertEquals(426500,account.installmentSavingPredict(12,10000));
	}

	@Test
	void testFixedDepositPredict() {
		assertEquals(2806899,account.fixedDepositPredict(24,2000000));
	}

}
