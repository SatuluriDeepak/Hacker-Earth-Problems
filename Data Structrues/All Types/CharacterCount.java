import java.util.Map.Entry;
import java.util.TreeMap;

public class CharacterCount {
	public static void main(String...args) {
		String s="Deepakd".toLowerCase();
		
		TreeMap<Character,Integer> map=new
				TreeMap<Character,Integer>();

		for(int i=0;i<s.length();i++) {
			Integer a=map.get(s.charAt(i));
			if(a==null) {
				map.put(s.charAt(i),1);
			}
			else
				map.put(s.charAt(i),++a);
		}
	
		if(map.containsKey('d'))
		{
			Integer ab=map.get('d');
			
			if(ab!=null) {
				map.put('d',ab);
				System.out.println("d"+"--"+ab);
			}
			
		}
		/*
		for(Entry<Character,Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+" is "+m.getValue());
		}
		*/
	}

}
