package map;

import java.util.HashMap;
import java.util.Objects;

public class hashmap2 {

	public static void main(String[] args) {
		
		Hash hi =new Hash(101,"amae","pune",32324);
		
          HashMap<Hash,String> map = new HashMap<>();
       
          map.put(hi, "vanky");
          
          System.out.println(map);
          
	}

}
class Hash{
	int id ;
	String name;
	String city;
	int pincod;
	 
	public Hash(int id,String name,String city,int pincod) {
		this.id=id;
		this.name=name;
		this.city=city;
		this.pincod=pincod;
	}
		public String toString() {
			return this.name+this.id+this.city+this.pincod;
		}
		public int hashcode() {
			return Objects.hash(id ,name,city,pincod);
		}
		public boolean equlas(Object obj) {
			Hash hp  = (Hash)obj;
			return this. id ==hp .id && this.name .equals(obj)&&
					this.city.equals(obj)&& this.pincod==hp.pincod;
			
		}
	}

