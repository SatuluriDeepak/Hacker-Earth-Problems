import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;


public class MinMax {
	public static void main(String...args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Long, String> map = new HashMap<Long, String>(); 
        Long minMap = Collections.min(map.keySet()); 
        
    }
}
