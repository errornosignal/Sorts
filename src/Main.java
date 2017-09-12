package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void shellSort(List<Integer> list) {
        int h = 1;
        while (h <= list.size() / 3) {
            h = h * 3 + 1;
        } //remember h is the gap!

        while ( h > 0 ) {
            int inner = 0;
            int outer = 0;
            int temp = 0;
            for (outer = h; outer < list.size(); outer++) {
                temp = list.get(outer);
                inner = outer;

                while (inner > h - 1 && list.get(inner - h) >= temp) {
                    list.set(inner, list.get(inner - h));
                    inner -= h;
                }
                list.set(inner, temp);
            }
            h = (h - 1) / 3;
        }
    }




    public static void displayList(List<Integer> list) {
        for (int index = 0; index < list.size(); index++) {
            System.out.printf("%4d", list.get(index));
            if ((index + 1) % 10 == 0) {
                System.out.print("\n");
            } //else not ready for a linebreak doNothing();
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Random generator = new Random();
        for (int index = 0; index < 100; index++) {
            numbers.add(generator.nextInt(100) + 1);
        }

        displayList(numbers);
        shellSort(numbers);
        System.out.println("****************SORTED****************");
        displayList(numbers);
    }
}