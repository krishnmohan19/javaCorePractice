package Threadsjava;

import java.util.ArrayList;
import java.util.List;

import setdemo.Product;

class IdIncrement implements Runnable{
	
	Product e;
	
	public IdIncrement(Product p) {
		this.e=p;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		try {
			this.e.incrementId();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
}
public class ProductIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		List<Product> set=new ArrayList<>();
		Product p=new Product(1,"name1");
		Product p1=new Product(2,"name2");
		Product p2=new Product(3,"name3");
		Product p3=new Product(4,"name4");
		
		set.add(p);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		List<Thread> threads = new ArrayList<>();
		System.out.println(System.currentTimeMillis());
		for(Product pro:set) {
			IdIncrement task=new IdIncrement(pro);
			Thread t=new Thread(task);
			t.start();
			threads.add(t);
		}
		for(Thread t:threads) {
			try {
				t.join();
			} catch (InterruptedException e5) {
				// TODO Auto-generated catch block
				e5.printStackTrace();
			}
		}
		System.out.println(System.currentTimeMillis());

	}

}
