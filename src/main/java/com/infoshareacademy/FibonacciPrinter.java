package com.infoshareacademy;

import java.util.Scanner;

public class FibonacciPrinter {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int inputNumber = scanner.nextInt();
    int a = 0;
    int b = 1;
    int c = 0;
    int iterator = 0;

    while (iterator < inputNumber) {

      System.out.println(c);
      c = a + b;
      a = b;
      b = c;

      iterator++;

    }

  }

}
