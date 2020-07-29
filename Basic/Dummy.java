
public class Dummy {
	public static void main(String...args) {
		char ch='y';
		int n=4;

			if(ch+n>'z') {
				
				int dum='z'-ch;
				int sec='a'+(n-dum);
				
				System.out.println(Character.toString(sec-1));
			}
			else {
				System.out.println(Character.toString(ch+n));
			}
	}

}
