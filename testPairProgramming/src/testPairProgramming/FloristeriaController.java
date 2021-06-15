package testPairProgramming;

public class FloristeriaController {
	
	private FloristeriaRepository repository;
	
	public FloristeriaController() {
		
		repository = new FloristeriaRepository();
	}
	
	public void createFloristeria(int idShop, String name) throws Exception {
    	try {
	        Floristeria floristeria = new Floristeria(idShop, name);
	        repository.addFloristeria(floristeria);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "El material debe ser 'plastic' o 'wood'.");	
		}
	}
	
	public void createDecoration(float price, String name, int qty) throws Exception {
    	try {
	        Decoration decoration = new Decoration(price, name, qty, Decoration.material);
	        repository.addProduct(decoration);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage() + "El material debe ser 'plastic' o 'wood'.");	
		}
	}
	
	public void createFlower(float price, String name, int qty) throws Exception {
    	try {
	        Flower flower = new Flower(price, name, qty, Flower.color);
	        repository.addProduct(flower);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage());	
		}
	}
	
	public void createTree(float price, String name, int qty) throws Exception {
    	try {
    		Tree tree = new Tree(price, name, qty, Tree.height);
	        repository.addProduct(tree);
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\nERROR: " + e.getMessage());	
		}
	}
	
    public String getAllProducts() {
        StringBuilder sb = new StringBuilder();
        for (Product product : repository.getAllProducts())
            sb.append(product.name).append("\n\n");
        return sb.toString();
    }

}
