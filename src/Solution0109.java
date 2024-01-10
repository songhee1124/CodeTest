import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0109 {
    public static void main(String[] args) {

        Solution0109 sol = new Solution0109();

//        String my_string = "programmers";
//        String alp ="p";
//        sol.solution(my_string,alp);

//        String myString = "AbCdEFG";
//        String pat = "dE";
//        sol.solution1(myString,pat);

        String myString ="banana";
        String pat = "ana";
//        List<IndexRange> occurrences = solution2(myString, pat);
        // 메소드를 int가 아닌 리스트로 타입을 바꾸면 됨 ( List<IndexRange>로 바꾸면 리턴값이 occurrences됨)
//        for (IndexRange range : occurrences) {
//            System.out.println("Start Index: " + range.getStartIndex() + ", End Index: " + range.getEndIndex());
//        }

        String[] strArr = {"and","notad","abcd"};
        sol.solution4(strArr);


        String my_string = "i love you";
        sol.solution5(my_string);
    }

    //기초day16
    //특정한 문자를 대문자로 바꾸기
    public String solution(String my_string, String alp) {
        String answer = "";

        if (my_string.contains(alp)) {
            answer = my_string.replaceAll(alp, alp.toUpperCase());
        } else
            answer = my_string;
//        System.out.println(answer);
        return answer;
    }

    //기초 day 17
    //특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
    public String solution1(String myString, String pat) {
        String answer = "";
        int lastIndexOf =myString.lastIndexOf(pat);

        if(lastIndexOf !=-1) {
            answer = myString.substring(0, lastIndexOf + pat.length());
        }
        else
            answer = myString;
//        System.out.println(lastIndexOf+pat.length());
//        System.out.println(answer);
        return answer;
    }

    //문자열이 몇 번 등장하는지 세기
    public static int solution2(String myString, String pat) {
        List<IndexRange> occurrences = new ArrayList<>();
        int index = myString.indexOf(pat);
        int answer=0;

        while (index != -1) {
            occurrences.add(new IndexRange(index, index + pat.length() - 1));
            index = myString.indexOf(pat, index + 1);
            answer++;
        }
        System.out.println(answer);
        return answer;
    }

    static class IndexRange {
        private final int startIndex;
        private final int endIndex;

        public IndexRange(int startIndex, int endIndex) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        public int getStartIndex() {
            return startIndex;
        }
        public int getEndIndex() {
            return endIndex;
        }
    }

    //문자열이 몇 번 등장하는지 세기 다른방법
    //문자열이 몇번 등장하는지만 알면되는거라 리스트에 담을 필요없음
    public int solution3(String myString, String pat) {
        int answer = 0;
        int num = 0;
        num = myString.indexOf(pat);
        while(true){

            if(num < 0){
                break;
            }else if(num >= 0){
                answer++;
                num = myString.indexOf(pat,num+1);
            }
        }
        return answer;
    }


    //ad제거하기
    public String[] solution4(String[] strArr) {
        List<String> result = new ArrayList<>();

        for (String str : strArr) {
            if (!str.contains("ad")) {
                result.add(str);
            }
        }
//        System.out.println(result);
        int idx = 0;
        String[] answer = new String[result.size()];
        for (String str : result)
            answer[idx++] = str;
        System.out.println(Arrays.toString(answer));
        return answer;
//        return result.toArray(new String[0]);
        //바로 위에 포문과 같이 배열로 리턴하는거임
    }

    //공백으로 구분하기1
    public String[] solution5(String my_string) {

//        String temp;
//        for(int i = 0; i < my_string.length(); i++) {
//            if(my_string[i] != ' ') {
//                temp += my_string[i];
//            }
//            else {
//                answer.push_back(temp);
//                temp="";
//            }
//        }
        String[] answer = my_string.split("\\s");
        System.out.println(Arrays.toString(answer));

        return answer;
    }



}




