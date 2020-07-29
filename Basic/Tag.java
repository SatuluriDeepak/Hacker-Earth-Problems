import java.util.Scanner;

public class Tag {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next().toLowerCase();
		String arr[]=s1.split("");
		
		int one=Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) ;
		
		int two= Integer.parseInt(arr[3])+Integer.parseInt(arr[4]);
		
		int five=Integer.parseInt(arr[4])+Integer.parseInt(arr[5]);
		int three=Integer.parseInt(arr[5])+Integer.parseInt(arr[7]);
		
		
		int four = Integer.parseInt(arr[7]) + Integer.parseInt(arr[8]);
		
		String vow="aeiouy";
		if(vow.contains(arr[2])) {
			System.out.println("invalid");
		}
		else if(one%2!=0 || two%2!=0|| three%2!=0 || five%2!=0 || four%2!=0 )
			System.out.println("invalid");
		else System.out.println("valid");
		
	}

}
