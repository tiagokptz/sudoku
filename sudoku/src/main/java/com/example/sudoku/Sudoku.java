package com.example.sudoku;

public class Sudoku {
    public static void main(String[] args) {
        int[][] sudoku = new int[9][9];

        //int n = (int)(Math.random() * 10);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(j == 0) {
                   System.out.print("| ");
                }
                sudoku[i][j] = (int)(Math.random() * 10);
                System.out.print(sudoku[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
