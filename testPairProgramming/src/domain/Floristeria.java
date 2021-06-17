package domain;

public class Floristeria {
	
	protected int idShop;
	public String name;
	
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
		return "Floristeria [idShop=" + idShop + ", name=" + name + "]\n";
	}
	
}
