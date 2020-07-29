import java.util.Scanner;

public class MagicalWord {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter");
		int t=sc.nextInt();
		
		
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			sc.nextLine();
			String s=sc.nextLine();
			
			for(int j=0;j<n;j++) {
				check(s.charAt(j));
			}
			System.out.println();
		}
	}

	 static void check(int num) {
		//char [] arr= {'C', 'G', 'I', 'O', 'S', 'Y'};
		int [] arr= {67, 71, 73, 79, 83, 89,97,101,103,107,109,113};
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.print((char)num);
				flag=1;
				break;
			}
		}
		if(flag==0) {
				if(num>67 && num<113) {
					for(int i=1;i<arr.length;i++) {
						if(num>arr[i-1] && num<arr[i]) {
							if(Math.abs(num-arr[i-1])>Math.abs(num-arr[i])) {
								System.out.print((char)arr[i]);
								return;
								//break;
							}
							else {
								System.out.print((char)arr[i-1]);
								return;
								//break;
							}
						}
					}
				}
				else if(num<67) {
					System.out.print((char)67);
					return;
				}
				else if(num>113) {
					System.out.print((char)113);
					return;
				}
			}
		
	}

}
