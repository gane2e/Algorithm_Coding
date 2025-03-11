import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[Integer.parseInt(st.nextToken())];
		int[] arr2 = new int[arr.length];
		
		int money = Integer.parseInt(st.nextToken());
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		while(money > 0) {
			
			int min=999999999;
			int arrCount = 0;
			
			for(int i=0; i<arr.length; i++) {
				arr2[i] = money/arr[i];
			}
			
			for(int i=0; i<arr2.length; i++) {
				
				if(arr2[i] < min && arr2[i]!=0) {
					min = arr2[i];
					
					arrCount = arr[i];
				}
			}
			
			money -= (arrCount*min);
			count += min;
		}
		
		System.out.println(count);
		
	}

}