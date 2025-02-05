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
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		
		int n = Integer.parseInt(st.nextToken());
		int[] array = new int[n];
		int x = Integer.parseInt(st.nextToken());
		
		String arrStr = br.readLine();
		st = new StringTokenizer(arrStr);
		
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<array.length; i++) {
			if(array[i] < x)
				bw.write(Integer.toString(array[i]) + " ");
		}
		bw.flush();

		br.close();
		bw.close();
		
	}
}

