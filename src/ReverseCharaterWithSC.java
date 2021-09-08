import java.util.ArrayList;
import java.util.Scanner;

public class ReverseCharaterWithSC {
    public String solution(String str){
        char[] x=str.toCharArray();
        int lt=0, rt=str.length()-1;
        while (lt<rt){
            if (!Character.isAlphabetic(x[lt])) lt++;
            else if (!Character.isAlphabetic(x[rt])) rt--;
            else{
                char tmp=x[lt];
                x[lt]=x[rt];
                x[rt]=tmp;
                lt++;
                rt--;
            }

        }

        return String.valueOf(x);
    }

    public static void main(String[] args) {
        ReverseCharaterWithSC T = new ReverseCharaterWithSC();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(T.solution(str));
    }
}
