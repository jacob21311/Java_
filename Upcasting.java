package Telusko;

class MM {
		public void show() {
			System.out.println("In A show");
		}
	}
	
class NN extends MM {
		public void show() {
			System.out.println("In B show");	
			
		}
}	
public class Upcasting {	
	public static void main(String[] args) {
		
		// 父系的 obj 想要引用子系方法
		MM obj = new NN();
		obj.show();
		
		// 直接呼叫子係 obj1 並確認說要降父系
		NN obj1 = (NN) obj;
		obj1.show();
	}
}
