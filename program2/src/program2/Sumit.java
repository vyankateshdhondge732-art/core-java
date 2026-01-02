package program2;

class Amit {                                                // first class creted

	private int roll;
	private int number;
	private int phon;

	Amit(int roll, int number, int phon) {                    // first constructor
		this.roll = roll;
		this.number = number;
		this.phon = phon;
	}

	public void geteRecored() {                            // method
		System.out.println("roll:" + roll);
		System.out.println("number:" + number);
		System.out.println("phon" + phon);
	}
}

class Denesh {                                              // second class
	int empid;
	Amit joinDate;

	Denesh(int empid, int roll, int number, int phon) {             // second construtor
		this.empid = empid;
		this.joinDate = new Amit(roll, number, phon);
		System.out.println(empid);

	}

}

public class Sumit {
	public static void main(String[] args) {
		Denesh d1 = new Denesh(1234, 89, 1, 2000);
		d1.joinDate.geteRecored();
	}

}
