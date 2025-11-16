import java.util.*;

class nqueens {

    public static boolean isValid(char[][] board, int row, int col, int n) {
        // Check all previous columns
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') return false; // same row
            int diag1 = row - (col - j);
            int diag2 = row + (col - j);
            if (diag1 >= 0 && board[diag1][j] == 'Q') return false; // main diagonal (\)
            if (diag2 < n && board[diag2][j] == 'Q') return false; // anti-diagonal (/)
        }

        return true;
    }

    public static boolean place(char[][] board, int col, int n) {
        if (col == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.err.println("exit");
            return true;
        }
        boolean flag = false;
        for (int row = 0; row < n; row++) {
            if (isValid(board, row, col, n)) {
                board[row][col] = 'Q';
                flag = place(board, col + 1, n) || flag;
                board[row][col] = '*';
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '*';
            }
        }
        boolean t = place(board, 0, n);
        if (t) {
            System.out.println("hehe");
        } else {
            System.out.println("nawh");
        }
    }
}
