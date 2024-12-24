package com.example.sudoku;

public class Sudoku {
    public static int randomN() {
        int n;
        while(true) {
            n = (int)(Math.random() * 10);

            if(n != 0) {
                break;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int[][] sudoku = new int[9][9];

        //int n = (int)(Math.random() * 10);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(j == 0) {
                   System.out.print("| ");
                }

                sudoku[i][j] = randomN();
                System.out.print(sudoku[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
