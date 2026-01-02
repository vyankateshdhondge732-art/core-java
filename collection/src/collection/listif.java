package collection;

import java.util.ArrayList;
import java.util.List;

public class listif {

	public static void main(String[] args) {

		List<Demo>list=new ArrayList<Demo>();
		
		Demo st = new Demo();
		st.id=1;
		st.name=": abc :";
		st.email=" abc@gamil ";
		
		Demo st2 = new Demo();
		st2.id=2;
		st2.name=": iuo :";
		st2.email=" gfghg ";
		
		
		list.add(st);
		list.add(st2);
		
		System.out.println(list);
	}

}

class Demo{
	

	int id;
	String name;
	String email;
	
	
//	public Demo(int id,String name,String email) {
//		this.id=id;
//		this.name=name;
//		this.email=email;
//		
//	}
	public Demo() {
		
	}
	public String toString() {
		return this.id+" "+this.name+this.email;
	}
	
}
	

