import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Solution1219 sol = new Solution1219();

    //기초 day5
        //코드 처리하기
        String code = "abc1abc1abc";
        sol.solution(code);

        //등차수열의 특정한 항만 더하기
//        int a= 3;
//        int b=4;
//        boolean[] included ={true, false, false, true, true};
//        sol.solution1(a,b,included);

        //주사위 게임2
//        int a =sc.nextInt();
//        int b =sc.nextInt();
//        int c= sc.nextInt();
//
//        sol.solution2(a,b,c);

        //원소들의 곱과 합
//        int[] num_list = {3,4,5,2,1};
//        sol.solution3(num_list);

        //이어 붙인 수
//        int[] num_list ={3,4,5,2,1};
//        sol.solution4(num_list);


        //기초 day6
        //마지막 두 원소
        int[] num_list ={2,1,6};
        sol.solution5(num_list);

        //수 조작하기1
        int n=0;
        String control ="wsdawsdassw";
        sol.solutio6(n,control);

    }
    //기초 day5
    //코드 처리하기
    public String solution(String code) {
        String answer = "";
        int mode=0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') mode = 1 - mode;
            else if (i % 2 == mode) answer += code.charAt(i);
        }
        System.out.println(answer);
        return "".equals(answer) ? "EMPTY" : answer;
    }

    //등차수열의 특정한 항만 더하기
    public int solution1(int a, int d, boolean[] included) {
        int answer = 0;

        for(int i=0; i<included.length; i++){
            if(included[i]){
                answer += a+(d*i);
            }
        }
        System.out.println(answer);
        return answer;
    }

    //주사위 게임
    public int solution2(int a, int b, int c) {
        int answer = 0;

        if(a==b&&b==c){
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }else if(a==b&&b!=c||a==c&&c!=b||a!=b&&b==c){
            answer = (a+b+c)*(a*a+b*b+c*c);
        }else{
            answer = a+b+c;
        }
        System.out.println(answer);
        return answer;
    }

    //원소들의 곱과 합
    public int solution3(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        for(int i = 0; i<num_list.length;i++){
            sum+=num_list[i];
            mul*=num_list[i];
        }
        if(sum * sum > mul){
            answer = 1;
        }
        else
            answer=0;
        System.out.println(answer);
        return answer;
    }

    //이어붙인 수
    public int solution4(int[] num_list) {
        int answer = 0;
        String odd="";
        String even="";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                 even +=Integer.toString(num_list[i]);
            }
            else {
                odd += Integer.toString(num_list[i]);
            }

        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        System.out.println(answer);
        return answer;
    }

    //기초 day6
    //마지막 두 원소
    public List solution5(int[] num_list) {
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < num_list.length; i++){
            answer.add(num_list[i]);
        }

        if(num_list[num_list.length - 1] > num_list[num_list.length - 2]){
            answer.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        } else {
            answer.add(num_list[num_list.length - 1] * 2);
        }
        System.out.println(answer);
        return answer;
    }

    //수 조작하기1
    public int solutio6(int n, String control) {
        int answer = 0;
        String [] str = control.split("");
        for(int i=0; i< str.length; i++) {
            if (str[i].equals("w")) {
                n+=1;
            } else if (str[i].equals("s")) {
                n-=1;
            } else if (str[i].equals("d")) {
                n += 10;
            } else
                n -= 10;
            answer = n;
        }
        System.out.println(answer);
        return answer;
    }
}
