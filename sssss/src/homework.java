import  java.util.Scanner;
public class homework {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入学生的人数:");
        int num=input.nextInt();
        System.out.print("请输入你所输入的学生的成绩:");
        int arr[]=new int[num];
        for(int i=0;i<num;i++) {
        arr[i]=input.nextInt();
        }
        int max=Max(arr);
        System.out.println("你所输入的学生的成绩best="+max);
        for(int i=0;i<num;i++){
            if(arr[i]>=max-10) {
                System.out.println("Student "+i+" score is "+arr[i]+"  Grade is A");
                continue;
            }else if(arr[i]>=max-20&&arr[i]<=max-10){
                System.out.println("Student "+i+" score is "+arr[i]+"  Grade is B");
                continue;
            }else if(arr[i]>=max-30&&arr[i]<=max-20){
                System.out.println("Student "+i+" score is "+arr[i]+"  Grade is C");
                continue;
            }else{
                System.out.println("Student "+i+" score is "+arr[i]+"  Grade is D");
                continue;
            }
        }

    }
    public static int Max(int arr[]){
       int max=arr[0];
       for(int i=1;i<arr.length;i++){
           if(max<arr[i])
               max=arr[i];
       }
       return max;
    }
}
