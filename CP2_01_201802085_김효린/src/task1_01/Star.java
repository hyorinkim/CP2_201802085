package task1_01;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line;
		Scanner sc =new Scanner(System.in);
		
		//1��
		System.out.print("��� �ٷ� ���� ����ҽο�?");
		line = sc.nextInt();
		System.out.println("---[1��]---");
		if(line>0) {
			for(int star=0;star<line;star++) { //�� ���� ��ŭ ����������� 
			for(int stamp=-1;stamp<star;stamp++) {//������ ��� ���� �� star�� ���� 1��ŭ ���� �Ҷ� ���� �ϳ��� �� �����鼭 �Ʒ�������������
				System.out.print("*");
				}
			System.out.println("");
		}
		}else for(int star=0;star<5;star++) { 
			for(int stamp=-1;stamp<star;stamp++) {
				System.out.print("*");
				}
			System.out.println("");
		}
		
		//2��
		System.out.print("��� �ٷ� ���� ����ұ��?");
		line=sc.nextInt();
		System.out.println("---2��---");
		if(line>0) {
			for(int star=line;star>0;star--) {//�Է¹��� �ٸ�ŭ �ݺ��ǰڱ�
				for(int stamp=0;stamp<star;stamp++) {//star�� -1��ũ �پ��鼭 ���� ������ ���� ���� �ϸ鼭 ���� ������ 1�� �پ��� ��������
					System.out.print("*");
			}
			System.out.println("");
			}
		}else for(int star=5;star>0;star--) {
					for(int stamp=0;stamp<star;stamp++) {
						System.out.print("*");
					}
				System.out.println("");
				}
		//3�� 
		System.out.print("��� �ٷ� ���� ����ұ��?");
		line=sc.nextInt();
		System.out.println("---3��---");
		
		//���� �Է� �޾Ƽ� ��Ÿ���� ���̾Ƹ�� ��� Ȧ�� �϶���
		if(line%2==1&&line>0) {
			for(int star=0;star<(line-1)/2+1;star++) {//�Է� ���� ���� 5���̶�� �߰����� ����⸦ �ϱ� ���ؼ� ������ (line-1)/2+1�̶� 3������ ������ ������ �ߴ�.
				for(int blank=0;blank<(line-1)/2-star;blank++) {//���̾Ƹ�� ������� ������ �� ������(line-1)/2�̴�.�׸��� ������� ������ ������ ����� ���������� �Ʒ������� ������ -1��ŭ�� �������� ���� 
				System.out.print(" ");//(line-1)/2-star�� 0�̵ɶ� (������� �������� ���� ��� �� �϶�)for ���� �߻����� ����
				}
				for(int stamp=0;stamp<2*star+1;stamp++) {//���ǽ� ������ �Ʒ������� �� ���� ���� ������ 2�� ���� �ϸ鼭 ����
					System.out.print("*");
				}
			System.out.println("");
			}
			//�Ƕ�̵� 2���� ����� ������,�����Ƕ�̵�Ʒ��� ���������� ����
		
			for(int star=0;star<(line-1)/2;star++) {
				for(int blank=-1;blank<star;blank++) {
					System.out.print(" ");
				}
				for(int stamp=line-2;stamp>star*2;stamp--) {//���� ������ ���� ��� ������ ���� ������ 2�� ���̳��� line-2�� ����
					System.out.print("*");
				}
				System.out.println("");
			}
		}else if(line<=0) {
			for(int star=0;star<5;star++) {//5������ ����⸦ �ϱ� ���ؼ�
				for(int blank=0;blank<4-star;blank++) {//4-star�� 0�̵ɶ� for ���� �߻����� ����
				System.out.print(" ");
				}
				for(int stamp=0;stamp<2*star+1;stamp++) {
					System.out.print("*");
				}
			System.out.println("");
			}
			//�Ƕ�̵� 2���� ����� ������,�����Ƕ�̵�Ʒ��� ���������� ����
		
			for(int star=0;star<4;star++) {
				for(int blank=-1;blank<star;blank++) {
					System.out.print(" ");
				}
				for(int stamp=7;stamp>star*2;stamp--) {
					System.out.print("*");
				}
				System.out.println("");
			}
			//�Ʒ����Ƕ�̵� �Ʒ��� ���� �� ���� ����
		}else System.out.println("¦���� ó�� ���� �ʽ��ϴ�.");
		sc.close();
	}
}
