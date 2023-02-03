package setdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FindProductDemo {
	
	public static void printProduct(List<Product> list,Predicate<Product> condition,Consumer<Product> consumer) {
		for(Product p:list) {
			if(condition.test(p)) {
				consumer.accept(p);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product(1,"ram");
		Product p1=new Product(2,"ravi");
		Product p2=new Product(3,"priya");
		Product p3=new Product(4,"mukesh");
		List<Product> list=new ArrayList<>();
		list.add(p);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		//for(Product pro:list)System.out.println(pro.name);
//		printProduct(list,(e)->e.name.startsWith("r"),(e)->System.out.println(e.name));
//		printProduct(list,(e)->true,(e)->System.out.println(e.name));
//		printProduct(list,(e)->e.id>2,(e)->System.out.println(e.name));
		
		Collections.sort(list,(m,n)->n.id-m.id);
		for(Product pro:list)System.out.println(pro.name);
		
		
			
	}

}
