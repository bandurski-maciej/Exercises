package com.infoshareacademy;

import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String userInput = scanner.nextLine();
    userInput = userInput.toLowerCase().trim();
    StringBuilder userInputReversed = new StringBuilder();

    userInputReversed.append(userInput).reverse();

    if (userInput.contentEquals(userInputReversed)) {

      System.out.println("Palindrome? YES");

    } else {

      System.out.println("Palindrome? NO");

    }

  }

}
