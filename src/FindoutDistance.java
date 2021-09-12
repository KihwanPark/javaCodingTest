import java.util.Scanner;

public class FindoutDistance {
    public int[] solution(String s, char t){
        int[] answer=new int[s.length()];
        int d=100;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)==t){
                d=0;
                answer[i]=d;
            }else{
                d++;
                answer[i]=d;
            }
        }
        d=100;
        for (int i=s.length()-1; i>=0; i--){
            if (s.charAt(i)==t)d=0;
            else {
                d++;
                answer[i]=Math.min(answer[i],d);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindoutDistance T = new FindoutDistance();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        char t=kb.next().charAt(0);
        for (int x :T.solution(str,t)) {
            System.out.print(x+" ");
        }
    }
}
