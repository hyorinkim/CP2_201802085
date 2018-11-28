package philosopher;

public class Fork {
	
	private int n;
	boolean up_down;
	
	public Fork(int n) {
	this.n=n;
	this.up_down=false;
	}
	
	synchronized void up(int i)throws InterruptedException {
		while(up_down) {
			this.wait();
		}
		System.out.println("["+i+"]ö���ڰ�["+n+"]��ũ�� ������ϴ�.");
		Main.fork.decrement();
		this.notifyAll();
		up_down=true;
	}
	synchronized void down(int i) {
		if(up_down==true) {
		System.out.println("["+i+"]ö���ڰ�["+n+"]��ũ�� ���ҽ��ϴ�.");	
		Main.fork.increment();
		this.notifyAll();
		up_down=false;
		}
	}
}
