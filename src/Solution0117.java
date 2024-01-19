import java.util.Arrays;

public class Solution0117 {
    public static void main(String[] args) {
        Solution0117 sol = new Solution0117();

        String myString = "ABBAA";
        String pat = "AABB";
        sol.solution(myString, pat);
    }

    //기초 day 18
    //문자열 바꿔서 찾기
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] str = myString.toCharArray();
        System.out.println(Arrays.toString(str));

        for (int i = 0; i < str.length; i++) {

            if (str[i] == 'A') {
                str[i] = 'B';
            } else if (str[i] == 'B') {
                str[i] = 'A';
            }
        }
        String str1 = new String(str);
        if (str1.contains(pat)) {
            answer = 1;
        } else
            answer = 0;

        System.out.println(answer);

        return answer;
    }

    //문자열 바꿔서 찾기 다른 방법
    public int solution1(String myString, String pat) {
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
    }

    //rny_string
    public String solution2(String rny_string) {
        String answer = "";
        answer = rny_string.replaceAll("m", "rn");

        return answer;
    }
}
