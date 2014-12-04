package ua.com.uectech.wmysoft;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	String name;
	int money;
	TodoItem[] wl;
	int projectsNumber;
	
	Customer(String n,int m){
		this.name=n;
		this.money=m;
		wl = new TodoItem[10];
	}
		
	void display(){
		System.out.println("Hello, my name is "+this.name+" and I have $"+this.money);
		for (int i=0;i<projectsNumber;i++)
			System.out.println("I have found project "+this.wl[i].p.title+", managed by "+this.wl[i].m.name);
	}

	public static void main(String[] args) {
		Customer max = new Customer("Max Gurvits",30000);
		//Customer polly = new Customer("Polina Pisareva",40000);
			
		max.wl[0]=new TodoItem(new Project("JobHive"),new Manager("Dr. Michael Feinberg"));
		max.wl[1]=new TodoItem(new Project("Little Bird"),new Manager("Arkadius Dobkin"));
		max.wl[2]=new TodoItem(new Project("SendHub"),new Manager("Dmitriy Kushnir"));
		max.wl[3]=new TodoItem(new Project("Vacatia"),new Manager("Vladimir Sharov"));
		max.projectsNumber=4;
		
		max.display();	
	}

}
