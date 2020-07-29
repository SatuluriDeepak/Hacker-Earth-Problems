import java.util.Scanner;

public class DoctorsSecret {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int p=sc.nextInt();
		
		if(l<=23 &&(p>500 && p<1000)) {
			System.out.println("Take Medicine");
		}
		else System.out.println("Don't take Medicine");
	}

}
