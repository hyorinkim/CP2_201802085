package philosopher;

import java.util.Random;

public class Philosopher extends Thread {
	Fork left;
	Fork right;
	int phil;// 철학자 번호
	private Random random;
	boolean r_hold;
	boolean eaten;// 식사를 마침
	boolean termination;// 종료

	Philosopher(int phil, Fork left, Fork right) {
		this.phil = phil;
		this.left = left;
		this.right = right;
		this.r_hold = false;
		this.eaten = false;
		this.termination = false;
		random = new Random();
	}

	public void up() throws InterruptedException {
		left.up(phil);

		if (Main.fork.getNum() > 0) {
			synchronized (this) {
				r_hold = true;
				right.up(phil);
				System.out.println("[" + phil + "] 철학자 먹는 중 ...");
				eaten = true;
			}
		}
	}
	public void down() throws InterruptedException{
		synchronized(this) {
			left.down(phil);
		}
		synchronized(this) {
			if(r_hold==true) {
				r_hold=false;
				right.down(phil);
			}
			System.out.println("[" + phil + "] 철학자 생각중 ...");
			Thread.sleep(random.nextInt(101));
		}
	}
	public void run() {
		while(!termination) {
			try {
				up();
				down();
				if(eaten==true) {
				termination=true;	
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
