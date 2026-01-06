package Api;

import java.io.StringBufferInputStream;

public class sis1 {

	public static void main(String[] args) {
   
		Shiv<Integer,String,Character> s=(t1,r1,a1)->{
			return new StringBuffer(r1).append(t1).toString();
		};
		String num = s.add(2," helo ", 'A');
		System.out.println(num);
	}

}
interface Shiv<T,R,A>{
	R add(T t1, R r1 ,A a1);
	
}
