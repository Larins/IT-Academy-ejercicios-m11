package domain;

import java.util.ArrayList;
import java.util.List;

public class Floristeria {
	
	private int idShop;
	private String name;
	private List<Product> products = new ArrayList<Product>(); //nuevo

	public void addProduct(Product product) {
		products.add(product);
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
		for(Product product:products) {
			sb.append(product+"\n");
		}
		
		return sb.toString();
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public float totalValor()  {
		double valor=0;
		for (Product p: products) {
			valor += p.getQty()*p.getPrice();
		}
		
		return (float) valor;
	}
	
	
	
	
	
	
	
}
