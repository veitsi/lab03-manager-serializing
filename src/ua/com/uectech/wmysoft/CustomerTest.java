package ua.com.uectech.wmysoft;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void testCustomer() {
		System.out.println("very good");
		//fail("Not yet implemented");
	}
	@Test
	public void testSaveCustomer() throws IOException{
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
			System.out.println("Something wrong on saving");
			throw e;
		}
		finally {
			System.out.println("saved? ");
		}		
	}
	
	@Test
	public void testLoadCustomer(){
		System.out.println("-------------------");
		System.out.println("Let's try to restore customer");
		try {
		ObjectInputStream cs=new ObjectInputStream(new FileInputStream("cs.ser"));
		Customer max = (Customer) cs.readObject();
		cs.close();

		max.display();
		
		} catch (IOException | ClassNotFoundException e){
			System.out.println("something wrong in restoring");
		}
		finally {
			System.out.println("loaded? ");
		}
		
	}
}
