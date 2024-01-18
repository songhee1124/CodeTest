import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0118 {
    public static void main(String[] args) {
    Solution0118 sol = new Solution0118();

//    String myStr = "baconlettucetomato";
    String myStr ="abcb";
    sol.solution(myStr);

    }

    //기초 day 19
    //세개의 구분자
    public String[] solution(String myStr) {
        String[] answer;

        if (myStr.contains("a") || myStr.contains("b") || myStr.contains("c")) {
            myStr = myStr.replaceAll(",", "").replaceAll("[abc]", " ");
            answer = myStr.split("\\s+");


            if (answer.length > 0 && answer[0].isEmpty()) {
                // 배열을 복사하여 첫 번째 요소인 빈 문자열을 제거
                answer = Arrays.copyOfRange(answer, 1, answer.length);
            }
            // 결과 배열이 비어있는 경우
            else if (answer.length == 0) {
                answer=new String[]{"empty"};
                System.out.println(Arrays.toString(answer));
                return answer;
            }
        } else {
            answer = new String[]{"empty"};
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
    //배열의 원소만큼 추가하기
    //빈 배열에 추가, 삭제하기
    //배열만들기
    //무작위로 k개의 수 뽑기
}
