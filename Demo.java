package Telusko;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo{
 
 public static void main(String[] args) {
  
  // 創建一個 ArrayList
  List<Integer> nums = new ArrayList<Integer>();
  
  nums.add(4);
  nums.add(3);
  nums.add(7);
  nums.add(9);
  
  // 會印出 [4,3,7,9]
  System.out.println(nums);
  
  // 經過排序 會印出 [3,4,7,9]
  // Collections 可以直接排列 Interger Array 
  Collections.sort(nums);
  System.out.println(nums);
  
  // 如果我們想要依照自己的邏輯排列呢？
  // 例如我只想照數字尾數排列，希望是[31,72,43,29]
  List<Integer> nums1 = new ArrayList<Integer>();
  nums1.add(43);
  nums1.add(31);
  nums1.add(72);
  nums1.add(29);
  
  // 那就要透過 自定義Comparator，除以１０得到尾數
  Comparator<Integer> com = new Comparator<Integer>() {
   
   @Override
   public int compare(Integer i, Integer j) {
    if (i%10 < j%10) {
     return -1;
    } else { 
     return 1 ;
    }
     }
   };
  // 就會依照尾數，排列成[31,72,43,29]，我們的自定義
  Collections.sort(nums1, com);
  System.out.println(nums1);
  
// 現在我們來定義不是 Integer 的類別，改成學生
//創建 Student List
  List<Student> student = new ArrayList<Student>();
	student.add(new Student(12,"Ian"));
	student.add(new Student(21,"Jacob"));
	student.add(new Student(3,"Tommy"));
	student.add(new Student(49,"Cook"));
	
	// 	還沒排序過
	for(Student element : student)
		System.out.println(element);

	// 	要重新定義Comparator 照學生年紀排序
	Comparator<Student> stud = new Comparator<Demo.Student>() {

		@Override
		public int compare(Demo.Student s1, Demo.Student s2) {
			if(s1.age > s2.age)
				return 1;
			else 
				return -1;
		}
	};
	// Comparator 寫法
	Collections.sort(student,stud);
	// 	排序過了
	for(Student element : student)
		System.out.println(element);
	
	// 也可以向 Student implements Comparable
	// Comparable寫法
	Collections.sort(student);
	
 }
 


 private static class Student implements Comparable<Student>{
	 
	 int age;
	 String name;
	 
	 // 把該呼叫的都呼叫
	 public String toString() {
		return "Student [ age= "  + age + " name = " + name + " ]";
	 
	 }

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Demo.Student that) {
		if(this.age > that.age )
			return 1;
		else 
			return -1;
	}
	
	

	
}
}











