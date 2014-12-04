package ua.com.uectech.wmysoft;

import java.io.Serializable;

public class Project implements Serializable{

	private static final long serialVersionUID = 1766993314753884742L;
	String title;
	int capacity;
	Project(String t){
		title=t;
	}
	
	public static void main(String[] args) {
		Project p1=new Project("1");
	}

}
