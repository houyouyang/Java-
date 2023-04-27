package chap4_8;
class Person{
	private String name ="";
	private String address ="";
	public Person(String name,String address){
		this.name=name;
		this.address=address;
	}
}
class Employee extends Person{
	private String ID="";
	private double wage=0;
	private int age=0;
	public Employee(String name,String address,String ID,double wage,int age) {
		super(name,address);
		this.ID=ID;
		this.wage=wage;
		this.age=age;
	} 
	public double add(String position) {
		if(position=="0") {
			wage=wage*1.2;
			
		}
		else {
			wage=wage*1.1;
		}
		return wage;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage=wage;
	}
	}
class Manager extends Employee{
	private String level="";
	public Manager(String name,String address,String ID,double wage,int age, String level) {
		super(name,address,ID,wage,age);
		this.level=level;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level=level;
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager normal=new Manager("wsl","jit","12",1000,2,"1");
		Manager manager=new Manager("ctl","jitt","123",5000,12,"0");
		normal.add(normal.getLevel());
		manager.add(manager.getLevel());
		System.out.println("员工的工资为："+normal.getWage());
		System.out.println("经理的工资为："+manager.getWage());
	}

}
