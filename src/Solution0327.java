public class Solution0327 {
    public static void main(String[] args) {

    }
    //기초day25
    //특별한 이차원 배열2
    public int solution(int[][] arr) {
        int answer = 1;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i][j]!=arr[j][i]){
                    answer = 0;
                }
            }
        }
        return answer;
    }
}
