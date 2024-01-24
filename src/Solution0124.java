import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0124 {
    public static void main(String[] args) {
        Solution0124 sol = new Solution0124();

        int[]arr ={0, 1, 1, 1, 0};
        sol.solution(arr);
    }

    //기초 day19
    //배열 만들기6

    public int[] solution(int[] arr) {

        ArrayList<Integer> stk = new ArrayList<>();
        int i=0;
        while (i<arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
                i++;
            } else if (stk.get(stk.size() - 1) != arr[i]) {
                stk.add(arr[i]);
                i++;
            }
        }

        if (stk.isEmpty()){
            return new int[]{-1};
        }

        int[] answer = new int[stk.size()];
        for(int j=0; j<stk.size(); j++){
            answer[j]=stk.get(j);
        }
        System.out.println(Arrays.toString(answer));


        return answer;
    }

    //무작위로 k개의 수 뽑기
    public int[] solution2(int[] arr, int k) {
        int[] answer = new int[k];
        int[] kArr = Arrays.stream(arr).distinct().toArray();
        int len = kArr.length;
        for(int i =0; i<answer.length; i++) {
            if(len != 0) {
                len --;
                answer[i] = kArr[i];
            }else {
                answer[i] = -1;
            }
        }
        return answer;
    }

    //기초day20
    //배열의 길이를 2의 거듭 제곱으로 만들기
    public int[] solution3(int[] arr) {
        int len = arr.length;

        int pow = 0;
        while(len > Math.pow(2, pow)) {
            pow++;
        }

        int[] answer = new int[(int)Math.pow(2, pow)];
        for(int i = 0; i < len; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}
