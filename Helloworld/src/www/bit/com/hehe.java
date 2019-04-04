package www.bit.com;

public class hehe {
    public static void main(String[] args) {
System.out.println("Kliograms       Pounds|        Pounds       Kliograms");
        int i=1;
    for(int j=20;j<=515;j+=5) {
        double a = 2.2 * i;
        double b = j / 2.2;
        System.out.print(i+"       ");
        System.out.printf("%.1f     |",a);
        System.out.printf("  %d         ",j);
        System.out.printf("%.2f",b);
        System.out.println("   ");
        i+=2;
    }

    }
}
