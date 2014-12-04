package ua.com.uectech.wmysoft;

import java.io.Serializable;

public class Manager implements Serializable {

	private static final long serialVersionUID = -5233421789366932076L;
	String name;
	Manager(String n){
		name=n;
	}
	

	public static void main(String[] args) {
		Manager m=new Manager("1");

	}

}
