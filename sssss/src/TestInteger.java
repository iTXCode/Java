
class MyInteger {
    int value ;
    String valuel;
    MyInteger(int value){
        this.value = value;
    }
    MyInteger(String valuel){
        this.valuel = valuel;}
    int getter(){
        return value;}

    boolean isEven(){
        if (value%2==0)
            return true;
        else return false;}
    boolean isOdd(){
        if (value%2==1)
            return true;
        else return false;}
    boolean isPrime(){
        for(int i=2;i<=value/2;i++)
            if(value%i==0)
                return false;
        return true;}

    boolean isEven(int value){
        this.value=value;
        if (value%2==0)
            return true;
        else return false;}
    boolean isOdd(int value){
        this.value=value;
        if (value%2==1)
            return true;
        else return false;}
    boolean isPrime(int value){
        this.value=value;
        for(int i=2;i<=value/2;i++)
            if(value%i==0)
                return false;
        return true;}

    boolean isEven(MyInteger value){
        return value.isEven();}
    boolean isOdd(MyInteger value){
        return value.isOdd();}
    boolean isPrime(MyInteger value){
        return value.isPrime();}

    boolean equals(int value){
        return this.value==value;}
    boolean equals(MyInteger value){
        return value.equals(this.value);}

    int parseInt(char[] c){
        String s = new String(c);
        return parseInt(s);
    }
    int parseInt(String s){
        return Integer.valueOf(s);
    }
}
public class TestInteger{
    public static void main(String [] args){
        MyInteger m=new MyInteger(13);
        System.out.println("是偶数吗  "+m.isEven()+"\t是奇数吗"+m.isOdd()+"\t是素数吗"+m.isPrime());
        System.out.println("是偶数吗  "+m.isEven(12)+"\t是奇数吗"+m.isOdd(12) + "\t是素数吗"+m.isPrime(12));

        System.out.println("是否相等  "+m.equals(14));
        System.out.println(m.parseInt("123"));
    }}

