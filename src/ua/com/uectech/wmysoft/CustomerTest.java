package ua.com.uectech.wmysoft;

import static org.junit.Assert.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testCustomer() {
		System.out.println("very good");
		//fail("Not yet implemented");
	}
	@Test
	public void testSaveCustomer(){
		Customer max = new Customer("Max Gurvits",30000);
			
		max.wl[0]=new TodoItem(new Project("JobHive"),new Manager("Dr. Michael Feinberg"));
		max.wl[1]=new TodoItem(new Project("Little Bird"),new Manager("Arkadius Dobkin"));
		max.wl[2]=new TodoItem(new Project("SendHub"),new Manager("Dmitriy Kushnir"));
		max.wl[3]=new TodoItem(new Project("Vacatia"),new Manager("Vladimir Sharov"));
		max.projectsNumber=4;
		
		max.display();	
		
		try {
		ObjectOutputStream cs=new ObjectOutputStream(new FileOutputStream("cs.ser"));
		cs.writeObject(max);
		cs.flush();
		cs.close();
		} catch (IOException e){
			
		}
		finally {
			System.out.println("saved? ");
		}
		
	}
}
