package ru.javarush.c3zp0.lvl2;

import ru.javarush.c3zp0.IExercise;

import java.util.Scanner;

public class CollectionsFour implements IExercise {

    @Override
    public void execute() {
        int[] numbers = this.readNumbers();
        if (numbers[0] < numbers[1]) System.out.printf("First number is less that second\r\n"); else System.out.printf("First number is more or equals to second\r\n");
    }

    private int[] readNumbers(){
        int[] numbers = new int[2];
        Scanner stdin = new Scanner(System.in);
        System.out.printf("Enter first number ");
        numbers[0] = stdin.nextInt();
        System.out.printf("Enter second number: ");
        numbers[1] = stdin.nextInt();
        return  numbers;
    }
}
