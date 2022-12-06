package quiz02;

import java.util.Scanner;

public class Main_Bubble_sort {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[6];

      for (int i = 0; i < arr.length; i++) {
         arr[i] = sc.nextInt();
      }
      sc.close();

      for (int j = 0; j < arr.length - 1; j++) {
         for (int k = 0; k < arr.length - 1; k++) {
            if (arr[k] < arr[k + 1]) {
               int tmp = arr[k];
               arr[k] = arr[k + 1];
               arr[k + 1] = tmp;
            }
         }
      }
      System.out.println("max : " + arr[0] + " , min : " + arr[5]);
   }
}
