package quiz02;

import java.util.Scanner;

public class Main_Tutor_answer {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int ar[] = new int[6];
      for (int i = 0; i < ar.length; i++) {
         ar[i] = sc.nextInt();
      }
      sc.close();

      for (int i = 0; i < ar.length; i++) {
         System.out.print(ar[i] + " ");
      }

      // min, max
//      int max = -9999, min = 9999;
      int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
      for (int i = 0; i < ar.length; i++) {
         if (max < ar[i]) {
            max = ar[i];
         }
         if (min > ar[i]) {
            min = ar[i];
         }
      }

      System.out.println("max : " + max + ", min : " + min);
   }
}
