package domain;

import java.util.ArrayList;
import java.util.List;

public class Floristeria {
	
	protected int idShop;
	public static String name;
	private static List<Product> products = new ArrayList<Product>(); //nuevo

	
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
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Floristeria\n\tID botiga:" + idShop + "\n\tNom: " + name + "\n\n";
	}
	
}
