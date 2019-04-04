package Helloworld.out.production;
7import java.util.Scanner;

public class haha {
	
		
	public static void main( String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个整数");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int Sum;
		do{ 
			menu();
			System.out.print("请输入你的选择:");
			Sum=input.nextInt();
			switch(Sum){
			case 1:
				System.out.println("执行两个数的加法运算");
				Add(num1,num2);
				break;
			case 2:
				System.out.println("执行两个数的减法运算");
				jian(num1,num2);
				 break;
			case 3:
				System.out.println("执行两个数的乘法运算");
				cheng(num1,num2);
				break;
			case 4:
				System.out.println("执行两个数的除法运算");
				chu(num1,num2);
				break;
			case 0:
				System.out.println("退出程序！");
				break;
				default:
					System.out.println("输入错误！");
				break;
			}
		}while(Sum!=0);
	}
	public static void menu(){
		System.out.println("*****************************");
		System.out.println("***1.加法运算   2.减法运算***");
		System.out.println("***3.乘法运算   4.除法运算***");
		System.out.println("******** 0.退出程序 *********");
		System.out.println("*****************************");
	}
	public static void Add(int num1,int num2){
		System.out.println(num1+num2);
	}
	public static void jian(int num1,int num2){
		System.out.println(num1-num2);
	}
	public static void cheng(int num1,int num2){
		System.out.println(num1*num2);
	}
	public static void chu(int num1,int num2){
		System.out.println(num1/num2);
	}
	}



