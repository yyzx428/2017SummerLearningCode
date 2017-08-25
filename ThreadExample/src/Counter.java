
public class Counter {
	private volatile int c = 0;

	private Counter() {
	}

	private static class CounterHolder {
		private static final Counter instance = new Counter();
	}

	public static Counter getInstance() {
		return CounterHolder.instance;
	}

	public synchronized void increament() {
		c++;
		message(true);
	}

	public synchronized boolean decreament() {
		if (c > 0) {
			c--;
			message(false);
			return true;
		}
		return false;
	}
	
	private void message(boolean isproduce) {
		System.out.println(Thread.currentThread().getName()+(isproduce?"生产":"消费")+"一个");
		System.out.println("剩余:"+c);
	}
	public  int getValue() {
		return c;
	}
}
