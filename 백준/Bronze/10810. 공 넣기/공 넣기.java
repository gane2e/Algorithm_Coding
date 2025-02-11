import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
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
		
		for(int f=0; f<m; f++) {
			String i_j_k = br.readLine();
			st = new StringTokenizer(i_j_k);
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			for(int f2=i-1; f2<j; f2++) {
				box[f2] = k;
			}
		}
		for(int i=0; i<box.length; i++) {
			bw.write(box[i] + " ");
		}
		bw.flush();
		
		br.close();
		bw.close();
		
	}
}

