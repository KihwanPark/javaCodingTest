import java.util.ArrayList;
import java.util.Scanner;

public class ReverPrimNum {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer=new ArrayList<Integer>();
        for (int x:arr){
            String tmp=new StringBuilder(String.valueOf(x)).reverse().toString();
            int tmpNum=Integer.parseInt(tmp);
            if (isPrime(tmpNum) && tmpNum!=1)answer.add(tmpNum);
        }
        return answer;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ReverPrimNum T = new ReverPrimNum();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=kb.nextInt();
        }
        for (int x:T.solution(n,arr))System.out.print(x +" ");
    }
}
