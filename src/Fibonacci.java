import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    /*public ArrayList<Integer> solution(int n){
        ArrayList<Integer> answer=new ArrayList<Integer>();
        answer.add(1);
        answer.add(1);
        for (int i=2;i<n;i++){
            answer.add(answer.get(i-2)+answer.get(i-1));
        }
        return answer;
    }*/
    public String solution(int n){
        String answer="";
        int a=1,b=1,c;
        answer+=a+" "; answer+=b+" ";
        for (int i=2;i<n;i++){
            c=a+b;
            answer+=c+" ";
            a=b;
            b=c;

        }
        return answer;
    }


    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        //for (int x : T.solution(n)) System.out.print(x + " ");
        System.out.print(T.solution(n));
    }
}
