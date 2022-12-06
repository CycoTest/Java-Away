package quiz02;

import java.util.Scanner;

public class Main_others01 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int[] ar = new int[6];
      int max = 0;
      int min = 0;
      for (int i = 0; i < ar.length; i++) {
         ar[i] = sc.nextInt();
         if (i == 0) {
            max = ar[0];
            min = ar[0];
         }
         
         if (max < ar[i]) {
            max = ar[i];
         }

         if (min > ar[i]) {
            min = ar[i];
         }
      }
      System.out.printf("max : %d\n", max);
      System.out.printf("min : %d", min);
      sc.close();
   }
}
