package program;

class sana{
	 
	sana (){                             //this is the construtor
		System.out.println("madhu");
		
	} 
	static sana nunuu() {                //   nunuu = getinstans  getinstans chya thikani apan kah pn geu shakto
		return new sana();
		
	}
}

public class program9 {
	public static void main (String[]args) {
		sana.nunuu();
	}
	

}
