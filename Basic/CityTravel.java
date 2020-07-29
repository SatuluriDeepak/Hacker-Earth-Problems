import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CityTravel {
	public static void main(String...args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s1=br.readLine().split(" ");
		int s=Integer.parseInt(s1[0]);	
		int x= Integer.parseInt(s1[1]);	
		int n=(int) Integer.parseInt(s1[2]);	
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			String[] s2=br.readLine().split(" ");
			arr1[i]=Integer.parseInt(s2[0]);
			arr2[i]=Integer.parseInt(s2[1]);	
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr1[j]>arr1[j+1]) {
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
					
					temp=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp;
				}
			}
		}
		int sum=0, daysc=0,i=0;
		while(sum<s) {
			daysc++;
			if(i<n && arr1[i]==daysc) {
				sum+=arr2[i];
				i++;
			}
			else {
				sum+=x;
			}
		}
		System.out.println(daysc);
		
	}

}
