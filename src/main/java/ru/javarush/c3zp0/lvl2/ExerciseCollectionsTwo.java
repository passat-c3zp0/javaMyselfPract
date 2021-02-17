package ru.javarush.c3zp0.lvl2;

import ru.javarush.c3zp0.IExercise;

import java.util.Scanner;

public class ExerciseCollectionsTwo implements IExercise {
    private double firstNumber, secondNumber, result;

    @Override
    public void execute() {
        this.readNumbers();
        try {
            if (this.secondNumber == 0) throw new ArithmeticException(); else this.result = this.firstNumber / this.secondNumber;
        } catch (ArithmeticException exception){
            if (this.firstNumber < 0) this.result = Double.NEGATIVE_INFINITY; else this.result = Double.POSITIVE_INFINITY;
        }
        System.out.printf("Result of divide %s by %s = %s", this.firstNumber, this.secondNumber, this.result);
    }

    private void readNumbers(){
        Scanner stdin = new Scanner(System.in);
        System.out.printf("Enter divided: ");
        this.firstNumber = stdin.nextInt();
        System.out.printf("Enter divider: ");
        this.secondNumber = stdin.nextInt();
    }
}
