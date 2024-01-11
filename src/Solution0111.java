import java.util.ArrayList;
import java.util.Arrays;

public class Solution0111 {
    public static void main(String[] args) {

        Solution0111 sol = new Solution0111();

//        String mystring = "oxooxoxxox";
//        sol.solution3(mystring);

//        String mystring = "dxccxbbbxaaaa";
          String mystring = "axxbxx";
          sol.solution4(mystring);

          String binomial ="43 + 12";
          sol.solution5(binomial);
    }

    //기초 day17
    //공백으로 구분하기 1
    public String[] solution(String my_string) {
        String[] answer = my_string.split("\\s");
        // System.out.println(Arrays.toString(answer));
        return answer;
    }

    //공백으로 구분하기2
    public String[] solution1(String my_string) {
        String[] str = my_string.trim().split("\\s");
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (!"".equals(str[i])) {
                count++;
            }
        }
        int index = 0;
        String[] answer = new String[count];
        for (int i = 0; i < str.length; i++) {
            if (!"".equals(str[i])) {
                answer[index++] = str[i];
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    //공백으로 구분하기2 다른 방법
    public String[] solution2(String myString) {
        String[] answer = myString.trim().split("\\s+");
        //  \\s+는 여러개의 연속된 공백을 하나의 공백으로 간주함. 즉 여러개의 공백을 여기서는 한번에 제거하는거임
        //  \\s 는 한개의 공백을 의미함.
        return answer;
    }


    //기초 day 18
    //x 사이의 개수
    public int[] solution3(String myString) {

        String[] str = myString.split("x", -1);
        //split의 두번째 매개변수는 반환되는 문자열 배열의 길이를 최대 분할 수로 설정함,
        //예를 들어 3을 넣으면 x를 기준으로 문자열을 최대3개로 나누어 배열에 담는다.
        // 여기에 -1을 하면 빈 문자열도 포함함
        //-1을 사용하면 최대 분할 수가 없다는 의미로 해석됨
        System.out.println(Arrays.toString(str));


        int[] answer = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            answer[i] = str[i].length();
        }
        System.out.println(Arrays.toString(answer));


        return answer;
    }

    //문자열 잘라서 정렬하기
    public String[] solution4(String myString) {
        String str = myString.replaceAll(" ", "");
        System.out.println(str);
        String[] answer = str.split("x");
        Arrays.sort(answer);
        ArrayList<String> resultList = new ArrayList<>();

        for (int i = 0; i < answer.length; i++) {
            if (!answer[i].isEmpty()) {
                resultList.add(answer[i]);
            }
        }
        String[] resultArr = resultList.toArray(new String[resultList.size()]);
        System.out.println(Arrays.toString(resultArr));
        return resultArr;
    }

    //간단한 식 계산하기
    public int solution5(String binomial) {
        String[] str = binomial.split("\\s");
        System.out.println(Arrays.toString(str));
        int answer = 0;
        int a= Integer.parseInt(str[0]);
        System.out.println(a);
        int b= Integer.parseInt(str[2]);
        System.out.println(b);
        String op= str[1];
        System.out.println(op);

//        if("+".equals(op)){
//            answer=a+b;
//        } else if ("-".equals(op)) {
//            answer=a-b;
//        }
//        else answer=a*b;
        answer = "+".equals(op) ? a + b : "-".equals(op) ? a - b : a * b;
        System.out.println(answer);
        return answer;
    }




}
