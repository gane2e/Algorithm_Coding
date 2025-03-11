import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[Integer.parseInt(br.readLine())];
		double[] arr2 = new double[arr.length];
		
		StringTokenizer tokenizer = new StringTokenizer(br.readLine());
		int max=0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(tokenizer.nextToken());
			
			if(arr[i] > max)
				max = arr[i];
		}
		
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr2[i] = (double)arr[i]/max*100;
			sum += arr2[i];
		}
		System.out.println(sum/arr.length);
		
	}
}


