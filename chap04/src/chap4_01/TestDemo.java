package chap4_01;
class Student
{
	String name;
	int age;
	Student()
	{
		
	}
	Student(String name)
	{
		this.name=name;
		
	}
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void study()
	{
		System.out.println("我是沙雕，我的学习方法是摸鱼:");
	}
	void study(String stu)
	{
		System.out.println("我是"+stu+"我的学习方法是，认真上课 听讲，课后自主研究");
	}
	void study(String stu,int year)
	{
		System.out.println("我是"+stu+"生，我的学制是"+year+"年，我的学习方法主要是研究性学习");
	}
}
public class TestDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="张赛";
		s1.age=20;
		
		Student s2=new Student("wxj");	
		Student s3=new Student("xh",18);
	    System.out.println("我叫"+s1.name+",我今年"+s1.age+"岁");
	    System.out.println();
	    //s1.study();
	    //s1.study("本科");
	    s1.study("硕士",3);
	    System.out.println("我叫"+s2.name+",我今年"+s2.age+"岁");
	    System.out.println("我叫"+s3.name+",我今年"+s3.age+"岁");
	}
}