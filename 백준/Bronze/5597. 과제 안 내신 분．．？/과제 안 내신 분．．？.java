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
      
      int[] box = new int[30];

   
      
      for(int i=0; i<28; i++) {
         String num = br.readLine();
         StringTokenizer st = new StringTokenizer(num);
         
         int j = Integer.parseInt(st.nextToken());
   
        	 box[j-1] = 1;	 
      }
      for(int i=0; i<box.length; i++) {
    	  if(box[i] != 1)
    	  bw.write(String.valueOf( (i+1) + "\n" ));
      }
      
      bw.flush();
      br.close();
      bw.close();
      
   }
}


