public class Solution0108 {
    public static void main(String[] args) {
    Solution0108 sol = new Solution0108();

//   int[] num_list={12, 4, 15, 1, 14};
//   sol.solution(num_list);

   int []num_list ={3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
//   int []num_list ={2,3,4,5};
   sol.solution1(num_list);

   String myString ="aaAA";
   String pat ="aaaaa";
   sol.solution2(myString,pat);

    }
    //기초 day 15
    //1로 만들기
    public int solution(int[] num_list) {
        int answer = 0;

        for(int i=0; i< num_list.length; i++){
            while (num_list[i] !=1){
                if (num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                } else {
                    num_list[i] -= 1;
                    num_list[i] /= 2;
                }
                answer++;
                System.out.println(answer);
            }
        }
        return answer;
    }

    //길이에 따른 연산
    public int solution1(int[] num_list) {
        int answer = 0;
        int sum=0;
        int mul=1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length <= 10) { // 길이가 10 이하인 경우
                mul *= num_list[i];
                answer=mul;
            } else { // 길이가 10 초과인 경우
                sum += num_list[i];
                answer=sum;
            }
        }
        System.out.println(answer);
        return answer;
    }

    //원하는 문자열 찾기
    public int solution2(String myString, String pat) {
        int answer = 0;
        if(myString.toLowerCase().contains(pat.toLowerCase())){
            answer=1;
        }
        else
            answer=0;
        System.out.println(answer);
        return answer;
    }

    //기초day16
    //대문자로 바꾸기
    public String solution3(String myString) {
        String answer = "";
    answer= myString.toUpperCase();
        return answer;
    }

    //배열에서 문자열 대소문자 변환하기
    public String[] solution4(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i=0; i<strArr.length; i++){
            if(i%2==0){
               answer[i]= strArr[i].toLowerCase();
            }
            else
                answer[i]=strArr[i].toUpperCase();
        }
        return answer;
    }
}
