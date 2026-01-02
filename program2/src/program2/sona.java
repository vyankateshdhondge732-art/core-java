package program2;

//import java.util.Scanner;          // scanner metod funtion

class Deena {                    //  ha new class ahe  
	String name;
	int Roll;
	float marks;

	 Deena() {                       ///    parameterless constructor  //
		name = "shibhu";
		Roll = 78;
	    marks = 98;
	//	Scanner sc =new Scanner(System.in);         // use to scanner method //
	//	System.out.println("enter the name");
	//	name = sc.nextLine();
	//	Roll = sc.nextInt();
	//	marks =sc.nextFloat();
    
	}

	void funtion() {
		System.out.println("name =" + name);
		System.out.println("Roll =" + Roll);
		System.out.println("marks= " + marks);
		
	
			}
}

public class sona {                                    // program  cha main class //
	public static void main(String[] args) {
		Deena d1 =new Deena();
		d1.funtion();
		

	}

}
