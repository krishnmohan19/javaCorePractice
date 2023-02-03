package setdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import com.incedo.inc.Employee;

public class StreamDemo {

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
		
		 list.stream()
		.filter((e)->e.name.startsWith("r"))
		.forEach((m)->System.out.println(m.name));
		
		
		 Optional<Product> temp=list.stream()
					.filter((e)->e.name.startsWith("r"))
					.min((m,n)->(m.id-n.id));
		 
		 if(!temp.isEmpty()) {
			 System.out.println(temp.get().name);
		 }
		 
		 OptionalDouble maxSalary=list.stream()
					.filter((e)->e.name.startsWith("r"))
					.mapToDouble((e)->e.id)
					.max();
		 
		 if(!maxSalary.isEmpty()) {
			 System.out.println(maxSalary);
		 }
		 
	}

}
