import java.util.ArrayList;
import java.util.Arrays;

public class Solution0119 {
    public static void main(String[] args) {

        Solution0119 sol = new Solution0119();

//        int [] arr ={5,1,4};
//        sol.solution(arr);

        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        sol.solution1(arr, flag);
    }

    //기초 day 19
    //배열의 원소만큼 추가하기
    public int[] solution(int[] arr) {
        int[] answer = {};

        int sum = 0;

        // arr의 각 인덱스의 합 = 반환할 인덱스의 길이
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        answer = new int[sum];

        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[idx++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    //빈 배열에 추가, 삭제하기
    public int[] solution1(int[] arr, boolean[] flag) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) //true일 경우만 if문으로 감
            {
                for (int j = 0; j < arr[i] * 2; j++) {
                    result.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    result.remove(result.size() - 1);
                }
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        System.out.println(Arrays.toString(answer));
        System.out.println(result);
        return answer;
    }
}
