public class Solution1218 {

    public static void main(String[] args) {

    }

    //n의 배수
    public int solution(int num, int n) {
        int answer = 0;

        if (num % n == 0) {
            return 1;
        } else return 0;
    }

    //공배수
    public int solution1(int number, int n, int m) {
        int answer = 0;
        if (number % n == 0 && number % m == 0)
            answer = 1;
        else
            answer = 0;
        return answer;
    }

    //홀짝에 따라 다른 값 반환하기
    public int solution2(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 1 && i % 2 == 1) {
                answer += i;
            } else if (n % 2 == 0 && i % 2 == 0) {
                answer += i * i;
            }
        }
        return answer;
    }


    //조건 문자열
    public int solution3(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (ineq.equals(">") && eq.equals("=")) {
            answer = n >= m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("=")) {
            answer = n <= m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("!")) {
            answer = n > m ? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("!")) {
            answer = n < m ? 1 : 0;
        }
        return answer;
    }


    //flag에 따라 다른 값 반환하기
    public int solution4(int a, int b, boolean flag) {
        int answer = 0;
        if (flag == true)
            answer = a + b;
        else
            answer = a - b;

        return answer;
    }

    
}
