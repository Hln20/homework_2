package ru.geekbrains.homework_2;

public class Main {

    public static void main(String[] args) throws MyArrayDataException {
        int result = 0;

        String[][] array = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},

        };
        check(array);

    }



    public static void check(String[][] array) throws MyArrayDataException {
            int total = 0;

            if (array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4) {
                throw new MyArraySizeException();
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4 ; j++) {
                    try {
                        total += Integer.parseInt(array[i][j]);
                    }catch (IllegalArgumentException e){
                        throw new MyArrayDataException("in a raw " + (i+1) + " column "  + (j+1));
                    }
                }

            }
        System.out.println(total);
        }


}

