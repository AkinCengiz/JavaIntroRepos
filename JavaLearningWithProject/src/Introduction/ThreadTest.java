package Introduction;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter1 = new Counter("Sayac 1",500);
		Thread t1 = new Thread(counter1);
		t1.start();
		
		Counter counter2 = new Counter("Sayac 2",1000);
		Thread t2 = new Thread(counter2);
		t2.start();
		
		System.out.println("Bitti...");
	}

}
