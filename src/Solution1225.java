import java.util.Arrays;

public class Solution1225 {
    public static void main(String[] args) {
    Solution1225 sol = new Solution1225();

//    String[]quiz ={"3 - 4 = -3","5 + 6 = 11"};
//    sol.solution(quiz);


     String my_string ="Bcad";
     sol.solution7(my_string);
    }



    //입문 day 17
    //ox퀴즈
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            // 등호 기준으로 문자열을 분리
            String[] parts = quiz[i].split(" ");

            // 연산자와 피연산자 추출
            String operator = parts[1];
            int operand1 = Integer.parseInt(parts[0]);
            int operand2 = Integer.parseInt(parts[2]); // 수정된 부분

            // 연산 결과 확인 및 정답 배열에 저장
            if (operator.equals("-")) {
                answer[i] = (operand1 - operand2 == Integer.parseInt(parts[4])) ? "O" : "X";
            } else if (operator.equals("+")) {
                answer[i] = (operand1 + operand2 == Integer.parseInt(parts[4])) ? "O" : "X";
            }

            // 결과 출력
            System.out.println(answer[i]);
        }
        return answer;
    }

    //입문 day18
    //문자열 안에 문자열
    public int solution2(String str1, String str2) {
        int answer = 0;
        if (str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    //제곱수 판별하기
    public int solution3(int n) {
        int answer = 0;
        for(int i=1; i<=1000; i++){
            if(i*i == n){
                answer = 1;
                break;
            }else{
                answer = 2;
            }
        }
        return answer;
    }

    //제곱수 판별하기 다른방법
    public int solution4(int n) {
        if (n % Math.sqrt(n) == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    //세균증식
    public int solution5(int n, int t) {
        int answer = 0;
        for(int i = 1; i<=t; i++){
            n *=2;
        }
        return n;
    }

    //세균증식 다른방법
    public int solution6(int n, int t) {
        int answer = n;

        for (int i = 0; i < t; i++) {
            answer += answer;
        }
        return answer;
    }

    //문자열 정렬하기(2)
    public String solution7(String my_string) {
        String answer = "";
        String str =my_string .toLowerCase();
        char[] charArr = str.toCharArray(); // String to Char Array
        Arrays.sort(charArr); // Char Array 알파벳 순 정렬
        System.out.println(charArr);
         answer = new String(charArr);

        System.out.println(answer);
        return answer;
    }

    //문자열 정렬하기 (2) 다른 방법
    public String solution8(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
