package philosopher;

public class Main {
	static Philosopher[] philosophers;
	static ForkNumber fork;
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		int number =5;
		fork= new ForkNumber(number);
		Fork[] forks = new Fork[number];
		for(int i=0; i<5;i++) {
			forks[i]=new Fork(i);
		}
		philosophers = new Philosopher[number];
		for(int i=0; i<number;i++ ) {
			philosophers[i]=new Philosopher(i,forks[i],forks[(i+1)%number]);
		}
		for(int i=0;i<number;i++) {
			(new Thread(philosophers[i])).start();
		}
	}

}
