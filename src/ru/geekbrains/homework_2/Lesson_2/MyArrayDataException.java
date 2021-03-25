package ru.geekbrains.homework_2.Lesson_2;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int i, int j) {

        super("Wrong data in a raw " + (i+1) + " in a column " + (j+1));
    }


}