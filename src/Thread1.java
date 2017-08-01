
public class Thread1 extends Thread{
	public void run(){
		method1();
	}
   public static void method1(){
	   try{
	   synchronized (String.class){
		System.out.println("locked String class");
		 Thread.sleep(1000);
	   }
	   synchronized(Integer.class){
		   System.out.println("locked Integer class");
	   }
		   
	   }catch(Exception e){
   }
	   
}
}