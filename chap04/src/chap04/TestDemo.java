package chap04;
class Animal
{
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void eat()
	{
		System.out.println("����	�����Ҫ��ʳ��");
	}
	void speak()
	{
		System.out.println("����	�����Ҫ��У���");
	}
	void play()
	{
		System.out.println("����	����һ���ˣ����");
	}
}
class Cat extends Animal
{
	int weight;
	void eat()
	{
		System.out.println("����һֻè����ϲ������Ϻ����");
	}
	void zhulaoshu()
	{
		System.out.println("����һֻè���ҵ��س���ץ���󣡣�");
	}
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("����һֻ�ϻ�����ϲ�����⣡��");
	}
}

class Dog extends Animal
{
	int weight;
	void speak()
	{
		System.out.println("����һֻdog����ϲ������");
	}
}

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1=new Cat();
		c1.setName("��ż");
		c1.setAge(2);
		c1.eat();
		c1.weight=5;
		c1.zhulaoshu();
		System.out.println("����һֻ"+c1.getName()+"�ҽ���"+c1.getAge()+"��"+",�ҵ�������"+c1.weight+"kg");
		
		Tiger t1=new Tiger();
		t1.setName("������");
		t1.setAge(10);
		t1.eat();
		System.out.println("����һֻ"+t1.getName()+"�ҽ���"+t1.getAge()+"��");
		
		Dog d1=new Dog();
		d1.setName("����");
		d1.setAge(10);
		d1.speak();
		d1.weight=25;
		System.out.println("����һֻ"+d1.getName()+"�ҽ���"+t1.getAge()+"��");
	}

}
