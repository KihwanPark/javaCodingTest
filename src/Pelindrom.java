import java.util.Scanner;

public class Pelindrom {
    public String solution(String str){
        String answer="NO";
        str=str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp=new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        Pelindrom T = new Pelindrom();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(T.solution(str));
    }
}
