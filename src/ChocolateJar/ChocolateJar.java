package ChocolateJar;

public class ChocolateJar implements Jar {

	private int chocolate;
	private int chilli;

	public ChocolateJar() {
		chocolate = 13;
		chilli = 1;
	}

	public ChocolateJar(int choco) {
		chocolate = choco;
		chilli = 1;
	}

	@Override
	public int getItem() {
		// TODO Auto-generated method stub

		return chocolate + chilli;
	}

	public int getChocolate() {
		return chocolate;
	}

	public int getChilli() {
		return chilli;
	}

	@Override
	public void takeItem(int hand) {
		// TODO Auto-generated method stub

		if (chocolate >= hand) {// 뽑는 수 만큼의 초콜릿이 남아 있을때
			chocolate -= hand;
		} else if (chocolate < hand) { // 뽑는수가 초콜릿 수 보다 더 많아서 칠리까지 뽑게 되었을때
			chocolate = 0;
			chilli = 0;
		}
	}

	@Override
	public String status() {
		String chil = "";
		String choco = "";
		for (int i = 0; i < chilli; i++) {
			chil += " ■";
		}
		for (int i = 0; i < chocolate; i++) {
			choco += " □";
		}
		return "[" + chil + choco + " ]";
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (chocolate == 0 && chilli == 0) {
			return true;
		}
		return false;
	}

}
