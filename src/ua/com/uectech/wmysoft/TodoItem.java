package ua.com.uectech.wmysoft;

import java.io.Serializable;

public class TodoItem implements Serializable{
	private static final long serialVersionUID = 4985916145460562828L;
	Project p;
	Manager m;
	TodoItem(Project p, Manager m){
		this.p=p;
		this.m=m;
	}

	public static void main(String[] args) {

	}

}
