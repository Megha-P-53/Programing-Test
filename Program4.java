package in.Megha.test;

import java.util.*;
public class Program4 {
 public static void main(String[] args) {
     int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
     Map<Integer, Integer> result = new HashMap<>();
     
     for (int i = 1; i <= 9; i++) {
         int count = 0;
         for (int num : input) {
             if (num % i == 0) {
                 count++;
             }
         }
         result.put(i, count);
     }

     for (int i = 1; i <= 9; i++) {
         System.out.println(i + ": " + result.get(i));
     }
 }
}

