package datastructures;

import java.util.Arrays;

public class WorkingWith2dArrays {

    public static void main(String[] args) {

        char [][] board = new char[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';
        System.out.println(Arrays.deepToString(board));

        char [][] board2 = new char[][] {
                {'O', 'X', 'X'},
                {'O', 'X', 'X'},
                {'O', 'X', 'X'}
        };

        System.out.println(Arrays.deepToString(board2));

    }
}
