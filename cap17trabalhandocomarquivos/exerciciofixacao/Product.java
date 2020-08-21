package exerciciofixacao;

public final class Product {

	private String name;
	private Double price;
	private Integer quantity;
	
	public Product() {
		
	}
	
	public Product(String name, String price, String quantity) {
		this.name=name;
		this.price=Double.parseDouble(price);
		this.quantity=Integer.parseInt((quantity));
	}
	
	public Double total() {
		return price*quantity;
	}
	
	@Override
	public String toString() {
		return name+","+String.format("%.2f", total());
	}
}
