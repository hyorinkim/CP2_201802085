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
	//�ܾ׺��� ū���� ��� ���� ���ϰ� ��
	public long withdraw(long money) {
		if(money>balance) {
			System.out.println("�ܾ��� ���� �մϴ�.");
			System.out.println("���� �����ִ� �ܾ���"+getBalance()+"�� �Դϴ�.");
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

