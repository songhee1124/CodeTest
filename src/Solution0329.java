public class Solution0329 {
    public static void main(String[] args) {

    }
    //기초day25
    //정사각형으로 만들기
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        if (row > col) {
            int[][] temp = new int[row][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    temp[i][j] = arr[i][j];
                }
                temp[i][col] = 0;
            }
            return temp;
        } else if (col > row) {
            int[][] temp = new int[col][col];
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    temp[j][i] = arr[j][i];
                }
                temp[row][i] = 0;
            }
            return temp;
        } else {
            return arr;
        }
    }

    //정사각형으로 만들기 다른 방법
    public int[][] solution1(int[][] arr) {
        if (arr.length == arr[0].length) return arr;

        int N = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[N][N];
        for (int i = 0;i < N;i++) {
            for (int j = 0;j < N;j++) {
                if (i >= arr.length || j >= arr[0].length)
                    answer[i][j] = 0;
                else
                    answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }


}
