import java.util.Arrays;

public class Solution1221 {
    public static void main(String[] args) {
        Solution1221 sol = new Solution1221();


        String my_string="rermgorpsam";
        int[][] queries= {{2,3},{0,7},{5,9},{6,10}};
        sol.solution(my_string,queries);

    }

    //기초 day8
    //간단한 논리연산
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        answer=(x1||x2)&&(x3||x4);

        System.out.println(answer);
        return answer;
    }

    //주사위게임3
    public int solution(int a, int b, int c, int d) {

        if (a == b && b == c && c == d) { // abcd 모두 같다면
            return 1111 * a;
        } else if (a == b && b == c) { // abc만 같다면
            return ((10 * a + d) * (10 * a + d));
        } else if (a == c && c == d) { // acd만 같다면
            return ((10 * a + b) * (10 * a + b));
        } else if (a == b && b == d) { // abd만 같다면
            return ((10 * a + c) * (10 * a + c));
        } else if (b == c && c == d) { // bcd만 같다면
            return ((10 * b + a) * (10 * b + a));
        } else if (a == b && c == d) { // ab가 같고 cd가 같다면
            return ((a + c) * (Math.abs(a - c)));
        } else if (a == c && b == d) { // ac가 같고 bd가 같다면
            return ((a + b) * (Math.abs(a - b)));
        } else if (a == d && b == c) { // ad가 같고 bc가 같다면
            return ((a + b) * (Math.abs(a - b)));
        } else if (a == b && c != d) { // ab가 같고 cd가 다르다면
            return (c * d);
        } else if (a == c && b != d) { // ac가 같고 bd가 다르다면
            return (b * d);
        } else if (a == d && b != c) { // ad가 같고 bc가 다르다면
            return (b * c);
        } else if (b == c && a != d) { // bc가 같고 ad가 다르다면
            return (a * d);
        } else if (b == d && a != c) { // bd가 같고 ac가 다르다면
            return (a * c);
        } else if (c == d && a != b) { // cd가 같고 ab가 다르다면
            return (a * b);
        } else {
            return Math.min(Math.min(a, b), Math.min(c, d));
        }

    }

    //주사위 게임3 다른 방법
//    public int solution(int a, int b, int c, int d) {
//        int[] dice = {a, b, c, d};
//        Arrays.sort(dice);
//        // 배열로 정렬하면,
//        if (dice[0] == dice[3]) {  // 처음과 끝이 같으면 모두 같은 숫자
//            return 1111 * dice[0];
//        }
//        else if (dice[0] == dice[2]) {  // 세 숫자가 같은 경우 1
//            return (int) Math.pow((10 * dice[0] + dice[3]),2);
//        }
//        else if (dice[1] == dice[3]) {  // 세 숫자가 같은 경우 2
//            return (int) Math.pow((10 * dice[1] + dice[0]),2);
//        }
//        else if (dice[0] == dice[1] && dice[2] == dice[3]) { // 2개씩 같은 값
//            return (dice[0] + dice[2]) * Math.abs(dice[0] - dice[2]);
//        }
//        else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[2] == dice[3]) { // 2개는 동일하고, 나머지 주사위가 다른 경우
//            if (dice[0] == dice[1]) {
//                return dice[2] * dice[3];
//            }
//            else if (dice[1] == dice[2]) {
//                return dice[0] * dice[3];
//            }
//            else {
//                return dice[0] * dice[1];
//            }
//
//        }
//        else {
//            return dice[0];
//        }
//    }

    //글자 이어 붙여 문자열 만들기
    public String solution(String my_string, int[] index_list) {
        String answer = "";

        for(int i=0; i<index_list.length; i++){
            answer += my_string.charAt(index_list[i]);
        }

        return answer;
    }

    //9로 나눈 나머지
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] number_list = number.split("");
        for(int i = 0; i<number_list.length; i++){
            sum+=Integer.parseInt(number_list[i]);
        }
        answer = sum%9;
        return answer;
    }

    //문자열 여러번 뒤집기
//    public String solution(String my_string, int[][] queries) {
//        String answer = "";
//        String []str = my_string.split("");
//
//            for (int i = 0; i < queries.length; i++) {
//                String temp = str[queries[i][0]];
//                str[queries[i][0]] = str[queries[i][1]];
//                str[queries[i][1]] = temp;
//               System.out.println(Arrays.toString(str));
//            }
//
//        return answer;
//    }
    public String solution(String my_string, int[][] queries) {
        String answer = "";
//        char[] arr = my_string.toCharArray(); // 문자열을 문자 배열로 변환
        String []str = my_string.split("");
//        for (int[] query : queries) {
//            int start = query[0];
//            int end = query[1];

            for(int i=0; i<queries.length; i++){
                int start = queries[i][0];
            int end = queries[i][1];

            while (start < end) {
                String temp = str[start];
                str[start] = str[end];
                str[end] = temp;

                start++;
                end--;
            }
        }
            for(int i=0; i< str.length; i++){
                answer += str[i];
            }
        System.out.println(answer);
        return answer; // 문자 배열을 문자열로 변환하여 반환
    }

}
