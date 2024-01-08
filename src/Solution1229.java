import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1229 {
    public static void main(String[] args) {
    Solution1229 sol = new Solution1229();

//    int n = 1;
//    int []slicer ={1, 5, 2};
//    int []num_list ={1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//    sol.solution(n,slicer,num_list);

//    int[]arr={1, 2, 3, 4, 5};
//    int [][] intervals={{1, 3}, {0, 4}};
//    sol.solution(arr, intervals);

    int []arr = {1, 2, 1, 4, 5, 2, 9};
//    sol.solution(arr);

    }
    //기초day12
    //리스트 자르기
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

            if(n==1){
                for(int i= 0; i<b+1; i++ ) {
                    list.add(num_list[i]);
                }
            }
            else if(n == 2) {
                for (int i = a; i < num_list.length; i++) {
                    list.add(num_list[i]);
                }
            }
            else if(n ==3) {
                for(int i = a; i<b+1; i++) {
                    list.add(num_list[i]);
                }
            }
            else if(n == 4) {
                for(int i = a; i<b+1; i+=c) {
                    list.add(num_list[i]);

                }
            }
        int size = list.size();
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    //첫 번재로 나오는 음수
//    public int solution(int[] num_list) {
//        int answer = 0;
//        int count =0;
//        for(int i =0; i< num_list.length; i++){
//
//            if(num_list[i]<0){
//              answer=count;
//                break;
//            }
//            else
//                answer=-1;
//
//            count++;
//        }
//        return answer;
//    }

    //배열 만들기 3
//    public int[] solution(int[] arr, int[][] intervals) {
//        List<Integer> list = new ArrayList<>();
//
//        for(int i = 0; i<intervals.length; i++){
//            for(int j = intervals[i][0]; j<= intervals[i][1]; j++){
//                list.add(arr[j]);
//            }
//        }
//
//        int size = list.size();
//        int[] answer = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            answer[i] = list.get(i);
//        }
//        System.out.println(Arrays.toString(answer));
//        return answer;
//    }

    //2의 영역
    public int[] solution(int[] arr) {

        int min = 10000;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }

        }
        if (min <= max) {
            return Arrays.copyOfRange(arr, min, max + 1);
        } else {
            return new int[]{-1};
        }

    }

    //2의 영역 다른 방법
//    public int[] solution(int[] arr) {
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> result = new ArrayList<>();
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]==2){
//                list.add(i);
//                // System.out.println(list);
//                // System.out.println(list.get(0));
//                // System.out.println(list.get(list.size()-1));
//            }
//        }
//
//        if(list.size() == 1){
//            return new int[]{2};
//        } else if (list.size() < 1) {
//            // 2가 적어도 두 번 이상 나와야 함
//            return new int[]{-1};
//        }
//
//
//        for(int j=list.get(0); j<=list.get(list.size()-1); j++){
//            result.add(arr[j]);
//        }
//
//        // Convert ArrayList<Integer> to int[]
//        int[] answer = new int[result.size()];
//        for (int i = 0; i < result.size(); i++) {
//            answer[i] = result.get(i);
//        }
//
//        return answer;
//    }
//
//
//    //배열 조각하기
//    public int[] solution(int[] arr, int[] query) {
//        int[] answer = new int [arr.length];
//        for(int i =0; i<query.length; i++){
//            if(i%2==0){
//               answer= Arrays.copyOfRange(arr, 0, query[i] + 1);
//            }
//            else
//                answer=Arrays.copyOfRange(arr, query[i], arr.length);
//        }
//        return answer;
//    }
}
