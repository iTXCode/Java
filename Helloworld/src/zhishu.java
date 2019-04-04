public class zhishu {
    public static void main(String[] args){
       isPrinme(10000);
    }
    public static void isPrinme(int sum){
        int n=0,i=0,j=0;
        for( i=2;i<10000;i++){
            int num=1;
            for( j=2;j<=i/2;j++){
                if(i%j==0){
                    num=0;
                    break;
                }
            }
            if(num==1){
                System.out.print(i+" ");
                n++;
                if(n%10==0){
                    System.out.println();
                }
            }
        }
        System.out.println("n="+n);
    }
}
