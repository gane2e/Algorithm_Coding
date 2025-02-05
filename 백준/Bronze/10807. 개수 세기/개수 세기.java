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
		int[] array = new int[n];
		
		String num = br.readLine();
		StringTokenizer st = new StringTokenizer(num);
	
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int v = Integer.parseInt(br.readLine());
		int c = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] == v)
				c++;
		}
		
		bw.write(Integer.toString(c));
		bw.flush();
		
		br.close();
		bw.close();
		
	}
}

