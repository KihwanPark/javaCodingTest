import java.util.Scanner;

public class PullNumber {
    public int solution(String str){
//        int answer=0;
        String answer="";
        for (char x:str.toCharArray()){
//            if (Character.isDigit(x))answer=answer*10+x-48;
            if (Character.isDigit(x))answer+=x;
        }
//        return answer;
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        PullNumber T = new PullNumber();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(T.solution(str));
    }
}
