package ua.com.uectech.wmysoft;

public class Customer {
	String name;
	int id;
	int money;
	
	Customer(int i,String n,int m){
		this.id=i;
		this.name=n;
		this.money=m;
	}
	
	void display(){
		System.out.println("Hello, my name is "+this.name+" and I have $"+this.money);
	}

	public static void main(String[] args) {
		Customer c1 = new Customer(1,"Serg Larin",30000);
		Customer c2 = new Customer(2,"Serg Krasyuk",40000);
		c1.display();
	}

}
