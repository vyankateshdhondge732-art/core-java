package program2;


   class madhue{                                         // this is  class
	   String name;
	   int number;
	   float marks;
	                                        
	   madhue(){                                      // madhue is the conctrcter of this program //
		   name = "vanky";
		   number = 89;
		   marks =  98;
	         }
		   void getrecord() {
			   System.out.println("name="+name);
			   System.out.println("number="+number);
			   System.out.println("marks="+marks);   
		   }
		  void  displya(){
		    	System.out.println(name+" /  "+ number +"/ " +marks);	
		    }
	      }		   
public class madhu {

	public static void main(String[] args) {
		madhue m1 = new madhue();
		m1.getrecord();
		m1.displya();
	 }
        }
