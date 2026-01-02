package program2;

class dev {
	String name;
	int number;
	float salary;

	public dev() {
		name = "raj";
		number = 34312;
		salary = 78900;
	}

	void getrecord() {

		System.out.println("name = priya");
		System.out.println("number = 89878r");
		System.out.println("salary  = 676656 ");
	}

	void display() {
//		System.out.println(name + " /" + number + "/" + salary);

	}

}

public class mass {
	public static void main(String args[]) {
		dev d1 = new dev();
		d1.getrecord();
		d1.display();

	}

}
