package Threadsjava;

public class BasicThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++) {
		  Thread t=new Thread(()->System.out.println("thread running..."+Thread.currentThread().getName()));
		  t.start();
		}
		
		//System.out.println("well done"+Thread.currentThread().getName());

	}

}
