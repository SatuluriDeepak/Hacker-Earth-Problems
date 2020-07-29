import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PlayWithNumbers {
	public static void main(String...args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st1.nextToken());
		int q = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2=new StringTokenizer(br.readLine());
		long arr[]=new long[n+1];
		for(int i=0;i<n;i++) {
			String x=st2.nextToken();
			arr[i+1]=arr[i]+Integer.parseInt(x);
			
		}
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<q;i++) {
			long sum=0;
			StringTokenizer st3=new StringTokenizer(br.readLine());
			int l=Integer.parseInt(st3.nextToken());
			int r=Integer.parseInt(st3.nextToken());
			sum = arr[r]-arr[l-1];
			System.out.println(sum/((r-l)+1));
		}
		
	}

}
