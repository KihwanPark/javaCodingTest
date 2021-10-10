import java.util.Scanner;

public class GridMountian {
    public int  solution(int n, int[][] arr){
        int answer=0;
        int[] x={-1,0,1,0}, y={0,-1,0,1};
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                boolean flag=true;
                for (int k=0;k<4;k++){
                    int xk=x[k];
                    int yk=y[k];
                    if (0<=i+xk && i+xk<n && 0<=j+yk && j+yk<n)
                        if (arr[i][j] <= arr[i+xk][j+yk]) flag=false;
                }
                if (flag)answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        GridMountian T = new GridMountian();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(T.solution(n,arr));
    }
}
