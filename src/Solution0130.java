import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0130 {
    public static void main(String[] args) {

    }
    //기초day21
    //뒤에서 5등 위로 (
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);

        for (int i = 5; i < num_list.length; i++) {
            answer[i - 5] = num_list[i];
        }

        return answer;
    }
}
