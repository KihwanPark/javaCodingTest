import java.util.Scanner;

public class StudentWhoSees {
    public int solution(int n, int[] arr){
        int answer=1;
        int tall=arr[0];
        for (int i=1;i<n;i++){
            if (arr[i]>tall){
                answer++;
                tall=arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StudentWhoSees T = new StudentWhoSees();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}
