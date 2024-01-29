import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0129 {
    public static void main(String[] args) {

    }
    //기초 day20
    //배열의 길이에 따라 다른 연산하기

    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 1 && i % 2 == 0) {
                answer[i] = arr[i] + n;
            } else if (arr.length % 2 == 0 && i % 2 == 1) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }

        return answer;
    }

    //뒤에서 5등까지
    public int[] solution1(int[] num_list) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(num_list);

        for (int i = 0; i < 5; i++) {
            list.add(num_list[i]);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    //뒤에서 5등까지 다른 방법
    public int[] solution2(int[] num_list) {
        int [] answer = new int[5];
        Arrays.sort(num_list);

        for (int i = 0; i < 5; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }

}
