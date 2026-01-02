package programnew1;

class Task{
	
 //==  	private static Task t1;
	private  Task() {                                   //   crete the construtor 
	
	}
		 static {                                         //    creat the static block
		
	   //  Task t1 = new Task();
			                                           ///    only one  object run   ////
		System.out.println("number");
		 }	
		 
		 public static  Task instas(){                   ///    instas method    ////
			return new Task();
		
   ///==  return t1;
			
		}
	}
	
public class privete {

	public static void main(String[] args) {
	
        Task .instas();
        Task.instas();
        Task.instas();

	}

}
