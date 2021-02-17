package ru.javarush.c3zp0.lvl2;

import ru.javarush.c3zp0.IExercise;

import java.util.Scanner;

public class ExerciseCollectionsThree implements IExercise {
    private int lettersCount, digitsCount, symbolsCount;

    @Override
    public void execute() {
        for (Character letter: this.readLine().toCharArray()) {
            if (Character.isDigit(letter)) this.digitsCount++; else if (Character.isAlphabetic(letter)) this.lettersCount++; else this.symbolsCount++;
        }
        System.out.printf("Digits: %s\r\nLetters: %s\r\nSymbols: %s\r\n",
                this.digitsCount,
                this.lettersCount,
                this.symbolsCount
        );
    }

    private String readLine(){
        System.out.printf("Enter line for analyze: ");
        return new Scanner(System.in).nextLine();
    }
}
