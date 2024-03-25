public class Solution0325 {
    public static void main(String[] args) {

    }
    //기초day24
    //특별한 이차원 배열1
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for(int i= 0; i<n;i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    answer[i][j]=1;
                }
                else
                    answer[i][j]=0;
            }
        }
        return answer;
    }
}
