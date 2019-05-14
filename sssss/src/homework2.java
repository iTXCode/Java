import  java.util.Scanner;
public class homework2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数组的规模:");
        int num=input.nextInt();
        System.out.print("请输入数组的值:");
        int arr[]=new int[num];
        for(int i=0;i<num;i++) {
        arr[i]=input.nextInt();
        }
        int min=Min(arr);
        System.out.println("你所输入的数组的最小值="+min);

    }
    public static int Min(int arr[]){
       int min=arr[0];
       for(int i=1;i<arr.length;i++){
           if(min>arr[i])
               min=arr[i];
       }
       return min;
    }
}

