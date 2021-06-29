package domain;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Floristeria {

	private int idShop;
	private String name;
	private List<Product> products = new ArrayList<Product>(); // nuevo

	public void addProduct(Product product) {
		if (!products.contains(product)) {//true -cuando sea el mismo name
			products.add(product);
		}
		else
			System.out.println("Producte ja existeix");
	}

	public Floristeria(int idShop, String name) {
		super();
		this.idShop = idShop;
		this.name = name;
	}

	public int getIdShop() {
		return idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Floristeria \tID botiga:" + idShop + "\tNom: " + name + "\n";
	}

	public List<Product> getProducts() {
		return products;
	}

	public String getAllProducts() {
		StringBuffer sb = new StringBuffer();
		for (Product product : products) {
			sb.append(product + "\n");
		}

		return sb.toString();
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public float totalValor() {
		double valor = 0;
		for (Product p : products) {
			valor += p.getQty() * p.getPrice();
		}

		return (float) valor;
	}
	
	public String totalBotiga() {
		String stock="";
		double qty=0;
		double price=0;
		for (Product p: products) {
			qty += p.getQty();
			price += p.getPrice();
			
			stock += "Producte " +p.getName()+ " quantitat " + qty + " Preu " + price+"\n";
			
		}
		return stock;
	}

	public void removeProduct(String nomP) {
		 
		//1º 
		/*for(int i=0; i<products.size();i++) {
			Product p=products.get(i);
			//..
		}
		//2º 
		for(Product p: products) {
			//..
		}
		//3º 
   	    Iterator<Product> iter = products.iterator();
		while(iter.hasNext()) {
			//..
			
			iter.next();
		}*/
				
		
		Iterator<Product> iter = products.iterator();
		while(iter.hasNext()) {
			Product p=iter.next();
			if (p.getName().equals(nomP)) {
				iter.remove();		
				
			}
		}
		
		/*Product sel=new Product();
		for(Product p: products) {
			if (p.getName().equals(nomP)) {
				sel.setName(p.getName());
				sel.setBotiga(p.getBotiga());
				sel.setPrice(p.getPrice());		//equals esta definido para 3 variables						
				break;
			}
		}
		products.remove(sel);//<-- debe tener el mismo estado interno y declarar equals
		*/
		
	}

}
