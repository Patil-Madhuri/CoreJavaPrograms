package java8features;

import java.util.ArrayList;

public class ForEachMethod 
{
	public static void main(String[] args) 
	{
		ArrayList<Product> alist = new ArrayList<>();
		//Product product=new Product();
		alist.add(new Product(101, 20, "Samsung Mobile", 20000));
		alist.add(new Product(102, 10, "Lenovo Mobile", 15000));
		alist.add(new Product(103, 20, "Redmi Mobile", 17000));
		alist.add(new Product(104, 20, "Nokia Mobile", 21000));
		alist.add(new Product(105, 20, "Micromax Mobile", 20000));
		System.out.println("Product List: ");
		
		alist.forEach(product ->
		{
			System.out.println(product.toString());
			System.out.println("==============================");
		});
	}
}
