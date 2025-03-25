package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
  public static void main(String[] args) {
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
    System.out.println(isSumInRange(11,11));
    printIfNumberPositive(-1);
    System.out.println(isNumberNegative(0));
    printMultipliedString("123", 3);
    System.out.println(isYearLeap(2025));
    changeBinaryNumbersInArray();
    createArrayWithHundredElements();
    applySomeLogicToArray();
    applySomeLogicToMatrix(5);
    System.out.println(Arrays.toString(createFixedLengthArray(5, 1)));
  }

  public static void printThreeWords() {
    System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
  }

  public static void checkSumSign() {
    int a = ThreadLocalRandom.current().nextInt(-10, 11);
    int b = ThreadLocalRandom.current().nextInt(-10, 11);

    if (a + b >= 0) {
      System.out.println("Сумма положительная");
    } else {
      System.out.println("Сумма отрицательная");
    }
  }

  public static void printColor() {
    int value = ThreadLocalRandom.current().nextInt(-255, 256);

    if (value <= 0) {
      System.out.println("Красный");
    } else if (value <= 100) {
      System.out.println("Желтый");
    } else {
      System.out.println("Зелёный");
    }
  }

  public static void compareNumbers() {
    int a = ThreadLocalRandom.current().nextInt(-10, 11);
    int b = ThreadLocalRandom.current().nextInt(-10, 11);

    if (a >= b) {
      System.out.println("a >= b");
    } else {
      System.out.println("a < b");
    }
  }

  public static boolean isSumInRange(int a, int b) {
    return 10 <= (a + b) && (a + b) <= 20;
  }

  public static void printIfNumberPositive(int a) {
    if (a >= 0) {
      System.out.println("Число положительное");
    } else {
      System.out.println("Число отрицательное");
    }
  }

  public static boolean isNumberNegative(int a) {
    return a < 0;
  }

  public static void printMultipliedString(String inputString, int multiplyNumber) {
    System.out.println(inputString.repeat(multiplyNumber));
  }

  public static boolean isYearLeap(int year) {
    return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
  }

  public static void changeBinaryNumbersInArray() {
    ArrayList<Integer> startArray = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      startArray.add(ThreadLocalRandom.current().nextInt(2));
    }
    System.out.println("перед изменениями " + startArray);
    for (int i = 0; i < startArray.size(); i++) {
      if (startArray.get(i) == 0) {
        startArray.set(i, 1);
      } else {
        startArray.set(i, 0);
      }
    }
    System.out.println("после изменений " + startArray);
  }

  public static void createArrayWithHundredElements() {
    int[] array = new int[100];

    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    System.out.println(Arrays.toString(array));
  }

  public static void applySomeLogicToArray() {
    int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < array.length; i++) {
      if (array[i] < 6) array[i] *= 2;
    }
    System.out.println(Arrays.toString(array));
  }

  public static void applySomeLogicToMatrix(int size) {
    int[][] matrix = new int[size][size];
    for (int i = 0; i < size; i++) {
      matrix[i][i] = 1;
      matrix[i][size - i - 1] = 1;
    }
    System.out.println(Arrays.deepToString(matrix));
  }

  public static int[] createFixedLengthArray(int len, int initialValue) {
    int[] array = new int[len];
    Arrays.fill(array, initialValue);
    return array;
  }
}