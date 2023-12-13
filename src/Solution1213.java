import java.util.Scanner;
import java.util.Arrays;

public class Solution1213 {

    public static void main(String[] args) {
        Solution1213 sol = new Solution1213();
        Scanner sc = new Scanner(System.in);

//        //덧셈식 출력하기
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(a+ " + " +b+ " = " +(a+b));
//
//        //문자열 붙여서 출력하기
//        String a = sc.next();
//        String b = sc.next();
//
//        System.out.println(a+b);
//
//        //문자열 돌리기
//        String a = sc.next();
//        String[] list = a.split("");
//
//        for(int i = 0; i < list.length; i++){
//            System.out.println(list[i]);
//        }
//
//        //홀짝 구분하기
//        int n = sc.nextInt();
//
//        if(n % 2 == 0) {
//            System.out.println(n + " is even");
//        }
//        else {
//            System.out.println(n + " is odd");
//
//        }
//
//        //문자열 겹쳐쓰기
//        String my_string=sc.nextLine();
//        String overwrite_string =sc.nextLine();
//        int s=2;
//        sol.solution(my_string,overwrite_string,s);

        //입문 day11 주사위의 개수
//        int[]box = new int[3];
//        for(int i=0; i<box.length; i++){
//            box[i]=sc.nextInt();
//            System.out.println(box[i]);
//        }
//        int n=3;
//        sol.solution1(box,n);

        //합성수 찾기
//        int n= sc.nextInt();
//        sol.solution2(n);

        //최댓값 만들기(1) (다른 방법 2가지도 있음)
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            System.out.println(numbers[i]);
        }
        sol.solution3(numbers);

        //팩토리얼
//        int n = sc.nextInt();
//        sol.solution6(n);

        ////어떠한 정수를 입력했을때 최대 몇 팩토리얼이 나오는가?
        int n =sc.nextInt();
        sol.solution7(n);
    }

    //문자열 겹쳐쓰기
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0, s) + overwrite_string; //0부터 s까지 나옴
        System.out.println(answer);
        System.out.println(answer.length());

        if (my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length()); //9부터 나옴
        }
        System.out.println(answer);
        return answer;
    }

    //입문 day11 주사위의 개수
    public int solution1(int[] box, int n) {
        int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        System.out.println(answer);
        return answer;
    }

    //합성수 찾기
    public int solution2(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int a = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    a++;
                }
            }
            if (a >= 3) {
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }

    //최댓값 만들기(1)  //버블정렬로 제일 낮은 수 부터 큰 수까지 했는데 뭐지?
    public int solution3(int[] numbers) {
        int answer = 0;
        int max = numbers[0];
        int secondmax = numbers[0];


        for (int j = 0; j < numbers.length - 1; j++) {
            for (int i = 0; i < numbers.length - 1 - j; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            if (max < numbers[i + 1]) {
                max = numbers[i + 1];
                secondmax = numbers[i];

                answer = max * secondmax;
            }
        }
        System.out.printf("max : %d\n", max);
        System.out.printf("secondmax : %d\n", secondmax);
        System.out.println(answer);
        return answer;
    }

    //최댓값 만들기(1) 다른방법 #1
    public int solution4(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer=numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }

    //최댓값 만들기(1) 다른방법#2
    public int solution5(int[] numbers) {
        int answer = 0;
        int max = 0;

        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > max) {
                    max = numbers[i] * numbers[j];
                }
            }
        }
        answer = max;
        return answer;
    }

    //팩토리얼
    public int solution6(int n) {
        int answer = 1;
        while (n>0){
            answer *= n;
            n--;
        }
        System.out.println(answer);
        return answer;
    }

    //어떠한 정수를 입력했을때 최대 몇 팩토리얼이 나오는가?
    public int solution7(int n) {
        int answer = 0;
        int factorial = 1;

        //n의 범위값이 정해져 있으므로 최대 팩토리얼은 10
        for(int i=1; i<=10; i++){
            factorial *= i;

            if(factorial == n){
                answer = i;
                break;
            }else if(n < factorial){
                answer = (i-1);
                break;
            }
        }
        return answer;
    }

    //어떠한 정수를 입력했을때 최대 몇 팩토리얼이 나오는가? 다른 방법
    public int solution8(int n) {
        int answer = 1;
        int factorial = 1;

        while(n >= factorial) {
            answer ++;
            factorial *= answer;
        }
        System.out.println(answer);
        return answer -1 ;
    }

}
