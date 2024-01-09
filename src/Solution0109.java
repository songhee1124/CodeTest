import java.util.ArrayList;
import java.util.List;

public class Solution0109 {
    public static void main(String[] args) {

        Solution0109 sol = new Solution0109();

        String my_string = "programmers";
        String alp ="p";
        sol.solution(my_string,alp);

//        String myString = "AbCdEFG";
//        String pat = "dE";
//        sol.solution1(myString,pat);

        String myString ="banana";
        String pat = "ana";
        List<IndexRange> occurrences = findAllOccurrences(myString, pat);

        for (IndexRange range : occurrences) {
            System.out.println("Start Index: " + range.getStartIndex() + ", End Index: " + range.getEndIndex());
        }

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
    public static List<IndexRange> findAllOccurrences(String myString, String pat) {
        List<IndexRange> occurrences = new ArrayList<>();
        int index = myString.indexOf(pat);

        while (index != -1) {
            occurrences.add(new IndexRange(index, index + pat.length() - 1));
            index = myString.indexOf(pat, index + 1);
        }

        return occurrences;
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



}
