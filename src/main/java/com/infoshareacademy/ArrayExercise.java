package com.infoshareacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExercise {

  public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5};
    int number = 6;

    List<int[]> numberList = new ArrayList<>();

    Arrays.stream(numbers)
      .forEach(value ->
        Arrays.stream(numbers)
          .forEach(value1 -> {
            if (value + value1 == number) {
              numberList.add(new int[]{value, value1});
            }
          }));

    for (int[] numberArray : numberList) {

      System.out.print(Arrays.toString(numberArray));

    }

  }

}
