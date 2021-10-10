import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GetScore {
//    public ArrayList<Integer> solution(int n, int[] arr) {
//        ArrayList<Integer> answer=new ArrayList<Integer>();
//        ArrayList<Integer> tmpArr=new ArrayList<Integer>();
//        for (int x : arr) {
//            tmpArr.add(x);
//        }
//        Collections.sort(tmpArr);
//        Collections.reverse(tmpArr);
//        for (int x:arr){
//            answer.add(tmpArr.indexOf(x)+1);
//        }
//        return answer;
//    }
public int[] solution(int n, int[] arr) {
    int[] answer=new int[n];
    for (int i=0;i<n;i++){
        int cnt=1;
        for (int j=0;j<n;j++){
            if (arr[j]>arr[i]) cnt++;
        }
        answer[i]=cnt;
    }
    return answer;
}
    public static void main(String[] args) {
        GetScore T = new GetScore();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=kb.nextInt();
        }
        for (int x:T.solution(n,arr))System.out.print(x +" ");
    }
}
