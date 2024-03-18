import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0318 {
    public static void main(String[] args) {
    Solution0318 sol = new Solution0318();

        String[] picture ={"x.x", ".x.", "x.x"};
        int k=3;
        String[] result = sol.solution1(picture,k);
        System.out.println(Arrays.toString(result));
    }
    //기초day24
    //그림확대
    public String[] solution(String[] picture, int k) {
       List<String> list = new ArrayList<>();

       for(int i =0; i< picture.length; i++){
           String[] piece = picture[i].split("");
           String str = "";

           for(int j=0; j< piece.length; j++){
               str +=piece[j].repeat(k);
           }
           for(int j=0; j<k; j++){
               list.add(str);
           }
       }
       String []answer = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    //그림 확대 다른 방법
    public String[] solution1(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for(int i = 0; i<answer.length; i++){
            answer[i] = "";
        }

        for(int i = 0; i<answer.length; i++){
            for(int t = 0; t<picture[0].length(); t++){
                for(int j = 1 ; j <= k; j++){
                    answer[i] += String.valueOf(picture[i/k].charAt(t));
                }
            }
        }

        return answer;
    }
}
