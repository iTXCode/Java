package Helloworld.out.production;
import  java.util.Scanner;
public class sum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sum=input.nextInt();
		EverySum(sum);
	}
	public static void EverySum(int sum) {
		if(sum<9) {
			System.out.println(sum);
		}
		else {
			EverySum(sum/10);
			sum=sum%10;
			System.out.println(sum);
		}
	}
}
