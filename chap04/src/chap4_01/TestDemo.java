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
		System.out.println("����ɳ���ҵ�ѧϰ����������:");
	}
	void study(String stu)
	{
		System.out.println("����"+stu+"�ҵ�ѧϰ�����ǣ������Ͽ� �������κ������о�");
	}
	void study(String stu,int year)
	{
		System.out.println("����"+stu+"�����ҵ�ѧ����"+year+"�꣬�ҵ�ѧϰ������Ҫ���о���ѧϰ");
	}
}
public class TestDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="����";
		s1.age=20;
		
		Student s2=new Student("wxj");	
		Student s3=new Student("xh",18);
	    System.out.println("�ҽ�"+s1.name+",�ҽ���"+s1.age+"��");
	    System.out.println();
	    //s1.study();
	    //s1.study("����");
	    s1.study("˶ʿ",3);
	    System.out.println("�ҽ�"+s2.name+",�ҽ���"+s2.age+"��");
	    System.out.println("�ҽ�"+s3.name+",�ҽ���"+s3.age+"��");
	}
}