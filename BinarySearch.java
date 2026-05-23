public class BinarySearch {
    public static void main(String[] args) {
       int[] arr=getArr();
     int ans=  lowerBound(arr);
     System.out.println(ans);
     int ans2=upperBound(arr);
     System.out.println(ans2);
    }
    private static int[] getArr(){
        return new int[] {1,3,4,4,4,4,4,5,7};
    }
    private static int lowerBound(int[] arr){
int start=0;
int end=arr.length-1;
int mid;
int target=4;
int lower_bound=-1;
while (start<=end) {
    mid=start+(end-start)/2;
    if(arr[mid]>=target){
        lower_bound=mid;
        end=mid-1;
    }else{
        start=mid+1;
    }
}
return lower_bound;
    }

    private static int upperBound(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid;
        int upper_bound=-1;
        int target=6;
        while (start<=end) {
            mid=start+(end-start)/2;
            if(arr[mid]>target){
                upper_bound=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return upper_bound;
    }
}
