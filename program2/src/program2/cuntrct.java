package program2;

class mama {

	String name;
	int Rollnumbr;
	float marks;

	public mama() { // Parameter Less Constructor
		name = "krishna";
		Rollnumbr = 54;
		marks = 76;
	}

	void getrecored() {
		System.out.println("name=" + name);
		System.out.println("Rollnumber:;" + Rollnumbr);
		System.out.println("marks:" + marks);
	}

	void display() {
		// System.out.println(name+" /"+Rollnumbr+"/"+marks);
		
	}

}

class memo {
}

public class cuntrct {
	public static void main(String[] args) {

		mama m1 = new mama();
		m1.getrecored();
		m1.display();
	}

}
