package ru.geekbrains.homework_2;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(String message) {
        super("Wrong data "+ message);
    }
}
