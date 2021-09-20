package com.Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program3 {
  public static void main(String args[]) {
    int num, n;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Number  :  ");
    num = scanner.nextInt();

    if (num % 2 == 1) {
      n = num;
    } else {
      n = num - 1;
    }
    List<Integer> arrList = new ArrayList<>();
    for (int i = 1; i > 0; i += 2) {
      arrList.add(i);
      if (arrList.size() == n) {
        System.out.println(arrList);
        break;
      }

    }
  }
}
