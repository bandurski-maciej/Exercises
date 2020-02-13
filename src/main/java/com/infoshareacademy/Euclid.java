package com.infoshareacademy;

import java.util.Scanner;

public class Euclid {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Proszę podać pierwszą liczbę: ");
    int firstNumber = scanner.nextInt();
    System.out.println("Proszę podać drugą liczbę: ");
    int secondNumber = scanner.nextInt();

    int maxNumber = Math.max(firstNumber, secondNumber);
    int minNumber = Math.min(firstNumber, secondNumber);
    boolean modulo = false;
    int moduloNumber;

    do {

      if (maxNumber % minNumber == 0) {

        System.out.println(minNumber);
        modulo = true;

      } else {

        moduloNumber = maxNumber % minNumber;
        maxNumber = minNumber;
        minNumber = moduloNumber;

      }

    } while (!modulo);

  }

}
