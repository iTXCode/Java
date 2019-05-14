package www.home.com;
public class shiyansan {
    public static void main(String[] args) {
        int arr[]={10,9,8,7,6,5,4,3,1,2,0};
        int n=arr.length;
        int flag=1;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    flag =0;
                }
                if(flag==1)
                    break;
            }
        }
        int sum=BinarySearch(arr,arr.length,5);
        System.out.println("所查找的数的下标为sum="+sum);
    }
    public static int BinarySearch(int arr[],int n,int value){
        int left=0;
        int right=n;
        while(left < right){
            int mid=(right-left)/2+left;
            if(arr[mid]==value){
                return mid;
            }else if(value<arr[mid]){
                right=mid;
            }
            else {
                left = mid;
            }
        }
        return -1;
    }

}

