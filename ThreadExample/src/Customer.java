
public class Customer implements Runnable {
	public Counter c;

	@Override
	public void run() {
		c = Counter.getInstance();
		while (true) {
			try {
				if (!c.decreament()) {
					System.out.println(Thread.currentThread().getName() + "持续等待");
				}
				Thread.sleep(5000);
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
