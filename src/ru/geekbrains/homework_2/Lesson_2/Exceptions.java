package ru.geekbrains.homework_2.Lesson_2;

public class Exceptions {

    public static void main(String[] args) throws MyArrayDataException, MyArraySizeException {

        String[][] array = {
                {"1", "2", "3", "5"},
                {"1", "2", "5", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},

        };


        check(array);

    }


    public static void check(String[][] array) throws MyArrayDataException, MyArraySizeException {
        int total = 0;

        for (int i=0; i<4; i++) {
            if (array[i].length != 4){
                throw new MyArraySizeException();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                try {
                    total += Integer.parseInt(array[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j);
                }
            }

        }
        System.out.println(total);
    }


}
