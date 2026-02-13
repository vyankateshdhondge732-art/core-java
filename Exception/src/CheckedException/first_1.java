package CheckedException;

import java.io.FileReader;

public class first_1 {

	public static void main(String[] args) {
          try {
        	  FileReader fr=new FileReader("abis,sjd");
        	  System.out.println("file opeen");
          }
          catch(Exception ex) {
        	  System.out.println("checkd exception handal");
        	  
          }
//          finally {
//        	  System.out.println("im thera");
//          }
	}

}
