class MyThread extends Thread {
 
	@Override
	public void run() {
    	System.out.println("Thread created using Thread class");
	}
}
class MyRunnable implements Runnable {
	@Override
	public void run() {
    	System.out.println("Thread created using Runnable interface");
	}
}
public class ThreadCreationDemo {
 
	public static void main(String[] args) {
 
    	MyThread t1 = new MyThread();
    	MyRunnable r = new MyRunnable();
    	Thread t2 = new Thread(r);
 
    	t1.start();
    	t2.start();
	}
}
