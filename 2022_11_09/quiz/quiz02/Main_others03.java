package quiz02;

import java.util.Scanner;

public class Main_others03 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int [] a = new int[6];
      for(int i = 0; i<a.length; i++) {
         a[i] = sc.nextInt();
      }
      sc.close();
      int b = a[0];
      int c = a[0];
      for(int i = 0; i <a.length; i++) {
         if(b>a[i]) {
            b = a[i];
         }
         if(c<a[i]) {
            c = a[i];
         }
      }
      System.out.print("max : "+ c+ " , " + "min : "+ b );
   }
}
