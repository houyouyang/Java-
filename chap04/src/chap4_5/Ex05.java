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
			System.out.println("����"+name+",�ҿ���"+score+"��");
		}
}

public class Ex05 {

	public static void main(String[] args) {
		Student stu1=new Student();
		Student stu2=new Student("����");
		Student stu3=new Student("����",90);
		
		stu1.produce();
		stu2.produce();
		stu3.produce();
	}

}
