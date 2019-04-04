package www.bit.com;
import java.util.Scanner;
public class homework {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=input.nextInt();
        int count=EverySum(sum);
        System.out.println(count);
    }
    public static int EverySum(int sum) {
        if(sum<9) {
            return sum;
        }
        else {
            int n=0;
            n=sum%10;
            return n+EverySum(sum/10);
        }
    }
}
