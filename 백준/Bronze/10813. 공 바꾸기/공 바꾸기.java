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
		
		String n_m = br.readLine();
		StringTokenizer st = new StringTokenizer(n_m);
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] box = new int[n];
		int temp;
		
		for(int i=0; i<n; i++) {
			box[i] = i+1;
		}
		
		
		for(int i=0; i<m; i++) {
			String j_k = br.readLine();
			st = new StringTokenizer(j_k);
			
			int j = (Integer.parseInt(st.nextToken()))-1;
			int k = (Integer.parseInt(st.nextToken()))-1;
			
			temp = box[j];
			box[j] = box[k];
			box[k] = temp;
			
		}
		for(int i=0; i<box.length; i++) {
			bw.write(box[i] + " ");
		}
		bw.flush();
		
		br.close();
		bw.close();
		
	}
}


