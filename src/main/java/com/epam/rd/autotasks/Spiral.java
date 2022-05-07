package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int count = 1;
        int max = rows * columns;
        for (int j = 0; count <= max; j++){
            for (int i = j; i < columns - j; i++){
                array[j][i] = count;
                count++;
            }
            if (count >= max){
                break;
            }
            for (int i = j + 1; i < rows - j; i++) {
                array[i][columns - j - 1] = count;
                count++;
            }
            if (count >= max){
                break;
            }
            for (int i = columns - j - 2 ; i >= j; i--) {
                array[rows - j - 1][i] = count;
                count++;
            }
            if (count >= max){
                break;
            }
            for (int i = rows - j - 2; i > j; i--) {
                array[i][j] = count;
                count++;
            }
            if (count >= max){
                break;
            }
        }
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if (array[i][j] == 0){
                    array[i][j] = count;
                }
            }
        }

        /*for (int i = 0; i < columns; i++){
            array[0][i] = count;
            count++;
        }
        for (int i = 1; i < rows; i++) {
            array[i][columns - 1] = count;
            count++;
        }
        for (int i = columns - 2 ; i >= 0; i--) {
            array[rows - 1][i] = count;
            count++;
        }
        for (int i = rows - 2; i > 0; i--) {
            array[i][0] = count;
            count++;
        }*/



        return array;
    }
}
