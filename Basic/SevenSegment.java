
import java.util.Scanner;

public class SevenSegment {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(5/2);
		int test=sc.nextInt();
		sc.nextLine();
		for(int d=0;d<test;d++) {
			String s1=sc.nextLine();
			
			int sticks=0;
			String op="";
			
			for(int i=0;i<s1.length();i++) {
				char sn=s1.charAt(i);
			
				if( sn=='0' || sn=='6' || sn=='9') 
					sticks+=6;
				else if( sn=='2' || sn=='5' || sn=='3') 
					sticks+=5;
				else if( sn=='4' )
					sticks+=4;
				else if( sn== '7')
					sticks+=3;
				else if ( sn=='8' )
					sticks += 7;
				else 
					sticks+=2;
				
			}
			//System.out.println(sticks);
			int num=sticks/2;
			if(sticks%2==0) {
				for(int i=0;i<sticks;i=i+2) {
					System.out.print("1");
				}
				
			}
			else {
				
				System.out.print("7");
				for(int i=1;i<num;i++) {
					System.out.print("1");
				}
			}
			System.out.println();
				
			//System.out.println(sticks);
			
		}
		
	}

}
