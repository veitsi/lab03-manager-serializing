package ua.com.uectech.wmysoft;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class SerTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	@Test
	public void testManager() {
		System.out.println("about manager");
		//fail("Not yet implemented");
	}
	
	@Test
	public void testSaveManager(){
		//Integer I=273;
		Manager m=new Manager("Kushnir");
		
		try {
		ObjectOutputStream cs=new ObjectOutputStream(new FileOutputStream("ms.ser"));
		cs.writeObject(m);
		cs.flush();
		cs.close();
		} catch (IOException e){
			System.out.println("Wrong on manager saving");
		}
		finally {
			System.out.println("saved? ");
		}		
	}
	
	@Test
	public void testLoadManager(){
		System.out.println("-------------------");
		System.out.println("Let's try to restore manager");
		try {
		ObjectInputStream cs=new ObjectInputStream(new FileInputStream("ms.ser"));
		Manager m = (Manager) cs.readObject();
		cs.close();

		System.out.println("after restoring m="+m.name);
		
		} catch (IOException | ClassNotFoundException e){
			System.out.println("something wrong in restoring");
		}
		finally {
			System.out.println("loaded? ");
		}
		
	}

}
