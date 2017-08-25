import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class A {
	private String name;

	public A(String name) {
		this.name = name;
		getName();
	}

	public void getName() {
		System.out.println("A.NAME=" + name);
	}
}

class B extends A {
	private String name;

	public B(String name) {
		super(name);
		this.name = name;
		getName();
	}

	public void getName() {
		System.out.println("B.NAME=" + name);
	}
}

public class Main {
	public static void main(String args[]) throws InterruptedException {
		// A c=new B("name");
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4); 
		Producer a=new Producer();
		Customer b=new Customer();
		Thread thread1 = new Thread(a);
		thread1.setName("Produce");
		thread1.start();
		while(true) {
			fixedThreadPool.execute(b);
		}
	}

}
