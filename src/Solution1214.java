
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution1214 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Solution1214 sol = new Solution1214();

        //기초 day3
        //문자열 섞기
//        String str1 = sc.nextLine();
//        String str2 =sc.nextLine();
//        sol.solution(str1,str2);

        //문자 리스트를 문자열로 변환하기
//        String []arr=new String[3];
//        for(int i=0; i< arr.length; i++){
//            arr[i]= sc.next();
//            System.out.println(arr[i]);
//        }
//        sol.solution1(arr);

        //문자열 곱하기
//        String my_string=sc.nextLine();
//        int k= sc.nextInt();
//        sol.solution2(my_string,k);

        //더 크게 합치기
//        int a= sc.nextInt();
//        int b=sc.nextInt();
//        sol.solution4(a,b);

        //두수의 연산값 비교하기
//        int a= sc.nextInt();
//        int b=sc.nextInt();
//        sol.solution5(a,b);

        //입문 day12
        //모음 제거
//        String my_string =sc.nextLine();
//        sol.solution6(my_string);

        //문자열 정렬하기
//        String my_string =sc.nextLine();
//        sol.solution7(my_string);

        //숨어있는 숫자의 덧셈(1)
        String my_string =sc.nextLine();
        sol.solution8(my_string);
    }

    //문자열 섞기
    public String solution(String str1, String str2) {
        String answer = "";
        String[] list1 = str1.split("");
        String[]list2 =str2.split("");

        for(int i = 0; i < list1.length && i<list2.length; i++){
            answer += list1[i]+list2[i];
            System.out.println(list1[i]);
            System.out.println(list2[i]);
        }
        System.out.println(answer);
        return answer;
    }

    //문자 리스트를 문자열로 변환하기
    public String solution1(String[] arr) {
        String answer = "";
        for(int i=0; i< arr.length; i++){
            answer +=arr[i];
        }
        System.out.println(answer);
        return answer;
    }

    //문자열 곱하기
    public String solution2(String my_string, int k) {
        String answer = "";

        while (k>0) {
            answer += my_string;
            k--;
        }
        System.out.println(answer);
        return answer;
    }
    //문자열 곱하기 다른 방법
    public String solution3(String my_string, int k) {
        String answer = "";
        answer=my_string.repeat(k);
        return answer;
    }


    //더 크게 합치기
    public int solution4(int a, int b) {
        int answer = 0;

        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        String result = str1+str2;
        String result1 = str2+str1;

        System.out.println(result);
        System.out.println(result1);

        int numresult =Integer.valueOf(result);
        int numresult1 =Integer.valueOf(result1);

        if(numresult>=numresult1){
            answer=numresult;
        }

        else if (numresult<numresult1) {
            answer=numresult1;
        }
        System.out.println(answer);
        return answer;
    }


    //두 수의 연산값 비교하기
    public int solution5(int a, int b) {
        int answer = 0;
        int result = 2*a*b;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        String result1 = str1+str2;
        System.out.println(result);
        System.out.println(result1);

        int numresult =Integer.valueOf(result1);
        answer= numresult>=result ? numresult:result;
        System.out.println(answer);
        return answer;
    }

    //입문 day12
    //모음 제거
    public String solution6(String my_string) {
        String answer = my_string;
        String[]vowel={"a", "e", "i", "o", "u"};
        for(int i=0; i< vowel.length; i++) {
            if (my_string.contains(vowel[i])) {
                    answer=answer.replaceAll(vowel[i],"");
            }
        }
        System.out.println(answer);
        return answer;
    }

    //문자열 정렬하기
    public int[] solution7(String my_string) {

        String num = my_string.replaceAll("[^0-9]","");
        String[] list = num.split("");
        int[] answer = new int[list.length];
        for(int i=0; i< list.length; i++){
            answer[i]=Integer.valueOf(list[i]);
        }
        System.out.println(Arrays.toString(answer));
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));

        return answer;
    }

    //숨어있는 숫자의 덧셈(1)
    public int solution8(String my_string) {
        int answer = 0;
        String num = my_string.replaceAll("[^0-9]","");
        String[] list = num.split("");
        for(int i=0; i<list.length; i++){
            answer +=Integer.valueOf(list[i]);
        }
        System.out.println(answer);
        return answer;
    }

    //소인수분해
    public ArrayList solution9(int n) {

        ArrayList answer = new ArrayList<>();

        for(int i=2; i<=n; i++) {
            if(n % i == 0) {
                while(n % i == 0) {
                    n /= i;
                }
                answer.add(i);
            }
        }
        return answer;
    }


}


