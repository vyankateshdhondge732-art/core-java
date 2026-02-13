package CheckedException;

public class propagation {

	public static void main(String[] args) {
          propage p=new propage();
          p.method2();
          try {
        	  p.method1(); 
          }
          catch(Exception e) {
        	  System.out.println("exception handl ");
        	  System.out.println(e);
         p.method3();
          }
          		
	}

} class propage{
	    void method1() {
	    	int a= 80/0;
	    }
	    void method2() {
	    	System.out.println("kinhg");
	    }
	    void method3(){
	    	System.out.println("alo");
	    }
}
