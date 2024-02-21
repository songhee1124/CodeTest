public class Solution0221 {
    public static void main(String[] args) {

    }
    //기초 day23
    //정수 찾기
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]==n){
                answer = 1;
            }
        }
        return answer;
    }
}
