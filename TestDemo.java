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
		System.out.println("我是	动物，我要吃食物");
	}
	void speak()
	{
		System.out.println("我是	动物，我要吼叫！！");
	}
	void play()
	{
		System.out.println("我是	动物，我会玩耍！！");
	}
}
class Cat extends Animal
{
	int weight;
	void eat()
	{
		System.out.println("我是一只猫，我喜欢吃鱼虾！！");
	}
	void zhulaoshu()
	{
		System.out.println("我是一只猫，我的特长是抓老鼠！！");
	}
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("我是一只老虎，我喜欢吃肉！！");
	}
}

class Dog extends Animal
{
	int weight;
	void speak()
	{
		System.out.println("我是一只dog，我喜欢狗叫");
	}
}

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1=new Cat();
		c1.setName("布偶");
		c1.setAge(2);
		c1.eat();
		c1.weight=5;
		c1.zhulaoshu();
		System.out.println("我是一只"+c1.getName()+"我今年"+c1.getAge()+"岁"+",我的体重是"+c1.weight+"kg");
		
		Tiger t1=new Tiger();
		t1.setName("东北虎");
		t1.setAge(10);
		t1.eat();
		System.out.println("我是一只"+t1.getName()+"我今年"+t1.getAge()+"岁");
		
		Dog d1=new Dog();
		d1.setName("藏獒");
		d1.setAge(10);
		d1.speak();
		d1.weight=25;
		System.out.println("我是一只"+d1.getName()+"我今年"+t1.getAge()+"岁");
	}

}
