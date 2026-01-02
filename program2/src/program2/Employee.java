package program2;

class Date1 { // first
	private int day;
	private int month;
	private int year;

	Date1(int day, int month, int year) { // second this is the constcto pareametrizedr
		this.day = day;
		this.month = month;
		this.year = year;
	}

	void gateRecord() { // 3rd
		System.out.println(day + "/" + month + "/" + year);
	}
}

class Vyan { // 4th
	int empid;
	Date1 joinDate;

	Vyan(int empid, int day, int month, int year) {
		this.empid = empid;
		this.joinDate = new Date1(day, month, year);
		System.out.println(empid);

	}

}

public class Employee {
	public static void main(String[] args) {

		Vyan v1 = new Vyan(64764, 7, 9, 1999);
		v1.joinDate.gateRecord();

	}

}
