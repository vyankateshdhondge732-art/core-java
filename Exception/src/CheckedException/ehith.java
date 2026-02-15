package CheckedException;

public class ehith {

	public static void main(String[] args){
       try 
       {
    	 int a= 10;
    	 int b=20;
    	 int c=10/0;
    	   System.out.println(a*b+"");
    	   throw new Exception("new");
       }
       catch(Exception ex) {
    	   System.out.println("check");
       }

	}
}
