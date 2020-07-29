import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Operations {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int choice,marks;
		String key;
		
		HashMap<String,Integer> map=new
				HashMap<String,Integer>();

		while (true) {
			System.out.println();
			System.out.println("Enter your Choice :");
			System.out.println("1. Add/Update Key");
			System.out.println("2. Delete Key");
			System.out.println("3. Print Table");
			System.out.println("4. Exit");
			
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Enter Marks : ");
					marks=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Name : ");
					key = sc.nextLine();
					
					
					Add(key,map,marks);
					break;
				case 2:
					sc.nextLine();
					System.out.println("Enter Key to Delete : ");
					key = sc.nextLine();
					
					Delete(key,map);
					break;
				case 3:Print(map);
					break;
				case 4:
					sc.close();
					return;
			}
		}

	}

	private static void Delete(String key, HashMap<String, Integer> map) {
		Integer c=map.get(key);
		if(c!=null) {
			map.remove(key);
		}
		else {
			System.out.println("No Such elements to Remove");
		}
		
		
	}

	private static void Print(HashMap<String, Integer> map) {
		if(map.isEmpty()) {
			System.out.println("Map is Empty");
		}
		else {
			for(Entry<String,Integer> m:map.entrySet()) {
				System.out.println(m.getKey()+" -- "+m.getValue());
			}
		}
			
	}

	private static void Add(String key, HashMap<String, Integer>map,int marks) {
		
		map.put(key,marks);
		//Integer c=map.get(key);
		//if(c==null) 
		//	map.put(key,marks);
		//else 
		//	map.put(key, marks);
					
	}
		

}
