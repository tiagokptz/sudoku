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

    public static boolean checkRow(int[][] sudoku, int n, int row) {
        for(int j = 0; j < 9; j++) {
            if(sudoku[row][j] == n) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkColumn(int[][] sudoku, int n, int column) {
        for(int i = 0; i < 9; i++) {
            if(sudoku[column][i] == n) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkMatrix3X3(int[][] sudoku, int n) { //aqui tem um processo diferente a ser feito
        return true;
    }

    public static void main(String[] args) {
        int[][] sudoku = new int[9][9];

        //int n = (int)(Math.random() * 10);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(j == 0) {
                   System.out.print("| ");
                }

                //da problema na criação das outra linhas pq os metodos para checar se existem numeros iguais esta errado
                //melhorar isso
                while (true) {
                    int n = randomN();

                    if(checkRow(sudoku, n, j) && checkColumn(sudoku, n, i) && checkMatrix3X3(sudoku, n)) {
                        sudoku[i][j] = n;
                        System.out.print(sudoku[i][j] + " | ");
                        break;
                    }
                }

            }
            System.out.println();
        }
    }
}
