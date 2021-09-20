package com.Learn;

import java.util.Scanner;

class Calculator {
  double a, b;

  Calculator(double a, double b) {
    this.a = a;
    this.b = b;
  }

  double add() {
    return a + b;
  }

  double sub() {
    return a - b;
  }

  double mul() {
    return a * b;
  }

  double div() {

    return a / b;
  }
}

public class Program1 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a  : ");
    double a = scanner.nextDouble();
    System.out.println("Enter b  : ");
    double b = scanner.nextDouble();
    System.out.println("Enter the Operation (+,-,*,/)  : ");
    String op = scanner.next();
    Calculator obj = new Calculator(a, b);
    double c = 0;
    switch (op) {
      case "+":
        c = obj.add();
        break;
      case "-":
        c = obj.sub();
        break;
      case "*":
        c = obj.mul();
        break;
      case "/":
        c = obj.div();
        break;
      default:
        System.out.println("Invalid Operation Code !!1");
    }
    System.out.println(a + op + b + " = " + c);
  }

}


