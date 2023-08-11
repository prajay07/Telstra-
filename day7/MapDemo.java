import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//hashmap example
		HashMap<String,String> hm=new HashMap<>();
		hm.put("Sachin","batsmen");
		hm.put("Dhoni","wk");
		hm.put("bumrah","Bowler");
		hm.put("dhoni","captain");
		
		System.out.println(hm);
		
		System.out.println(hm.get("Sachin"));
		System.out.println(hm.get("Dhoni"));
		
		System.out.println(("get all values:"+hm.values()));
		System.out.println(("get all key:"+hm.keySet()));
		
		
		//iterating keys
		
		for(String key: hm.keySet())
		{
			System.out.println(("Key="+ key +"|| value="+hm.get(key)));
		}
		
	}

}
