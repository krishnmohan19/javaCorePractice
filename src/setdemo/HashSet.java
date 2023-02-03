package setdemo;
import java.util.*;
public class HashSet {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  
			                 HashSet one = new HashSet(); 
			   
			                 HashSet two = new HashSet(); 
			   
			                 HashSet three = one; 
			   
			                one = null; 
			   
			                HashSet four = one; 
			   
			                three = null; 
			   
			                two = null; 
			   
			             two = new HashSet(); 
			   
			             System.gc(); 
			             System.out.println("yes");
		
		
	}

	

}
