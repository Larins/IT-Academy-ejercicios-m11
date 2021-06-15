package testPairProgramming;

import java.util.ArrayList;
import java.util.List;
public class FloristeriaRepository {
		
private static List<Product> products=new ArrayList<>();
	
	public FloristeriaRepository(){}
	
	public List<Product> getAllMembers(){
		return new ArrayList<>(products);
	}
	
	public void addMember(Product product) throws Exception{
		if(product==null) throw new Exception();
		products.add(product);	
	}
	
	
}
