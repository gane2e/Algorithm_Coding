import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int year = sc.nextInt();
    	
    	if(year >= 1 && year <=4000) {
    		
    		if ( (year %4 == 0) && ( (year%100 != 0) || (year%400 == 0) ) )
    			System.out.println("1");
    		else
    			System.out.println("0");
    			
    	} 
    	else 
    		System.out.println("1보다 크거나 같고, 4000보다 작거나 같은 자연수를 입력하세요.");
    	
    	
    	
    }

}