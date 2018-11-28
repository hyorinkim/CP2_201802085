package philosopher;

public class ForkNumber {
	private int forknum;
	
	public ForkNumber(int num) {
		this.forknum=num;
	}
	public synchronized void increment() {
		forknum++;
	}
	public synchronized void decrement() {
		forknum--;
	}
	public synchronized int getNum() {
		return forknum;
	}
}
