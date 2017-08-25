
public class Producer implements Runnable {
	public Counter c;

	@Override
	public void run() {
		this.c = Counter.getInstance();
		while (true) {
			c.increament();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(Thread.currentThread().getName() + "被打断了");
				break;
			}
		}
		System.out.println(Thread.currentThread().getName() + "结束");
		Thread.interrupted();
	}
}
