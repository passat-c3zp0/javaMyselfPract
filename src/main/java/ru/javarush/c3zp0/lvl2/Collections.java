package ru.javarush.c3zp0.lvl2;

import  ru.javarush.c3zp0.IExercise;
import ru.javarush.c3zp0.lvl2.*;
import java.util.Scanner;

public class Collections {
    private IExercise[] exercises = {
            new ExerciseCollectionsOne(),
            new ExerciseCollectionsTwo(),
            new ExerciseCollectionsThree(),
            new CollectionsFour(),
            new ExerciseArrayListOne()
    };

    public void executeAll(){
        for (IExercise exercise: this.exercises) {
            exercise.execute();
        }
    }
}


