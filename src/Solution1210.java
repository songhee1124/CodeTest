import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution1210 {
    public static void main(String[] args) {
        Solution1210 sol = new Solution1210();
        Scanner sc = new Scanner(System.in);

        //배열 자르기
        int[] numbers = new int[5];
        int num1 = 1;
        int num2 = 3;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            System.out.println(numbers[i]);
        }
        System.out.println(Arrays.toString(numbers));
        int[] a = sol.solution(numbers, num1, num2);
        System.out.println(Arrays.toString(a));

        //외계행성의 나이
        String[] alpha = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        int age = sc.nextInt();
        sol.solution1(age, alpha);

        //진료 순서 정하기
        int[] emergency = new int[3];
        for (int i = 0; i < emergency.length; i++) {
            emergency[i] = sc.nextInt();
        }
        sol.solution2(emergency);

        //순서쌍의 개수
        int n = sc.nextInt();
        sol.solution4(n);

        //개미군단
        int hp = sc.nextInt();
        sol.solution5(hp);

        //모스부호
        String letter = sc.nextLine();
        sol.solution6(letter);

        //가위바위보
        String rsp = sc.nextLine();
        sol.solution7(rsp);

    }


    //배열 자르기
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};

        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    //외계행성의 나이
    public String solution1(int age, String[] alpha) {
        String answer = "";
//           String[]alpha = new String[]{"a","b","c","d","e","f","g","h","i","j"};
        while (age > 0) {
            answer = alpha[age % 10] + answer;
            age /= 10;

        }
        System.out.println(answer);
        return answer;
    }

    //진료 순서 정하기
    public int[] solution2(int[] emergency) {
        int[] asc = new int[emergency.length];
        int[] answer = new int[emergency.length];

        // for돌려서 값 하나하나 넣어준다.
        for (int i = 0; i <= emergency.length - 1; i++) {
            asc[i] = emergency[i];
        }

        Arrays.sort(asc);

        for (int i = 0; i <= emergency.length - 1; i++) {
            for (int j = 0; j <= emergency.length - 1; j++) {
                if (asc[i] == emergency[j]) {
                    answer[j] = emergency.length - i;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }


    //진료 순서 정하기 다른 방법
    public int[] solution3(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != 0) {
                continue;
            }
            int idx = 1;
            for (int j = 0; j < answer.length; j++) {
                if (emergency[i] < emergency[j]) {
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }

    //순서쌍의 개수
    public int solution4(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer++;
        }
        System.out.println(answer);
        return answer;
    }

    //개미군단
    public int solution5(int hp) {
        int answer = 0;
        int quotient = hp % 5;
        answer = (hp / 5) + (quotient / 3) + (quotient % 3);
        System.out.println(answer);
        return answer;
    }

    //모스부호
    public String solution6(String letter) {
        String answer = "";
        String[] morseList = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String[] morse;
        morse = letter.split(" ");
        int ascii = 97;
        for (String m : morse) {
            for (int i = 0; i < morseList.length; i++) {
                if (morseList[i].equals(m)) {
                    answer += (char) (i + ascii);
                }

            }
        }
        System.out.println(answer);
        return answer;
    }

    //가위바위보
    public String solution7(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.split("")[i].equals("0")) {
                answer += "5";
            } else if (rsp.split("")[i].equals("2")) {
                answer += "0";
            } else
                answer += "2";
        }
        System.out.println(answer);
        return answer;
    }

    //구슬을 나누는 경우의 수
    public int solution8(int balls, int share) {
        int answer = 0;
        return answer;
    }

}
