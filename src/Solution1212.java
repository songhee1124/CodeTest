import java.util.Scanner;

public class Solution1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //문자열 출려하기
        String a = sc.next();
        System.out.print(a);

        //a와 b 출력하기
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d", b);

        //문자열 반복해서 출력하기
        String str = sc.next();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)

        System.out.print(str);

        //대소문자 바꿔서 출력하기
        String str = sc.next();
        String alpabet = "";

        char[] charArray = str.toCharArray();

        for (int index = 0; index < charArray.length; index++) {
            if (Character.isUpperCase(charArray[index])) {
                alpabet += String.valueOf(charArray[index]).toLowerCase();
            } else
                alpabet += String.valueOf(charArray[index]).toUpperCase();
        }
        System.out.print(alpabet);

        //특수문자 출력하기
        System.out.println("!@#$%^&*(\\'\"<>?:;");
    }
}
