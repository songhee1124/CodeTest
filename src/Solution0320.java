import java.util.Arrays;

public class Solution0320 {
    public static void main(String[] args) {
    Solution0320 sol =new Solution0320();

    String myString = "abcdevwxyz";
    String result = sol.solution(myString);
        System.out.println(result);

    }
    //기초 day24
    //I로 만들기
    public String solution(String myString) {
        String answer = "";
        answer = myString.replaceAll("[a-k]","l");
        return answer;
    }
}
