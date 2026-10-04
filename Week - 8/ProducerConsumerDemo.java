class Buffer {

	private int value;
	private boolean available = false;

	synchronized void produce(int value) {

		try {
			while (available) {
				wait();
			}

			this.value = value;
			available = true;

			System.out.println("Produced: " + value);

			notify();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	synchronized void consume() {

		try {
			while (!available) {
				wait();
			}

			System.out.println("Consumed: " + value);

			available = false;

			notify();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}

class Producer extends Thread {

	Buffer buffer;

	Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {

		for (int i = 1; i <= 5; i++) {
			buffer.produce(i);
		}
	}
}

class Consumer extends Thread {

	Buffer buffer;

	Consumer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			buffer.consume();
		}
	}
}

public class ProducerConsumerDemo {

	public static void main(String[] args) {

		Buffer buffer = new Buffer();

		Producer p = new Producer(buffer);
		Consumer c = new Consumer(buffer);

		p.start();
		c.start();
	}
}
