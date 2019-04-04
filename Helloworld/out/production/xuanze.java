package Helloworld.out.production;
import java.util.Scanner;
public class xuanze{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Plese enter a DATA:");
		int _year=input.nextInt();
		int _month=input.nextInt();
		int _day=input.nextInt();
		int arr[]= {0,31,59,90,120,151,181,212,243,273,304,334,365};
		if((_month>2)&&((_year%4==0 &&_year%100!=0)||(_year%400==0) )) {
			arr[_month-1]+=1;
		}
		int day=arr[_month-1]+_day;
		System.out.println("今天是今年的第"+day+"天");
	}
}
