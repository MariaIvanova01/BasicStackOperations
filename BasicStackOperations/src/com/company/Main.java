package com.company;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int countToPush = (input[0]);
        int countToPop = (input[1]);
        int elToSearchFor = (input[2]);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < countToPush; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < countToPop; i++) {
            stack.pop();
        }
        if (stack.contains(elToSearchFor)){
            System.out.println("true");
        }
        if (stack.isEmpty()){
            System.out.println(0);
        }
        if (!stack.isEmpty() && !stack.contains(elToSearchFor)){
            System.out.println(Collections.min(stack));
        }
    }
}
