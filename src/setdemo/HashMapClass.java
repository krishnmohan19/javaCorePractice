package setdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapClass {
	
	public static void main(String[] args) {
		
		Product p=new Product(1,"name1");
		Product p1=new Product(2,"name1");
		Product p2=new Product(3,"name1");
		Product p3=new Product(4,"name1");
		
		Map<Integer,Product> map=new LinkedHashMap<Integer,Product>();
		
		map.put(1, p);
		map.put(111, p2);
		map.put(12, p1);
		map.put(21, p3);
		
		System.out.println(map);
	}

}
