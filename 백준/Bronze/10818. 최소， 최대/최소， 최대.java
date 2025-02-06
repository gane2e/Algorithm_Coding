import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		if(n != 0 && n>0) {
			int[] array = new int[n];
			
			String num = br.readLine();
			StringTokenizer st = new StringTokenizer(num);
		
			for(int i=0; i<n; i++) {
				array[i] = Integer.parseInt(st.nextToken());
			}
			
			
			int max = -10000000;
			for(int i=0; i<array.length; i++) {
				if(array[i] >= max) 
					max = array[i];
			}
			
			int min = max;
			for(int i=0; i<array.length; i++) {
				if(array[i] < min)
					min = array[i];
			}
			
			bw.write(min + " " + max);
			bw.flush();
			br.close();
			bw.close();
		} 
			
		
		
	}
}

