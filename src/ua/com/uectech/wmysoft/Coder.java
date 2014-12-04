package ua.com.uectech.wmysoft;

public class Coder {
	static String prodmeasure = "string per day";
	int id;
	int productivity;
	Coder(int i, int p){
		this.id=i;
		this.productivity=p;
	}

	public static void main(String[] args) {
		Coder b=new Coder(1,1000);
	}

}
