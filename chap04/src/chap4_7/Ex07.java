package chap4_7;
	abstract class Animal
	{
		abstract void eat();
	}
	class Tiger extends Animal
	{
		void eat()
		{
			System.out.println("�ϻ����⣡");
		}
	}
	class Sheep extends Animal{
		void eat() {
			System.out.println("����Բݣ�");
		}
	}
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal tiger=new Tiger();
		Animal sheep=new Sheep();
		animalShout(tiger);
		animalShout(sheep);
		
	}
	public static void animalShout(Animal an) {
		an.eat();
	}
}
