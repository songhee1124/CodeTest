import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1227 {
    public static void main(String[] args) {
        Solution1227 sol = new Solution1227();

//        int q=3;
//        int r=1;
//        String code="qjnwezgrpirldywt";
//        sol.solution( q,  r, code);


//        String my_string ="Programmers";
//        sol.solution(my_string);

//        int n=10;
//        int k=3;
//        sol.solution(n,k);

//        String my_string ="apporoograpemmemprs";
//        int[]indices = {1, 16, 6, 15, 0, 10, 11, 3};
//        sol.solution(my_string,indices);

        int start = 10;
        int end_num = 3;
        sol.solution1(start, end_num);
    }
    //기초 day 10
    //문자열의 앞의 n글자
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(0, n);
        return answer;
    }

    //접두사인지 확인하기
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        if(my_string.startsWith(is_prefix)){
            answer = 1;
        }
        return answer;
    }

    //문자열 뒤집기
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String []str = my_string.split("");
        while (s < e) {
            String temp = str[s];
            str[s] = str[e];
            str[e] = temp;

            s++;
            e--;
        }

        for(int i=0; i< str.length; i++){
            answer += str[i];
        }
        return answer;
    }

    //세로읽기
    public String solution(String my_string, int m, int c) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i += m) {
            String sub = my_string.substring(i, i + m);
            result.add(sub);
        }

        String answer = "";
        for (String str : result) {
            answer += str.substring(c-1, c);
        }

        return answer;
    }

    //qr code
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] str = code.split("");
        int index = 0;
        for (int i = 0; i < str.length; i++) {

            if (index % q == r) {
                answer += str[i];
                System.out.println(answer);
            }
            index++;
        }
        return answer;
    }


    //기초 day11
    //문자 개수 세기
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            if (64 < my_string.charAt(i) && my_string.charAt(i) < 91) {
                answer[my_string.charAt(i) - 65]++;
            } else if (my_string.charAt(i) > 96 && my_string.charAt(i) < 123) {
                answer[my_string.charAt(i) - 71]++;
            }

        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    // 배열 만들기1
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];

        for (int i = 0; i < n / k; i++) {
            answer[i] = k * (i + 1);
            System.out.println(answer[i]);
        }

        return answer;
    }

    //글자지우기
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        sb.append(my_string);
        for (int i = 0; i < indices.length; i++) {
            //answer = String.valueOf(sb.deleteCharAt(indices[i]));
            sb.setCharAt(indices[i], ' ');
            answer = sb.toString().replace(" ", "");
            System.out.println(answer);
        }
        return answer;
    }

    //카운트 다운
    public int[] solution1(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];

//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = start;
//            start--;
//
//            // start가 end_num보다 작아지면 반복문 종료
//            if (start < end_num) {
//                break;
//            }
//        }

        for (int i = 0; i < answer.length; i++) {
            if (start >= end_num) {
                answer[i] = start;
                start--;
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    // 가까운 1 찾기
    public int solution(int[] arr, int idx) {
        int answer = 0;
        return answer;
    }
}
