package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> ints = SetInts();
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (int number : ints) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        System.out.println("Несовпадающие числа в последовательности:");
        for (int uniqueNumber : uniqueNumbers) {
            System.out.println(uniqueNumber);
        }
    }
        public static ArrayList<Integer> SetInts() {
            Scanner in = new Scanner(System.in);
            ArrayList<Integer> ints = new ArrayList<Integer>();
            System.out.println("Введите числа. После введения последовательности чисел введите 0.");
            while (true) {
                int input = in.nextInt();
                if (input == 0)
                    break;
                ints.add(input);
            }
            return ints;
        }
    }