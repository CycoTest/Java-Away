package quiz02;

import java.util.Scanner;

public class Main_others04 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int inp = 0, max = 0, min = 10000;
      
      for(int i = 0; i < 6; i++) {
         inp = sc.nextInt();
         max = max > inp ? max : inp;
         min = min < inp ? min : inp;
      }
      sc.close();
      
      System.out.printf("max : %d, min : %d", max, min);
   }

}
