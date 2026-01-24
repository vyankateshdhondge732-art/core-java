package Refer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class collect {

	public static void main(String[] args) {
        Map <Object,Object>li=List.of("abc","bcd","kio","hjid")
                  .stream()
                  .collect(Collectors.toMap(i->i,i->i.length()));		  
                  
                    System.out.println(li);
                    
                    
                    Map<Integer,List<String>> li2= List.of("sdad","hgds","jdjaj")
                    		.stream()
                    		.collect(Collectors.groupingBy(i->i.length()));
                    System.out.println(li2);

                     

	}

} 
