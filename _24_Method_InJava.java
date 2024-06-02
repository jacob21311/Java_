package Telusko;


class Computer {
	
	// void 表示無物件型態回傳
	public void playMusic() {
		System.out.println("Music Playing");
	}
	// 用參數則使用return 參數回傳
	public String getMePen(int cost) {
		if (cost >=10)
			return "Pen";
		else 
			return "NOT ENOUGH!!";
	}
}

public class _24_Method_InJava {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.playMusic();
		String str = computer.getMePen(1);
		
		System.out.println(str);
		
	}
}
