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

    //입문 day14
    //가까운 수
    public int solution5(int[] array, int n) {
        int answer = 0;
        int diff = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            diff = Math.abs(n - array[i]);
            if (diff < min) {
                min = diff;
                answer = array[i];

            } else if (diff == min && array[i] < answer) {
                answer = array[i];
            }
        }

        return answer;
    }


    //369게임
    public int solution6(int order) {
        int answer = 0;
        String orderString = Integer.toString(order); // 숫자를 문자열로 변환
        String[] numArray = orderString.split(""); // 문자열을 한 글자씩 나눠 배열에 저장

        // 배열의 값이 3의 배수인 경우 answer를 증가
        for (int i = 0; i < numArray.length; i++) {
            int digit = Integer.parseInt(numArray[i]); // 문자열을 다시 정수로 변환
            if (digit == 3 || digit == 6 || digit == 9) {
                answer++;
            }
        }
        return answer;
    }


    //암호해독
    public String solution7(String cipher, int code) {
        String answer = "";
        for (int i = code - 1; i < cipher.length(); i += code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }

    //대문자와 소문자
    public String solution8(String my_string) {
        String answer = "";
        char[] charArray = my_string.toCharArray();

        for (int index = 0; index < charArray.length; index++) {
            if (Character.isUpperCase(charArray[index])) {
                answer += String.valueOf(charArray[index]).toLowerCase();
            } else
                answer += String.valueOf(charArray[index]).toUpperCase();
        }

        return answer;
    }
}
