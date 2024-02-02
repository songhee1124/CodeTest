import java.util.Arrays;

public class Solution0131 {
    public static void main(String[] args) {

    }
    //기초day21
    //전국 대회 선발 조사
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int sort[] = new int[rank.length];
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                sort[i] = rank[i];
            } else {
                rank[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(rank);

        for (int i = 0; i < sort.length; i++) {
            if (rank[0] == sort[i]) {
                answer += i * 10000;
            } else if (rank[1] == sort[i]) {
                answer += i*100;
            } else if (rank[2] == sort[i]) {
                answer += i;
            }
        }

        return answer;
    }


    //정수 부분
    public int solution1(double flo) {
        int answer = (int)flo;
        return answer;
    }

    //문자열 정수의 합
    public int solution2(String num_str) {
        int answer = 0;
        for(int i=0; i<num_str.length(); i++){
            answer += Integer.parseInt(num_str.substring(i, i+1));
        }
        return answer;
    }

    //문자열을 정수로 변환하기
    public int solution(String n_str) {
        int answer = 0;
        answer = Integer.parseInt(n_str);
        return answer;
    }
}
