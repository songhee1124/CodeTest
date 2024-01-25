import java.util.Arrays;

public class Solution0125 {
    public static void main(String[] args) {
    Solution0125 sol = new Solution0125();

    int[] arr1 ={49, 13};
    int[]arr2={70, 11, 2};
    sol.solution(arr1,arr2);

    String[]strarr ={"a","bc","d","efg","hi"};
    sol.solution2(strarr);
    }
    //기초day20
    //배열비교하기
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1sum=0;
        int arr2sum=0;
        for(int i=0; i<arr2.length; i++) {
            if (arr1.length == arr2.length) {
                arr1sum += arr1[i];
                arr2sum += arr2[i];
                answer= arr1sum>arr2sum ?1:-1;

                if (arr1sum==arr2sum){
                    answer=0;
                }
            }
            else if (arr1.length !=arr2.length) {
                answer=(arr1.length > arr2.length)?1:-1; //arr1이 크다면 1 아니면 -1
            }

        }
        System.out.println(answer);
        return answer;
    }

    //배열 비교하기 다른 방법
    public int solution1(int[] arr1, int[] arr2) {
        if (arr1.length < arr2.length) return -1;
        else if (arr1.length > arr2.length) return 1;
        int arr1Sum = 0, arr2Sum = 0;
        for (int i = 0;i < arr1.length;i++) {
            arr1Sum += arr1[i];
            arr2Sum += arr2[i];
        }
        return arr1Sum == arr2Sum ? 0 : (arr1Sum > arr2Sum ? 1 : -1);
    }

    //문자열 묶기
    public int solution2(String[] strArr) {
        int answer = 0;
        int []count = new int[strArr.length];

        for(int i=0; i<strArr.length; i++) {
            count[strArr[i].length()-1]++;
            System.out.println(count[i]);
        }
        System.out.println(Arrays.toString(count));
        for(int num : count){
            if(answer<num) answer=num;
        }
        System.out.println(answer);
        return answer;
    }
}
