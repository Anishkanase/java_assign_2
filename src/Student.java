
public class Student {
    String name;
    String grade;
    int age;
    
    
    public Student(String name, String grade, int age) {
		this.name = name;
		this.grade = grade;
		this.age = age;
	
	}
	public static void main(String[] args) {
		

		Student S1 =new Student("anish","A",23);
		Student S2 =new Student("vibhishan","B",24);
		Student S3 =new Student("varad","C",25);
		Student S4 =new Student("shubham","D",26);
		
		System.out.println(S1.name);
		System.out.println(S1.grade);
		System.out.println(S1.age);
		
		System.out.println(S2.name);
		System.out.println(S2.grade);
		System.out.println(S2.age);
		
		System.out.println(S3.name);
		System.out.println(S3.grade);
		System.out.println(S3.age);
		
		System.out.println(S4.name);
		System.out.println(S4.grade);
		System.out.println(S4.age);
		
	}

}
