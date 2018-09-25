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
		System.out.println("게임을 시작합니다.");
		System.out.println("항아리에는 14개의 아이템이 있습니다.");
		System.out.println(chocolateJar.status());
		System.out.println("1~3개의 아이템을  꺼낼 수 있으며 칠리를 꺼내면 패배합니다.");
		System.out.println("시작!!");
		// 게임룰을 설명
		while (chocolateJar.isEmpty() == false) {
			// 게임을 종료할 조건 초콜릿이 0이 될 때

			System.out.println("+------ " + round + "번째 턴! ------+");
			System.out.print("몇개를 뽑을까요?(1~3)");
			number = sc.nextInt();// 초콜릿 뽑는 갯수
			if (number < 4 && number > 0) {// 초콜릿을 1에서 3까지만 입력 받을 수 있게 함
				chocolateJar.takeItem(number);// 초콜릿 뽑음
				if (chocolateJar.getChilli() == 0) {
					System.out.println("플레이어가 칠리를 뽑았습니다.");
					System.out.println("컴퓨터가 이겼습니다.");
					break;// 게임중 플레이어가 칠리를 뽑았을때
				} else
					System.out.println("플레이어는 " + number + "개의 초콜릿을 꺼냈습니다.");

				System.out.println(chocolateJar.status());
				if (chocolateJar.getChocolate() == 0) {// 플레이어가 칠리를 남기고 초콜릿을 다 뽑았을 때
					System.out.println("플레이어가 이겼습니다.");
					break;
				}
				maxtake = Math.min(3, chocolateJar.getItem() - 1);
				take = random.nextInt(1000) % maxtake % 3 + 1;
				// 컴퓨터가 뽑는 수를 정할 코드
				System.out.println("컴퓨터는 " + take + "개의 초콜릿을 꺼냈습니다.");
				chocolateJar.takeItem(take);
				System.out.println(chocolateJar.status());
				if (chocolateJar.getChocolate() == 0) {
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				}
				round++;
			}else System.out.println("1~3개의 숫자만 입력해 주세요");
		}
	sc.close();}
}
