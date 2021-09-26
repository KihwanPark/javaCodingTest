import java.util.Scanner;

public class ZipWord {
    public String solution(String str){
        String answer="";
        str += " ";
        int n = 1;
        char c =0;
        for (int i=0;i<str.length()-1;i++){
            if (str.charAt(i) != str.charAt(i+1)){
                answer+=str.charAt(i);
                if (1<n) {
                    answer+=n;
                    n=1;
                }
            }else n++;
        }
        return answer;
    }

/*public class ZipWord {
    public String solution(String str){
        String answer="";
        char s =0;
        int n=1;
        for (char c:str.toCharArray()){
            if (c != s){
                if (n>1) {
                    answer+=n;
                    n=1;
                }
                answer+=c;
                s=c;
            }
            else n++;
        }
        return answer;
    }*/

    public static void main(String[] args) {
        ZipWord T = new ZipWord();
        Scanner kb = new Scanner(System.in);
        String  str=kb.nextLine();
        System.out.println(T.solution(str));
    }
}
