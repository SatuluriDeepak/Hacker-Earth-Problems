import java.util.Scanner;
import java.util.TreeSet;

public class PrintHackerEarth {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s1=sc.nextLine();
		TreeSet<Integer> set=new TreeSet<Integer>();
		int h=0,a=0,c=0,k=0,e=0,r=0,t=0;
		for(int i=0;i<n;i++) {
			char cc=s1.charAt(i);
			switch(cc) {
			case 'a':
				a++;
				break;
			case 'c':
				c++;
				break;
			case 'e':
				e++;
				break;
			case 'h':
				h++;
				break;
			case 'r':
				r++;
				break;
			case 't':
				t++;
				break;
			case 'k':
				k++;
				break;
			}
		}
		a=a/2;
		e=e/2;
		h=h/2;
		r=r/2;
		
		
		
		set.add(a);set.add(c);set.add(e);set.add(h);
		set.add(r);set.add(t);set.add(k);
		
		System.out.println(set.first());
		
	}

}
