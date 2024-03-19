public class Solution0319 {
    public static void main(String[] args) {

    }

    //기초day24
    //조건에 맞게 수열 변환하기3
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (k % 2 != 0) {
                answer[i] = arr[i] * k;
            } else {
                answer[i] = arr[i] + k;
            }
        }

        return answer;
    }
}
