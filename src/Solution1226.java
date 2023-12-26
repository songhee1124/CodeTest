import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1226 {
    public static void main(String[] args) {

        Solution1226 sol = new Solution1226();

        String polynomial = "3x + 7 + x";
        sol.solution7(polynomial);

//        int q = 3;
//        int r=1;
//        String code = "qjnwezgrpirldywt";
//        sol.solution8(q, r,code);

    }

    //입문 day 19
    //7의 개수
    public int solution(int[] array) {
        int answer = 0;
        for (int num : array) {
            String numStr = String.valueOf(num);
            for (int i = 0; i < numStr.length(); i++) {
                if (numStr.charAt(i) == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }

    // 잘라서 배열로 저장하기
    public String[] solution1(String my_str, int n) {

        int size = my_str.length() / n;
        if (my_str.length() % n != 0) {
            size++;
        }
        String[] answer = new String[size];
        int index = 0;
        for (int i = 0; i < my_str.length(); ) {
            int next = Math.min(i + n, my_str.length());
            answer[index] = my_str.substring(i, next);
            i += n;
            index++;
        }
        return answer;
    }

    //중복된 숫자 개수
    public int solution2(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n)
                answer++;
        }
        return answer;
    }

    // 머쓱이보다 키 큰 사람
    public int solution3(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        for (int num : array) {
            if (num > height) {
                answer++;
            }
        }
        return answer;
    }


    //입문 day 20
    //직사각형 넓이 구하기
    public int solution4(int[][] dots) {
        int answer = 0;
        int minX = dots[0][0];
        int minY = dots[0][1];
        int maxX = dots[0][0];
        int maxY = dots[0][1];

        for (int i = 1; i < dots.length; i++) {
            minX = Math.min(minX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
            maxX = Math.max(maxX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
        }
        answer = (maxX - minX) * (maxY - minY);


        return answer;
    }

    //캐릭터의 좌표
    public int[] solution5(String[] keyinput, int[] board) {
        int[] now = {0, 0};                             //현재 위치좌표
        int maxWidth = board[0] / 2;                        //x축 최대 좌표
        int maxLength = board[1] / 2;                       //y축 최대 좌표
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {            //left를 눌렀을때
                now[0] -= (now[0] > -(maxWidth) ? 1 : 0);      //x축 (-)최대좌표보다 크면 1, 아니면 0을 뺌
            } else if (keyinput[i].equals("right")) {    //이하 동일
                now[0] += (now[0] < (maxWidth) ? 1 : 0);
            } else if (keyinput[i].equals("down")) {
                now[1] -= (now[1] > -(maxLength) ? 1 : 0);
            } else if (keyinput[i].equals("up")) {
                now[1] += (now[1] < (maxLength) ? 1 : 0);
            }
        }
        return now;
    }

    //최댓값 만들기(2)
    public int solution6(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
        return answer;
    }

    //다항식 더하기
    public String solution7(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" +");
        int strNum = 0;
        int num = 0;

        for (String s : arr) {
            if (s.equals("x")) {
                strNum += 1;
            } else if (s.contains("x")) {
                strNum += Integer.parseInt(s.substring(0, s.length() - 1));
            } else if (!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }

        if (strNum != 0 && num == 0) {
            if (strNum == 1) {
                answer = "x";
            } else {
                answer = strNum + "x";
            }
        }

        if (strNum != 0 && num != 0) {
            if (strNum == 1) {
                answer = "x" + " + " + num;
            } else {
                answer = strNum + "x" + " + " + num;
            }
        }

        if (strNum == 0 && num != 0) {
            answer = String.valueOf(num);
        }
        return answer;
    }


}
