package Telusko;

import java.util.Objects;

class Laptop {
	String model;
	int price ;
	
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
	
}

public class Final {

	public static void main(String[] args) {
		
		Laptop obj1 = new Laptop();
		obj1.model = "Mac";
		obj1.price = 1000;
		
		Laptop obj2 = new Laptop();
		obj2.model = "Mac";
		obj2.price = 1000;
		
		boolean result = obj1.equals(obj2);
		System.out.println(obj1.toString());
	}

}
