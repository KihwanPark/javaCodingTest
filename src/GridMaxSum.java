import java.util.Scanner;

public class GridMaxSum {
    public int  solution(int n, int[][] arr){
        int max=0,line=0,row=0,leftX=0,rightX=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++) {
                row+=arr[i][j];
                line+=arr[j][i];
                if (i==j)leftX+=arr[i][j];
                if (i+j==6)rightX+=arr[i][j];
            }
            if (row>max)max=row;
            if (line>max)max=line;
            row=0;
            line=0;
        }
        if (leftX>max)max=leftX;
        if (rightX>max)max=rightX;
        return max;
    }

    public static void main(String[] args) {
        GridMaxSum T = new GridMaxSum();
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
