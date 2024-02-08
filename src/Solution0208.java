import java.util.ArrayList;
import java.util.Arrays;

public class Solution0208 {
    public static void main(String[] args) {

    }
   //기초 day 22
   //배열의 원소 삭제하기
   public int[] solution(int[] arr, int[] delete_list) {

       Integer[] delete_list2 = new Integer[delete_list.length];
       for (int i = 0; i < delete_list.length; i++) {
           delete_list2[i] = Integer.valueOf(delete_list[i]);
       }

       ArrayList<Integer> List = new ArrayList<>();
       for (int num : arr) {
           List.add(num);
       }

       List.removeAll(Arrays.asList(delete_list2));

       int[] answer = new int [List.size()];
       for (int i = 0; i < List.size(); i++) {
           answer[i] = List.get(i);
       }
       return answer;
   }

   //부분 문자열인지 확인하기
   public int solution(String my_string, String target) {
       int answer = 0;
       if(my_string.contains(target)){
           answer =1;
       }
       else
           answer=0;

       return answer;
   }


}
