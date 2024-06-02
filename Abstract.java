package Telusko;

// abstract method can only be in abstract class
// class & method ++ abstract
abstract class Car {
	public abstract void drive(); 


	public void PlayMusic() {
		System.out.println("Play some music!");
	}	

}

class KIA extends Car{
	
	public void drive() {
		System.out.println("...Driving..");
	}
}

public class Abstract {
	
	public static void main(String[] args) {
		
//		Car car = new Car(); // abstract 類別不能夠實體化呼叫，例如不能使用new 
		
		Car car = new KIA();
		car.PlayMusic();
		car.drive();
	}
	
	
	
}
