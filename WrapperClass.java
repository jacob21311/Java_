package Telusko;

public class WrapperClass {

	public static void main(String[] args) {
		
		int i = 7;
		
		Integer j = i;
		
		Integer num2 = j.intValue(); // boxing裝箱
		Integer num3 = j; // auto-boxing自動裝箱
		
		int num4 = num3; // auto-unboxing自動拆箱
 		
		String str = "12";
		
		// 將字串轉換成整數的方法  String -> Integer by parseInt
		int num5 = Integer.parseInt(str);
		
		System.out.println(num5 * 12);
		
	}
	
	
}
