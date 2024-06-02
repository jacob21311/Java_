package Telusko;

enum DemoEnum {
	Macbook(2000), Iphone(1500), IPad, Dell(2200);
	
	int price;
	
	private DemoEnum() {
		price = 1200;
	}

	private DemoEnum(int price) {
		this.price = price;
		System.out.println("in this loop:" + this.name());
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		
		DemoEnum d = DemoEnum.Macbook;
		System.out.println(d +" : "+ d.getPrice());
		
		for(DemoEnum element: DemoEnum.values())
			System.out.println(element + " : " + element.getPrice());
	}
	
	
}
