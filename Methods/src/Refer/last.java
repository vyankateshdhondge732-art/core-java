package Refer;

import java.util.List;

public class last {
            public static void main(String[]args) {
                List.of("fjhf","fkfn","fkfj","sjdj")
                .stream()
                .map(i->i.length())
                .forEach(i->System.out.println(i));

            }
}
