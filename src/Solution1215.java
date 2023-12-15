import java.util.Arrays;

public class Solution1215 {
    public static void main(String[] args) {

    }

    //입문 day13
    //컨트롤 제트
    public int solution(String s) {
        int answer = 0;
        String[] sArray = s.split(" ");
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i].equals("Z")) {
                answer -= Integer.parseInt(sArray[i - 1]);
                continue;
            }
            answer += Integer.parseInt(sArray[i]);
        }
        return answer;
    }

    //배열 원소의 길이
    public int[] solution1(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i=0; i<strlist.length;i++){
            answer[i] =strlist[i].length();
        }
        return answer;
    }

    //중복된 문자 제거
    public String solution2(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if(!answer.contains(String.valueOf(my_string.charAt(i)))){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    //삼각형의 완성조건(1)
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        if (sides[2] < sides[0] + sides[1]) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }


}
