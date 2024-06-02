package Telusko;


class Duu {
	
		int age;
		public void show() {
			System.out.println(" in show");
	}
	
		class b {
			public void config() {
				System.out.println(" in config");
			}
		}
}



public class InnerClass {
	
	public static void main(String[] args) {
		
		
		Duu obj = new Duu();
		obj.show();
		
		// 類別內的類別 ， 使用外部物件呼叫內部物件
		Duu.b obj1 = obj.new b(); 
			obj1.config();	
		
		
		
		
	}
}
