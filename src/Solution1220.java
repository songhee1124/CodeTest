public class Solution1220 {
    public static void main(String[] args) {
        Solution1220 sol = new Solution1220();


        //배열의 유사도
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        sol.solution3(s1, s2);

        //수열의 구간 쿼리3
        int[]arr ={0, 1, 2, 3, 4};
        int [][] queries ={{0, 3},{1, 2},{1, 4}};
        sol.solution5(arr,queries);
    }

    //입문 day16
    //편지
    public int solution(String message) {
        int answer = 0;
        int count = 0;
        String[] str = message.split("");
        for (int i = 0; i < str.length; i++) {
            count++;
        }
        answer = count * 2;
        System.out.println(answer);
        return answer;
    }

    //가장 큰 수 찾기
    public int[] solution1(int[] array) {
        int[] answer = new int[2];
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
            answer[0] = max;
            answer[1] = index;
        }
        return answer;
    }

    //문자열 계산하기
    public int solution2(String my_string) {
        int answer = 0;
        String[] str = my_string.split(" ");
        answer += Integer.valueOf(str[0]);
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i].equals("+")) {
                answer += Integer.valueOf(str[i + 1]);
            } else if (str[i].equals("-")) {
                answer -= Integer.valueOf(str[i + 1]);
            }
        }
        System.out.println(answer);
        return answer;
    }

    //배열의 유사도
    public int solution3(String[] s1, String[] s2) {
        int answer = 0;
        int count = 0;
        for (int j = 0; j < s1.length; j++) {
            for (int i = 0; i < s2.length; i++) {
                if (s1[j].equals(s2[i])) {
                    count++;
                }
            }
        }
        answer = count;
        System.out.println(answer);
        return answer;
    }

    //기초 day 6
    //수 조작하기 2
//    StringBuilder sb = new StringBuilder();
    public String solution4(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];
            if (diff == 1) {
                answer += "w";
            } else if (diff == -1) {
                answer += "s";
            } else if (diff == 10) {
                answer += "d";
            } else if (diff == -10) {
                answer += "a";
            }
        }
        System.out.println(answer);
        return answer;
    }

    //수열과 구간 쿼리3
    public int[] solution5(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int tmp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }
        System.out.println(arr);
        return arr;
    }

    //수열과 구간 쿼리2
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i=0; i< queries.length;i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int min =Integer.MAX_VALUE;
            for(int j=s; j<=e; j++){
                if(arr[j]>k&& arr[j]<min){
                    min=arr[j];
                }
            }
            answer[i] = min == Integer.MAX_VALUE? -1 : min;
        }
        return answer;
    }
}