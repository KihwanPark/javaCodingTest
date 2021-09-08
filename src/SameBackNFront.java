import java.util.Scanner;

public class SameBackNFront {
    public String solution(String str){
//        String anwer="YES";
//        int lt=0, rt=str.length()-1;
//        while (lt<rt){
//            if (Character.toUpperCase(str.charAt(lt))!=Character.toUpperCase(str.charAt(rt))) {
//                anwer="NO";
//                break;
//            }
//            lt++;
//            rt--;
//        }
        String anwer="NO";
        String tmp=new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) anwer="yes";
        return anwer;
    }


    public static void main(String[] args) {
        SameBackNFront T = new SameBackNFront();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(T.solution(str));
    }
}
