import java.util.Scanner;
public class humework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你要求的矩阵的阶数:");
        int num = input.nextInt();
        double arr[][] = new double[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        double sum = sumMajorDiagonal(arr, num);
        System.out.println("数组的对角线和="+sum);
    }
    public  static double sumMajorDiagonal(double [][]arr,int num){
       double sum=0;
       for(int i=0;i<num;i++){
           sum+=arr[i][i];
       }
       return sum;
    }
}

