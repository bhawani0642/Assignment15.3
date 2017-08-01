
public class Thread2 extends Thread {
	public void run(){
		method2();
	}
	public static void method2(){
		try{
		synchronized(Integer.class){
			System.out.println("Integer class locked");
			Thread.sleep(1000);
		}
		synchronized (String.class) {
			System.out.println("String class locked");
			Thread.sleep(1000);
		}
	}catch(Exception e){
	}
}
	
}
