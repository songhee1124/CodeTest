public class Solution0102 {
    public static void main(String[] args) {

    }
    //기초 day13
    //n번째 원소부터
//    public int[] solution(int[] num_list, int n) {
//        int[] answer = new int[num_list.length - n + 1];
//
//        for(int i = 0; i < answer.length; i++){
//            answer[i] = num_list[n-1];
//            n++;
//        }
//        return answer;
//    }
//
//    //순서바꾸기
//    public int[] solution(int[] num_list, int n) {
//        int[] answer = new int[num_list.length];
//        int index = 0;
//
//        for (int i = n; i < num_list.length; i++) {
//            answer[index++] = num_list[i];
//        }
//
//        for (int i = 0; i < n; i++) {
//            answer[index++] = num_list[i];
//        }
//        return answer;
//    }
//
//    //왼쪽 오른쪽
//    public String[] solution(String[] str_list) {
//        String[] answer = {};
//        for (int i = 0; i < str_list.length; i++) {
//            if (str_list[i].equals("l")) {
//                return Arrays.copyOfRange(str_list, 0, i);
//            } else if (str_list[i].equals("r")) {
//                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
//            }
//        }
//        return answer;
//    }
//
//    //n번째 원소까지
//    public int[] solution(int[] num_list, int n) {
//        int[] answer = new int[n];
//        for(int i = 0; i<n; i++){
//            answer[i] = num_list[i];
//        }
//        return answer;
//    }
//
//    //n개 간격의 원소들
//    public int[] solution(int[] num_list, int n) {
//        int[] answer = {};
//        if (num_list.length % n == 0) {
//            answer = new int[num_list.length / n];
//        } else {
//            answer = new int[num_list.length / n + 1];
//        }
//
//        int index = 0;
//        for (int i = 0; i < num_list.length; i += n) {
//            answer[index++] = num_list[i];
//        }
//        return answer;
//    }
}
