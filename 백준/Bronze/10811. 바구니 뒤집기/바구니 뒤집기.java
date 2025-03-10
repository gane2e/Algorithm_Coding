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
		
		for(int i=0; i<box.length; i++) {
			box[i] = i+1;
		}

		for(int f=0; f<m; f++) {
			String i_j = br.readLine();
			st = new StringTokenizer(i_j);
			
			
			int i = (Integer.parseInt(st.nextToken()))-1;
			int j = (Integer.parseInt(st.nextToken()))-1;
			
			while(i < j) {
				int temp = box[i];
				box[i++] = box[j];
				box[j--] = temp;
			}

		}
		
		for(int i = 0; i<box.length; i++) {
			bw.write(Integer.toString(box[i]) + " ");
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}
}


