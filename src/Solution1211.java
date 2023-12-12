import java.util.Arrays;
import java.util.Scanner;

public class Solution1211 {
    public static void main(String[] args) {
        Solution1211 sol = new Solution1211();
        Scanner sc = new Scanner(System.in);

        //점의 위치 구하기
        int[] dot = new int[2];
        for (int i = 0; i < dot.length; i++) {
            dot[i] = sc.nextInt();
            System.out.println(dot[i]);
        }
        System.out.println(Arrays.toString(dot));
        sol.solution(dot);

        //2차원으로 만들기
        int[] num_list = new int[4];
        int n = 2;
        for (int i = 0; i < num_list.length; i++) {
            num_list[i] = sc.nextInt();
            System.out.println(num_list[i]);
        }
        System.out.println(Arrays.toString(num_list));
        sol.solution1(num_list, n);

        //공던지기
        int[] numbers =new int[4];
        int k=2;
        for(int i=0; i< numbers.length; i++){
            numbers[i]= sc.nextInt();
            System.out.println(numbers[i]);
        }
        sol.solution3(numbers,k);

        //배열 회전시키기
        int[] nums = new int[3];
        String direction ="right";

        for(int i=0; i<nums.length; i++){
            nums[i]=sc.nextInt();
            System.out.println(nums[i]);
        }
        sol.solution4(nums,direction);

    }

    //점의 위치 구하기
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0 && dot[1] > 0) {          //1사분면
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {    //2사분면
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {    //3사분면
            answer = 3;
        } else if (dot[0] > 0 && dot[1] < 0) {    //4사분면
            answer = 4;
        }
        System.out.println(answer);
        return answer;
    }

    //2차원으로 만들기
    public int[][] solution1(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int count = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < n; j++, count++) {
                answer[i][j] = num_list[count];
            }
        }
        System.out.println(Arrays.deepToString(answer));//모든 차원의 배열을 출력할때 사용 deepToString
        return answer;
    }

    //2차원으로 만들기 다른 방법
    public int[][] solution2(int[] num_list, int n) {
        int[][] answer = {};

        int length = num_list.length;

        answer = new int[length / n][n];

        for (int i = 0; i < length; i++) {
            answer[i / n][i % n] = num_list[i];
        }

        return answer;
    }

    //공던지기
    public int solution3(int[] numbers, int k) {
        int answer = numbers[2 * (k - 1) % numbers.length];
        System.out.println(answer);
        return answer;
    }

        //배열회전시키기
        public int[] solution4(int[] nums, String direction) {
            int[] answer = new int[nums.length];

            if(direction.equals("right")){
                for(int i = 0; i < answer.length - 1; i++){
                    answer[i + 1] = nums[i];
                }
                answer[0] = nums[nums.length -1];
            }else {
                for(int i = 0; i < answer.length - 1; i++){
                    answer[i] = nums[i + 1];
                }
                answer[answer.length - 1] = nums[0];
            }
            System.out.println(Arrays.toString(answer));
            return answer;
        }


}
