import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HawkEye {
    public static void main(String args[] ) throws Exception {

    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 
    int a=Integer.parseInt(bf.readLine());
    String str=bf.readLine();
    StringTokenizer st = new StringTokenizer(str);
     int i=Integer.parseInt(st.nextToken());
    int j=Integer.parseInt(st.nextToken());
    int p=Integer.parseInt(st.nextToken());
 

    for(int k=0;k<a;k++){
        for(int q=0;q<a;q++){
	        int des=Math.max(Math.abs(i-k),Math.abs(j-q));
	        int result=p-des;
	        if(result<0)
	        result= 0;
	            
	            System.out.print(result+" ");
        }
        System.out.println();
    }
    }
}