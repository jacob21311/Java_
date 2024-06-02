package Telusko;

class Mobile{
	String brand;
	static String name;
	int price;
	
	public void show() {
		System.out.println(brand +" : "+name +" : "
	+ price );
	}
	
	public static void show1(Mobile obj) {
		System.out.println(obj.brand +" : "+name +" : "
				+ obj.price);
	}
}

public class _0421 {
	public static void main(String[] args) {
	
	Mobile obj1 = new Mobile();
	obj1.brand = "Apple";
	Mobile.name = "smartphone";
	obj1.price = 1500;
		
	Mobile obj2 = new Mobile();
	obj2.brand = "Samsung";
	Mobile.name = "smartphone";
	obj2.price = 1700;	
	
	Mobile.name = "phone";
	
	obj1.show();
	obj2.show();
	
	Mobile.show1(obj1);
		
	}
}
