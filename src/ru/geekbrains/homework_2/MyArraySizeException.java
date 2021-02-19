package ru.geekbrains.homework_2;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Wrong size");
    }
}
