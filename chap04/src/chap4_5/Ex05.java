package chap4_5;
class Student{
	String name;
	int score;
	public Student() {}
		public Student(String stu_name) 
		{
		this.name=stu_name;
	}
		public Student(String stu_name,int stu_score) {
			this.name=stu_name;
			this.score=stu_score;
		}
		public void produce()
		{
			System.out.println("我是"+name+",我考了"+score+"分");
		}
}

public class Ex05 {

	public static void main(String[] args) {
		Student stu1=new Student();
		Student stu2=new Student("张三");
		Student stu3=new Student("李四",90);
		
		stu1.produce();
		stu2.produce();
		stu3.produce();
	}

}
