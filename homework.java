import java.util.Scanner;
public class homework{
    public static void main(String[]argv){
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入n值:");
        int n=scanner.nextInt();

        System.out.print("請輸入m值:");
        int m=scanner.nextInt();

        int[][]a=new int[n][m];

        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=m-1;j++){
                a[i][j]=(i+1)*(j+1);
            }
        }
        for(int[]i:a){
            for(int j:i){
                System.out.print(j+"\t");
            }
            System.out.println("");
        }
        scanner.close();
      
    }
}