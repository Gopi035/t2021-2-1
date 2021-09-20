package com.Learn;

import java.util.HashMap;

public class Program4 {
  public static void main(String args[]) {
    int[] myNum = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };
    int[] mul = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    HashMap<Integer, Integer> result = new HashMap<>();
    for (int mu : mul) {
      result.put(mu, 0);
    }

    for (int x : myNum) {
      for (int i : mul) {
        if (x % i == 0) {
          Integer integer = result.get(i);
          if (integer != null) {
            result.put(i, integer + 1);
          } else {
            result.put(i, 1);
          }
        }
      }

    }
    System.out.println(result);

  }

}


