public class Solution0313 {
    public static void main(String[] args) {

    Solution0313 sol = new Solution0313();
    int a = 3;
    int b = 5;
    int result =sol.solution(a,b);
        System.out.println(sol);
        System.out.println(result);
    }
    //기초 day23
    //주사위게임 1
    public int solution(int a, int b) {
        int answer = 0;

        if((a%2!=0)&&(b%2!=0)){
            answer= (int) ((int)Math.pow(a,2)+Math.pow(b,2));
        } else if ((a%2!=0)||(b%2!=0)) {
            answer=2*(a+b);
        }
        else {
            answer=Math.abs(a-b);
        }
        return answer;
    }


}
