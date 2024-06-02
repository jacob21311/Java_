package Telusko;


class Cal {
	public int add(int x, int y ) {
		return  x + y;
	}
	
}

class AdvCal extends Cal {
	
	@Override
	public int add(int x, int y ) {
		return  x + y + 1;
	}
}

public class IF_ELSE{

	public static void main(String[] args) {
		AdvCal obj = new AdvCal();
		int r1 = obj.add(3, 4);
		System.out.println(r1);
	}
}