package Helloworld.out.production;
7import java.util.Scanner;

public class haha {
	
		
	public static void main( String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��������������");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int Sum;
		do{ 
			menu();
			System.out.print("���������ѡ��:");
			Sum=input.nextInt();
			switch(Sum){
			case 1:
				System.out.println("ִ���������ļӷ�����");
				Add(num1,num2);
				break;
			case 2:
				System.out.println("ִ���������ļ�������");
				jian(num1,num2);
				 break;
			case 3:
				System.out.println("ִ���������ĳ˷�����");
				cheng(num1,num2);
				break;
			case 4:
				System.out.println("ִ���������ĳ�������");
				chu(num1,num2);
				break;
			case 0:
				System.out.println("�˳�����");
				break;
				default:
					System.out.println("�������");
				break;
			}
		}while(Sum!=0);
	}
	public static void menu(){
		System.out.println("*****************************");
		System.out.println("***1.�ӷ�����   2.��������***");
		System.out.println("***3.�˷�����   4.��������***");
		System.out.println("******** 0.�˳����� *********");
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



