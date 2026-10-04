class MyThread extends Thread {
 
	MyThread() {
    	super("Child Thread");
	}
 
	@Override
	public void run() {
    	for (int i = 1; i <= 5; i++) {
        	System.out.println("Child Thread: " + i);
    	}
	}
}
 
public class ThreadConstructorDemo {
	public static void main(String[] args) {
 
    	MyThread t = new MyThread();
    	t.start();
    	System.out.println("Started thread: " + t.getName());
 
    	for (int i = 1; i <= 5; i++) {
        	System.out.println("Main Thread: " + i);
    	}
	}
}