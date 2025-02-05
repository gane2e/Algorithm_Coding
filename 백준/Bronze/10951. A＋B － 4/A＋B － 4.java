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
		
		boolean bool = true;

		while(bool) {
			
			String s = br.readLine();
			if(s != null) {
				StringTokenizer st = new StringTokenizer(s);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int sum = a+b;
				bw.write(Integer.toString(sum) + "\n");
				bw.flush();
			} else
				bool = false;
		}
		br.close();
		bw.close();
		
	}
}

