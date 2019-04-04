package Helloworld.out.production;

public class xhunhuan01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=100;i<=200;i++) {
			if((i%5==0)^(i%6==0)) {
				sum++;
				System.out.print("i="+i+ "   ");
				if(sum%10==0) {
					System.out.println(" ");
				}
			}
			}
		System.out.println("sum="+sum);

		}
		
	}

