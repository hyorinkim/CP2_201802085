package bankAccount;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("��ȿ��",300000,0.1);
		int money,month;
		
		System.out.println("���������� "+account.getName()+"�̰�, �ܾ��� "+account.getBalance()+"�Դϴ�.\n");
		
		//�Ա� �ó�����
		money =100000;//10���� �Ա�
		account.deposit(money);
		System.out.println("���¿�"+money+"���� �Ա��Ͽ�, �ܾ���"+account.getBalance()+"���� �Ǿ����ϴ�.");
		 
		//��� �ó�����
		money = 100000;//10���� ���
		account.withdraw(money);
		System.out.println("���¿� "+money+"���� ����Ͽ�, �ܾ���"+account.getBalance()+"���� �Ǿ����ϴ�.");
		
		//�ܾ� ���� ū ���� ��� �� �� 
		money=4000000;
		System.out.println(money+"���� ��� �Ϸ� �մϴ�.");
		account.withdraw(money);
		
		//���� �ó�����
		money =10000;//�ſ� 10000��
		month = 12;//12����
		System.out.println("�ſ�"+money+"����"+month+"���� �����ϸ�, �ܾ���"+account.installmentSavingPredict(month, money)+"���� �� ���Դϴ�.");
		
		//���� ���� �ó�����
		money = 2000000;
		month = 24;
		System.out.println(money+"����"+month+"���� ���� �����ϸ�, �ܾ���"+ account.fixedDepositPredict(month, money)+"���� �� ���Դϴ�.") ; 
		
		//�����ذ�1.200�� ���� �����ϰ�
		
		long longmoney;
		longmoney=20000000000L;
		account.deposit(longmoney);
		System.out.println("���¿�"+longmoney+"���� �Ա��Ͽ�, �ܾ���"+account.getBalance()+"���� �Ǿ����ϴ�.");//�ܾ���  �ùٷ� ������ ����
		
	}
}
