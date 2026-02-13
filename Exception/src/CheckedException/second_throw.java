package CheckedException;

public class second_throw {

	
	       public static void main(String[] args) {

		        Demo d = new Demo();

		        try {
		            d.method1();
		        } catch (Exception e) {
		            System.out.println("Handled in main");
		            System.out.println(e);
		        }
		    }
		
		
	}
		class Demo {

		    void method3() throws Exception {
		        throw new Exception("Custom Exception");
		    }

		    void method2() throws Exception {
		        method3();
		    }

		    void method1() throws Exception {
		        method2();
		    }

		}
