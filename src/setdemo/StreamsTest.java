package setdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamsTest {

		public static void main(String[] args) {
			
			List<Book> books = new ArrayList<>();
			
			books.addAll(DataExtractor.getFromAmazon("java"));
			books.addAll(DataExtractor.getFromBarnesAndNoble("java"));
			
//			books.stream()
//			.filter((b)->b.getRating()>4.5)
//			.forEach((book)->System.out.println(book.getTitle()));
//			
			Optional<Book> any=books.stream()
			.filter((b)->(b.getRating()>4.5 && b.getPrice()>50))
			.findAny();
			
			if(!any.isEmpty()) {
				System.out.println(any.get().getTitle());
			}
			

		}

	

}
