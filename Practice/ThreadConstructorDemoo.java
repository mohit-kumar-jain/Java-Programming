class Mythread extends  Thread{

    Mythread() {
        super("Child Thread");
    }
    @Override 
    public  void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread : "+(i+1));
        }
    }
}
public class ThreadConstructorDemoo {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();
        System.out.println("Started Thread: "+t1.getName());
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread : "+(i+1));
        }
    }
}
