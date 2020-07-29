import java.util.HashMap;
import java.util.Map.Entry;

public class FrequencyCount {
	public static void main(String...args) {
		int arr[] = {10, 34, 5, 10, 3, 5, 10}; 
		
		HashMap<Integer ,Integer> map=new 
				HashMap<Integer,Integer>();
		
		//TreeMap<Integer ,Integer> map=new 
		//		TreeMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			Integer c=map.get(arr[i]);
			
			if(c==null) {
				map.put(arr[i],1);
			}
			else {
				map.put(arr[i],++c);
			}
		}
		for(Entry<Integer, Integer> m:map.entrySet()) {
			System.out.println("Frequency of " + m.getKey() +  
                    " is " + m.getValue()); 
		}
		
	}

}
