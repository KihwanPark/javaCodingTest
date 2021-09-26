import java.util.ArrayList;
import java.util.Scanner;

public class RSP {
    public ArrayList<String> solution(int n, int[] a, int[] b){
        ArrayList<String> answer=new ArrayList<String>();
        for (int i=0;i<n;i++){
            if (a[i]-b[i]==0)answer.add("D");
            else if (a[i]-b[i]==-2 || a[i]-b[i]==1)answer.add("A");
            else answer.add("B");
        }
        return answer;
    }

    public static void main(String[] args) {
        RSP T = new RSP();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for (int i=0;i<n;i++){
            a[i]=kb.nextInt();
        }
        for (int i=0;i<n;i++){
            b[i]=kb.nextInt();
        }
        for (String x:T.solution(n,a,b)) System.out.println(x);
    }
}
