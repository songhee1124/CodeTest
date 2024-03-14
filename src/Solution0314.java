public class Solution0314 {
    public static void main(String[] args) {
    Solution0314 sol = new Solution0314();

    int [] date1 ={2010,02,03};
    int [] date2 ={2009,10,01};

    int result = sol.solution(date1,date2);
        System.out.println(result);

    }
    //기초 day 23
    //날짜 계산하기
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for (int i = 0; i < date1.length; i++) {
            if (date1[i] < date2[i]) {
                answer = 1;
                break;
            }
            else if(date1[i]>date2[i]){
                answer=0;
                break;
            }
        }
        return answer;
    }

}
