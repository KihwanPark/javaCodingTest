import java.util.ArrayList;
import java.util.Scanner;

public class PassWord {
    public String solution(int n, String str){
        String answer="";
        for (int i=0;i<n;i++){
            String tmp=str.substring(0,7).replace('#','1').replace('*','0');
            str=str.substring(7);
            answer+=(char)Integer.parseInt(tmp,2);
        }
        return answer;
    }
    /*public String solution(int n, String str){
        String answer="";
        ArrayList<String> tmplist = new ArrayList<String>();
        String tmpStr = "";
        StringBuilder bufStr = new StringBuilder(str);
        int mojiNum = str.length()/n;
        while (bufStr.length()>0) {
            for (int i = 0; i < mojiNum; i++) {
                tmpStr = tmpStr + bufStr.charAt(i);
            }

            bufStr = bufStr.delete(0,mojiNum);
            tmplist.add(tmpStr);
            tmpStr="";
        }
        String binaNum="";
        int tenNum;
        for (String s:tmplist){
            for (char c:s.toCharArray()){
                if (c=='#')binaNum+="1";
                else binaNum+="0";
            }
            tenNum=Integer.parseInt(binaNum,2);
            answer+=(char)tenNum;
            binaNum="";
        }
        return answer;
    }*/
    public static void main(String[] args) {
        PassWord T = new PassWord();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String str=kb.next();
        System.out.println(T.solution(n,str));
    }
}
