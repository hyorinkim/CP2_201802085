package ChocolateJar;

import java.util.Random;
import java.util.Scanner;

public class ChocolateJarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int round = 1;
		int maxtake;
		int take;
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		ChocolateJar chocolateJar = new ChocolateJar();
		System.out.println("������ �����մϴ�.");
		System.out.println("�׾Ƹ����� 14���� �������� �ֽ��ϴ�.");
		System.out.println(chocolateJar.status());
		System.out.println("1~3���� ��������  ���� �� ������ ĥ���� ������ �й��մϴ�.");
		System.out.println("����!!");
		// ���ӷ��� ����
		while (chocolateJar.isEmpty() == false) {
			// ������ ������ ���� ���ݸ��� 0�� �� ��

			System.out.println("+------ " + round + "��° ��! ------+");
			System.out.print("��� �������?(1~3)");
			number = sc.nextInt();// ���ݸ� �̴� ����
			if (number < 4 && number > 0) {// ���ݸ��� 1���� 3������ �Է� ���� �� �ְ� ��
				chocolateJar.takeItem(number);// ���ݸ� ����
				if (chocolateJar.getChilli() == 0) {
					System.out.println("�÷��̾ ĥ���� �̾ҽ��ϴ�.");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					break;// ������ �÷��̾ ĥ���� �̾�����
				} else
					System.out.println("�÷��̾�� " + number + "���� ���ݸ��� ���½��ϴ�.");

				System.out.println(chocolateJar.status());
				if (chocolateJar.getChocolate() == 0) {// �÷��̾ ĥ���� ����� ���ݸ��� �� �̾��� ��
					System.out.println("�÷��̾ �̰���ϴ�.");
					break;
				}
				maxtake = Math.min(3, chocolateJar.getItem() - 1);
				take = random.nextInt(1000) % maxtake % 3 + 1;
				// ��ǻ�Ͱ� �̴� ���� ���� �ڵ�
				System.out.println("��ǻ�ʹ� " + take + "���� ���ݸ��� ���½��ϴ�.");
				chocolateJar.takeItem(take);
				System.out.println(chocolateJar.status());
				if (chocolateJar.getChocolate() == 0) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					break;
				}
				round++;
			}else System.out.println("1~3���� ���ڸ� �Է��� �ּ���");
		}
	sc.close();}
}
