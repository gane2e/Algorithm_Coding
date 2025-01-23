import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	
    	String str = Integer.toString(b);
    	String[] str1 = str.split("");
    	
    	
    	int intValue1 = Integer.valueOf(str1[2]).intValue();
    	int intValue2 = Integer.valueOf(str1[1]).intValue();
    	int intValue3 = Integer.valueOf(str1[0]).intValue();
    	
    	System.out.printf("%d\n%d\n%d\n%d", 
    			a*intValue1, a*intValue2 ,a*intValue3 , a*b);
    	
    }

}