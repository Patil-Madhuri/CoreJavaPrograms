package java8features;

public class Product 
{
	private int id,quantity;
		private String name;
		private double price;
		
		public Product() { } 
		public Product(int id, int quantity, String name, double price) {
			super();
			this.id = id;
			this.quantity = quantity;
			this.name = name;
			this.price = price;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		public String toString()
		{
			return "Product Id: "+this.id +"\nProduct Name: "+this.name +"\nProduct Price: "+this.price+"\nProduct Quantity: "+this.quantity;
		}
	
}
