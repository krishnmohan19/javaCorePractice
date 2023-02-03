package setdemo;

import java.util.Objects;

public class Product implements Comparable<Product> {
	
	int id;
	String name;
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void incrementId() {
		this.id++;
		System.out.println("id incremented"+Thread.currentThread().getName());
	}
	
//	@Override
//	public int compareTo(Product p) {
//		return this.id-p.id;
//	}
	
	
	public int compareTo(Product o) {
		return this.id - o.id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}
