import java.util.Arrays;

public class Solution0326 {
    public static void main(String[] args) {

        Solution0326 sol = new Solution0326();
        int n = 4;
        sol.solution(n);


    }

    //기초day 25
    //정수를 나선형으로 배치하기
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int value = 1;
        int row = 0;
        int col = 0;
        int direction = 0;

        while (value <= n * n) {
            answer[row][col] = value++;

            if (direction == 0) {
                if (col == n - 1 || answer[row][col + 1] != 0) {
                    direction = 1;
                    row++;
                } else {
                    col++;
                }
            } else if (direction == 1) {
                if (row == n - 1 || answer[row + 1][col] != 0) {
                    direction = 2;
                    col--;
                } else {
                    row++;
                }
            } else if (direction == 2) {
                if (col == 0 || answer[row][col - 1] != 0) {
                    direction = 3;
                    row--;
                } else {
                    col--;
                }
            } else if (direction == 3) {
                if (row == 0 || answer[row - 1][col] != 0) {
                    direction = 0;
                    col++;
                } else {
                    row--;
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }

        return answer;
    }
}
