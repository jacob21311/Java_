package Telusko;

// 創立 interface 不能直接實體化 只是告訴你一個方向
interface Tak {

	int i = 32; // 定義在interface當中的field
				// 肯定是 final 且 static 的
	String s = "Clippers";

	void show();

	void run();

}

interface X {
	void lay();
}

// 呼叫 B 作為 class 延伸 interface 才能實例化
// 並且補齊原 method

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

class Tbk implements Tak, X {

	@Override
	public void show() {
		System.out.println("in show");
	}

	@Override
	public void run() {
		System.out.println("running...");
	}

	@Override
	public void lay() {
		System.out.println("laying... ");
	}

}

public class Interface {
	public static void main(String[] args) {

		// obj 雖然屬於 Tak 方法 但要實體化仍須透過 class
		Tak obj = new Tbk();
		obj.show();
		obj.run();
		
		// 從原先obj當中我們找不到 lay() 所以就算implements 
		// 也還是要重新new interface with class 
		X obj1 = new Tbk();
		obj1.lay();
	}
}
