package bankAccount;

public class BankAccount {
	private long balance;
	private int accountnum;
	private double rate;
	private String name;
	
	public BankAccount(String n,int m, double r){
		name=n;
		rate=r;
		balance=m;
	}
	
	public long deposit(long money) {
		return balance+=money;
	}
	//잔액보다 큰돈을 출금 하지 못하게 함
	public long withdraw(long money) {
		if(money>balance) {
			System.out.println("잔액이 부족 합니다.");
			System.out.println("현재 남아있는 잔액은"+getBalance()+"원 입니다.");
		}else balance-=money;
		return balance;
		}
	
	public long getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public long installmentSavingPredict (int month, int money) {
		return (long)(+balance+money*rate/12*(month * (month + 1)/2) + money * month);
	}
	
	public long fixedDepositPredict(int month, int money) {
		return (long)(balance+money+(money+balance)*(Math.pow((1+(rate / 12)),month) - 1));
	}
	
}

