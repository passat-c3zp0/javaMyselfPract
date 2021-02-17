package ru.javarush.c3zp0.lvl2;

import ru.javarush.c3zp0.IExercise;

import java.util.Scanner;

public class ExerciseCollectionsOne implements IExercise {

    @Override
    public void execute() {
        int[] numbers = this.readList();
        int counter = 0, tmp;
        while (counter < numbers.length - 1){
            if (numbers[counter] > numbers[counter + 1]){
                tmp = numbers[counter];
                numbers[counter] = numbers[counter + 1];
                numbers[counter + 1] = tmp;
                counter = 0;
            } else counter++;
        }
        for (int number: numbers) {
            System.out.printf("%s ", number);
        }
        System.out.println();
    }

    private int[] readList(){
        Scanner stdin = new Scanner(System.in);
        System.out.printf("Enter list length: ");
        int listLength = stdin.nextInt();
        int[] list = new int[listLength];
        for (int i = 0; i < listLength; i++){
            System.out.printf("Enter list element with index %s: ", i + 1);
            list[i] = stdin.nextInt();
        }
        return  list;
    }
}
