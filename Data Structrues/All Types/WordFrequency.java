import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WordFrequency {
	public static void main(String...args) {
		HashMap<String,Integer> map=new
				HashMap<String,Integer>();
		String []str = "Geeks For Geeks".split(" ");
		
		for(int i=0;i<str.length;i++) {
			Integer c=map.get(str[i]);
			if(c==null) {
				map.put(str[i], 1);
			}
			else
				map.put(str[i], ++c);
		}
		/*
		if(map.containsKey("For"))
		{
			
			Integer ab=map.get("For");
			if(ab!=null) {
				map.put("For",ab+2);
			}
			System.out.println("For"+"--"+ab);
		}
		*/
		for(Entry<String,Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+" is "+m.getValue());
		}
		
		System.out.println(map.values());
			
	}
	
	//satulurideepak /usr/local/mongodb

}
