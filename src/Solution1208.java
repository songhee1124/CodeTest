import java.util.Scanner;

public class Solution1208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();// String 읽어오기
        int num = sc.nextInt();

        solution(str, num);


        String my_string = sc.nextLine();
        String letter = sc.nextLine();

        solution1(my_string, letter);


        int angle = sc.nextInt();
        solution2(angle);


    }

    public static String solution(String str, int num) {

        String[] arr = str.split("");
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            answer += arr[i].repeat(num);
        }
        System.out.print(answer);
        return answer;

    }

    //특정 문자 제거하기
    public static String solution1(String my_string, String letter) {
        String answer = "";

        answer = my_string.replace(letter, "");
        System.out.println(answer);
        return answer;
    }

    //각도기
    public static int solution2(int angle) {
        int answer = 0;
        if (0 < angle && angle < 90) {
            answer = 1;
        } else if (90 == angle) {
            answer = 2;
        } else if (90 < angle && angle < 180) {
            answer = 3;
        } else answer = 4;

        System.out.println(answer);
        return answer;
    }

    //양꼬치
    public static int solution(int n, int k) {
        int answer = 0;

        answer = (n * 12000) + (k * 2000) - ((n / 10) * 2000);
        return answer;
    }

    //짝수의 합
    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n + 1; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }

}


