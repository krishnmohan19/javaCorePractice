package Threadsjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import setdemo.Product;

public class ConcurrencyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService service=Executors.newFixedThreadPool(10);
        List<Product> set=new ArrayList<>();
		
		Product p=new Product(1,"name1");
		Product p1=new Product(2,"name2");
		Product p2=new Product(3,"name3");
		Product p3=new Product(4,"name4");
		
		set.add(p);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		for(Product pro:set) {
			IdIncrement task=new IdIncrement(pro);
			service.submit(task);
		}

	}

}
