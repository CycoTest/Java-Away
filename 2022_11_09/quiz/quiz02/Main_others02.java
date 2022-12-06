package quiz02;

import java.util.Scanner;

public class Main_others02 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int[] n = new int[6];
      
      for(int i=0;i<n.length;i++) {
         n[i]=scan.nextInt();
      }
      scan.close();
      
      int max=n[0];
      int min=n[0];
      
      for(int i=0;i<n.length;i++) {
         if(max<n[i]) {
            max=n[i];
         }
         else if(n[i]<min&& n[i]<max){
            min=n[i];
         }
      }
      System.out.println("max : "+max+", min : "+min);
   }
}
