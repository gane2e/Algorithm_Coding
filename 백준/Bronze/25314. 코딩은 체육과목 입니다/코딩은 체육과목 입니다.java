import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int n = x/4;
		String s = "long ";
		String num = "int"; 
		StringBuilder sb = new StringBuilder();
		
		boolean b = true;

		if(x%4 != 0)
			b = false;
		
		if(b) {
			for(int i=0; i<n; i++) 
				sb.append(s);
	
			System.out.print(sb + num);
		}
		sc.close();
		
	}
}

