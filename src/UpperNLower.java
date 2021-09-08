import java.util.Scanner;

public class UpperNLower {
    public String solution(String str){
//        char[] x=str.toCharArray();
//        int num=0;
//        for (char s:str.toCharArray()){
//            if (Character.isUpperCase(s))x[num]=Character.toLowerCase(s);
//            else x[num]=Character.toUpperCase(s);
//            num++;
//        }
//        return String.valueOf(x);
        String answer="";
        for (char s:str.toCharArray()){
            if (Character.isUpperCase(s))answer+=Character.toLowerCase(s);
            else answer+=Character.toUpperCase(s);
        }
        return answer;
    }

    public static void main(String[] args) {
        UpperNLower T = new UpperNLower();
        Scanner kb = new Scanner(System.in);
        String  str=kb.nextLine();
        System.out.println(T.solution(str));
    }
}
