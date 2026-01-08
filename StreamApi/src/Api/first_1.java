package Api;

import java.util.function.Consumer;

public class first_1 {

	public static void main(String[] args) {

	}

}
class enter implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		int i=0;
		for(int i:t) {
			sum+=i;
		}
		
	}
	
}