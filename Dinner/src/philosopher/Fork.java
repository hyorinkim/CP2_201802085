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
		System.out.println("["+i+"]철학자가["+n+"]포크를 들었습니다.");
		Main.fork.decrement();
		this.notifyAll();
		up_down=true;
	}
	synchronized void down(int i) {
		if(up_down==true) {
		System.out.println("["+i+"]철학자가["+n+"]포크를 놓았습니다.");	
		Main.fork.increment();
		this.notifyAll();
		up_down=false;
		}
	}
}
