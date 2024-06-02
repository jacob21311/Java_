package Telusko;


enum Status{
	Running, Failed , Pending, Success
}
public class Team {
	public static void main(String[] args) {
		
		Status s = Status.Running;
		
		System.out.println(s.getClass().getName());
		switch(s)
		{
		case Running:
			System.out.println("All Good！");
			break;
		case Failed:
			System.out.println("Try again!");
			break;
		case Pending:
			System.out.println("Please wait");
			break;
		}
		
		if(s == Status.Running )
			System.out.println("All Good！");
		else if (s == Status.Failed)
			System.out.println("Try again!");
		else if (s == Status.Pending)
			System.out.println("Please wait");
		
	}
}
