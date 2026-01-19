package Api;

import java.util.List;

public class six {

	public static void main(String[] args) {

         List.of("abc","kgf","iol")
         .stream()
       //  .map((i)->{return i.length();})
        // .map((i)->{new StringBuffer(i).reverse().toString();});
        .map(i->new StringBuffer(i).reverse().toString())
        // .map((i)->{return i.length();})

        .forEach((s)->{System.out.println(s);});
         
         
       //  .forEach(System.out::println);
        // .map(i->i.toString().length()).forEach(i->System.out.println(i));

}
}