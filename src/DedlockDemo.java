
public class DedlockDemo  {

	public static void main(String[] args) {
		Thread1 deadlockThread1 = new Thread1();
		Thread2 deadlockThread2 = new Thread2();

		deadlockThread1.start();
		deadlockThread2.start();
        	
        }
	}


