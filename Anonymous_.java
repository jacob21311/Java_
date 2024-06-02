package Telusko;


abstract class Aa{ 
	
	public abstract void show();
}

public class Anonymous_ {
	
	public static void main(String[] args) {
		
		Aa obj = new Aa() 
		{
			public void show() {
				System.out.println("In new show");
			}
		};
		
		obj.show();
		}

}
