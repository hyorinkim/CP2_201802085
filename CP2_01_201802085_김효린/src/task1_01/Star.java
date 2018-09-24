package task1_01;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line;
		Scanner sc =new Scanner(System.in);
		
		//1번
		System.out.print("몇개의 줄로 별을 출력할싸요?");
		line = sc.nextInt();
		System.out.println("---[1번]---");
		if(line>0) {
			for(int star=0;star<line;star++) { //줄 갯수 만큼 별을만들려고 
			for(int stamp=-1;stamp<star;stamp++) {//실제로 찍기 위한 것 star의 수가 1만큼 증가 할때 별이 하나씩 더 찍히면서 아래층으로찍혀감
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
		
		//2번
		System.out.print("몇개의 줄로 별을 출력할까요?");
		line=sc.nextInt();
		System.out.println("---2번---");
		if(line>0) {
			for(int star=line;star>0;star--) {//입력받은 줄만큼 반복되겠금
				for(int stamp=0;stamp<star;stamp++) {//star가 -1만크 줄어들면서 별이 찍히는 점점 감소 하면서 찍힘 층마다 1씩 줄어들게 별이찍힘
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
		//3번 
		System.out.print("몇개의 줄로 별을 출력할까요?");
		line=sc.nextInt();
		System.out.println("---3번---");
		
		//줄을 입력 받아서 나타나는 다이아몬드 양수 홀수 일때만
		if(line%2==1&&line>0) {
			for(int star=0;star<(line-1)/2+1;star++) {//입력 받은 줄이 5층이라면 중간까지 별찍기를 하기 위해서 공식이 (line-1)/2+1이라서 3층까지 찍히는 식으로 했다.
				for(int blank=0;blank<(line-1)/2-star;blank++) {//다이아몬드 빈공간이 찍히는 층 갯수는(line-1)/2이다.그리고 빈공간이 찍히는 개수도 빈공간 층개수에서 아래층으로 갈수록 -1만큼씩 빠진수가 찍힘 
				System.out.print(" ");//(line-1)/2-star가 0이될때 (빈공간이 안찍히는 가장 가운데 층 일때)for 문이 발생되지 않음
				}
				for(int stamp=0;stamp<2*star+1;stamp++) {//조건식 때문에 아래층으로 갈 수록 별의 갯수가 2씩 증가 하면서 찍힘
					System.out.print("*");
				}
			System.out.println("");
			}
			//피라미드 2개로 나누어서 생각함,위쪽피라미드아래로 내려갈수록 증가
		
			for(int star=0;star<(line-1)/2;star++) {
				for(int blank=-1;blank<star;blank++) {
					System.out.print(" ");
				}
				for(int stamp=line-2;stamp>star*2;stamp--) {//별의 갯수가 가장 가운데 찍히는 별의 갯수랑 2개 차이나서 line-2로 잡음
					System.out.print("*");
				}
				System.out.println("");
			}
		}else if(line<=0) {
			for(int star=0;star<5;star++) {//5층까지 별찍기를 하기 위해서
				for(int blank=0;blank<4-star;blank++) {//4-star가 0이될때 for 문이 발생되지 않음
				System.out.print(" ");
				}
				for(int stamp=0;stamp<2*star+1;stamp++) {
					System.out.print("*");
				}
			System.out.println("");
			}
			//피라미드 2개로 나누어서 생각함,위쪽피라미드아래로 내려갈수록 증가
		
			for(int star=0;star<4;star++) {
				for(int blank=-1;blank<star;blank++) {
					System.out.print(" ");
				}
				for(int stamp=7;stamp>star*2;stamp--) {
					System.out.print("*");
				}
				System.out.println("");
			}
			//아래쪽피라미드 아래로 내려 갈 수록 감소
		}else System.out.println("짝수는 처리 하지 않습니다.");
		sc.close();
	}
}
