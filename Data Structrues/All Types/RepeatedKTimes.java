import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;


public class RepeatedKTimes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		String arr[] = new String[n];
		sc.nextLine();
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextLine();
		}
		int k =sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			Integer c=map.get(arr[i]);
			
			if(c==null) {
				map.put(arr[i],1);
			}
			else {
				map.put(arr[i],++c);
			}
		}
		for(Entry<String, Integer> m:map.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());		 
		}
	}

}
