import java.math.BigInteger;

public class Solution0205 {
    public static void main(String[] args) {

    }
    //기초 day22
    //0 떼기
    public String solution(String n_str) {
        String answer = "";
        int i = Integer.parseInt(n_str);
        answer = String.valueOf(i);
        return answer;
    }

    //두수의 합
    public String solution(String a, String b) {
        String answer = "";
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        BigInteger result = bigA.add(bigB);
        answer = result.toString();
        return answer;
    }

    //문자열로 변환
    public String solution(int n) {
        String answer = "";
        answer =String.valueOf(n);
        return answer;
    }
}
