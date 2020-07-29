import java.util.Scanner;

public class DataBase {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter : ");
		int t=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		String arr[] = new String[m];
		
		
		for(int i=0;i<t;i++) {
			for(int j=0;j<m;j++) {
				arr[j]=sc.next();
			}
			for(int l=0;l<m;l++) {
				System.out.print("+-------------");
			}
			System.out.println();
			for(int l=0;l<m;l++) {
				
				System.out.print("|"+arr[l]);
			}
			System.out.print("|");
			System.out.println();
		
			for(int j=0;j<n;j++) {
				String data[]=new String[m];
				for(int k=0;k<m;k++) {
					data[k]=sc.next();
				}
				
				for(int k=0;k<m;k++) {
					System.out.print(data[k]+" ");
				}
				System.out.println();
			}
			
		}
		
	}

}
