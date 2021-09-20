package com.Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {
  public static void main(String args[]) {
    int num;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Number  :  ");
    num = scanner.nextInt();
    List<Integer> arrList = new ArrayList<>();
    for (int i = 1; i > 0; i += 2) {
      arrList.add(i);
      if (arrList.size() == num) {
        System.out.println(arrList);
        break;
      }

    }
  }
}
