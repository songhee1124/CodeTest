public class Solution0315 {
    public static void main(String[] args) {

    }
    //기초day 24
    //커피 심부름
    public int solution(String[] order) {
        int answer = 0;
        int lattePrice =5000;
        int latteCnt=0;
        int americanoPrice =4500;
        int americanoCnt=0;
        for(int i=0; i< order.length; i++){
            if(order[i].contains("cafelatte")){
                lattePrice=5000;
                latteCnt++;
            }
            else {
              americanoCnt++;
            }
            answer=(lattePrice*latteCnt)+(americanoPrice*americanoCnt);
        }
        return answer;
    }

    //커피 심부름 다른 방법
    public int solution1(String[] order) {
        int answer = 0;
        for(int i=0; i< order.length; i++){
            if(order[i].contains("cafelatte")){
                answer += 5000;
            }
            else {
                answer += 4500;
            }
        }
        return answer;
    }
}
