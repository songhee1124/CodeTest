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

//        int start = 10;
//        int end_num = 3;
//        sol.solution1(start, end_num);

//        int[] arr={1, 1, 1, 1, 0};
//        int idx=3;
//        sol.solution(arr,idx);

//        String my_string ="aAb1B2cC34oOp";
//        sol.solution(my_string);

        String[] spell={"s", "o", "m", "d"};
        String[] dic={"moos", "dzx", "smm", "sunmmo", "som"};
        sol.solution(spell,dic);

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
//    public String solution(String my_string, int s, int e) {
//        String answer = "";
//        String []str = my_string.split("");
//        while (s < e) {
//            String temp = str[s];
//            str[s] = str[e];
//            str[e] = temp;
//
//            s++;
//            e--;
//        }
//
//        for(int i=0; i< str.length; i++){
//            answer += str[i];
//        }
//        return answer;
//    }
//
//    //세로읽기
//    public String solution(String my_string, int m, int c) {
//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < my_string.length(); i += m) {
//            String sub = my_string.substring(i, i + m);
//            result.add(sub);
//        }
//
//        String answer = "";
//        for (String str : result) {
//            answer += str.substring(c-1, c);
//        }
//
//        return answer;
//    }

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
//    public int[] solution(String my_string) {
//        int[] answer = new int[52];
//        for (int i = 0; i < my_string.length(); i++) {
//            if (64 < my_string.charAt(i) && my_string.charAt(i) < 91) {
//                answer[my_string.charAt(i) - 65]++;
//            } else if (my_string.charAt(i) > 96 && my_string.charAt(i) < 123) {
//                answer[my_string.charAt(i) - 71]++;
//            }
//
//        }
//        System.out.println(Arrays.toString(answer));
//        return answer;
//    }

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
        int index=0;
        for(int i=0; i< arr.length; i++){

            if(index>=idx && arr[i]==1){
                answer = index;
                break;
            } else if (index>=idx && arr[i]==0) {
                answer=-1;

            }
            index++;
        }
        System.out.println(answer);
        return answer;
    }

    //입문 day21
    //숨어 있는 숫자의 덧셈(2)
    public int solution(String my_string) {
        int answer = 0;
        String[] numbers = my_string.replaceAll("[^\\d]+", " ").trim().split(" ");
        System.out.println(Arrays.toString(numbers));
        for( String num : numbers ){
            if (!num.isEmpty()) { //문자열 앞에 처음부터 공백이 있을경우 trim을 사용해 공백을 제거해도 남아있음.
                answer += Integer.parseInt(num);
                System.out.println(answer);
            }
        }
        return answer;
    }
    //안전지대
    class Solution {
        public int solution(int[][] board) {
            ArrayList<int[]> list = new ArrayList<>();
            int answer = 0;
            int[] dx = {0,1,-1,0,-1,1,1,-1};
            int[] dy = {1,0,0,-1,-1,1,-1,1};

            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board[0].length; j++){
                    if(board[i][j] == 1){
                        int[] temp = {i,j};
                        list.add(temp);
                    }
                }
            }

            for(int a = 0 ; a < list.size(); a++){
                int i = list.get(a)[0];
                int j = list.get(a)[1];
                for(int k = 0 ; k < 8; k++){
                    if(dx[k] + i >= 0 && dy[k] + j >= 0 && dx[k] + i <= board.length-1 && dy[k] + j <= board.length-1)
                        board[dx[k] + i][dy[k] + j] = 1;
                }
            }

            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board[0].length; j++){
                    if(board[i][j] == 0) answer+=1;
                }
            }
            return answer;
        }
    }
    //삼각형의 완성조건(2)

    //외계어 사전
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        boolean wordCheck = false;
        for (String word : dic) {
            int count = 0;
            for (String s : spell) {
                if (word.contains(s)) count++;
            }
            if (count == spell.length) {
                wordCheck = true;
                break;
            }
        }
        answer=wordCheck ? 1 : 2;
        System.out.println(answer);
        return answer;
    }
}
