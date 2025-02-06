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
		
		List<Integer> array = new ArrayList<>(); 
	
		for(int i=0; i<9; i++) {
			array.add(Integer.parseInt(br.readLine()));
		}
		
		int max = 0;
		int num = 0;
		for(int i=0; i<array.size(); i++) {
			if(array.get(i) > max) {
				max = array.get(i);
				num = i+1;
			}
		}
		
		bw.write(Integer.toString(max));
		bw.write("\n");
		bw.write(Integer.toString(num));
		bw.flush();
		
		br.close();
		bw.close();
		
	}
}

