package Recursion.Backtracking;

public class SudokuSolver {
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Check row & column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == (char)(number + '0') || board[row][i] == (char)(number + '0')) {
                return false;
            }
        }

        // Check 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = 0; i < 9; i++) {
            if (board[(row / 3) * 3 + i / 3][(col / 3) * 3 + i % 3] == (char)(number + '0')) {
                return false;
    }
}


        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        if (row == 9) return true;

        int nrow = 0, ncol = 0;
        if (col != 8) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        }

        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {
                board[row][col] = (char)(i + '0');
                if (helper(board, nrow, ncol)) return true;
                board[row][col] = '.';
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        SudokuSolver solver = new SudokuSolver();
        solver.solveSudoku(board);
        printBoard(board);
    }
}
