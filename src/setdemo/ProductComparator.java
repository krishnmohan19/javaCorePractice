package setdemo;
import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return (o1.id-o2.id);
	}
	
	

}
