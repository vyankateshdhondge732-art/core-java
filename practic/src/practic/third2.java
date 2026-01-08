package practic;

public class third2 {

	public static void main(String[] args) {
       Laptop lp = new Laptop();
       
       try {
    	     lp.printing();
       } catch (Exception ex) {
    	   System.out.println(ex.getMessage());
       }
       
       
       try {                                            /// Exception throw ex///
    	   lp.print2();
       }catch (Exception ex) {
    	   System.out.println(ex.getMessage());
       }
	}

}
  class Laptop {
	  int id =5;
	  int price=2000;
	   
	  public void printing()throws Exception{
		  if(id>5) {
			  throw new Exception("valid id");
		  }
	  System.out.println("not valid");
	  
	  }  
		  public void print2()throws Exception{
			  if (price>2000) {
				  throw new Exception("not approvel for this object...");
			  }
			  System.out.println("approv.....");
		  }
		  
	  }
	 