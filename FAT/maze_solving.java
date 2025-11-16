import java.util.*;

class maze_solving {

    public static boolean solver(
        int[][] input,
        int[][] output,
        int rows,
        int columns,
        int x,
        int y
    ) {
        if (x < 0 || y < 0 || y >= rows || (x >= columns && input[y][x] == 1)) {
            return false;
        }
        output[y][x] = 1;
        if (y == rows - 1 && x == columns - 1) {
            return true;
        } else {
            if (solver(input, output, rows, columns, y, x + 1)) return true;
            if (solver(input, output, rows, columns, y + 1, x)) return true;
            output[y][x] = 0;
            return false;
        }
    }

    public static void main(String[] args) {
        int maze[][] = {
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 0, 1, 0, 0 },
            { 1, 1, 1, 1 },
        };
        int rows = maze.length,
            columns = maze[0].length;
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = 0;
            }
        }
        if (solver(maze, result, rows, columns, 0, 0)) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
