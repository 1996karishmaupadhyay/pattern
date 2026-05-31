public class ArrayBasic {
    public static void main(String[] args) {

        int n = 6;
        int[] arr = new int[n];

        // Adding elements
        System.out.println("Adding elements in array:");
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        // Array in order
        System.out.print("Array in order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Array in reverse order
        System.out.print("Array in reverse order: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Duplicate array
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] copied = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            copied[i] = arr1[i];
        }

        System.out.print("Copied array: ");
        for (int i = 0; i < copied.length; i++) {
            System.out.print(copied[i] + " ");
        }
        System.out.println();


        // odd and even array
    int[] arr2 = {1, 2, 3, 4, 5, 6};;
    int odd[] = new int[arr2.length];
    int even[] = new int[arr2.length];
    for(int i=0;i<arr2.length;i++){
        if(arr2[i]%2==0){
            even[i]=arr2[i];
        }else{
            odd[i]=arr2[i];
        }
    }
    System.out.print("odd array: ");
    for(int i=0;i<odd.length;i++){
        if(odd[i]!=0){
            System.out.print(odd[i]+" ");
        }
    }
    System.out.println();
    System.out.print("even array: ");
    for(int i=0;i<even.length;i++){
        if(even[i]!=0){
            System.out.print(even[i]+" ");
        }
    }
    System.out.println();
    // sum and product of array
    int[] arr3 = {1, 2, 3, 4, 5, 6};
    int sum=0;
    int product=1;
    for(int i=0;i<arr3.length;i++){
        sum+=arr3[i];
        product*=arr3[i];
    }
    System.out.println("sum: "+sum);
    System.out.println("product: "+product);

    int arr4[] = {1, 2, 3, 4, 5, 6,6,3,3,5,3,3};
    int target=3;
    int count =0;
    for(int i=0;i<arr4.length;i++){
        if(arr4[i]==target){
            count++;
        }
    }
    System.out.println("count of target "+target+" is: "+count);

    int[] arr5 = {1, 2, 3, 4, 5, 6,};
    boolean ascending=false;
    boolean descending=false;
    boolean not_in_order=false;
    for(int i=0;i<arr5.length-1;i++){
        if(arr5[i]>arr5[i+1]){
          
            descending=true;
        }else if(arr5[i]<arr5[i+1]){
            ascending=true;
        }else{
            not_in_order=true;
        }
    }
    if(ascending && descending){
        System.out.println("array is in not-in-order order");

    }
    else if(descending){
        System.out.println("array is in descending order");

    }
    else {
        System.out.println("array is in ascending order");
    }

//count duplicate and unique this is wrong code
//     int arr6[] = {1, 2, 3, 4, 5, 6,3,3,3,3,3,3};
//     int dupCount=0;
//     int uniCount=0;
// for(int i=0;i<arr6.length-1;i++){
//     for(int j=i+1;j<arr6.length;j++){
// if(arr6[i]==arr6[j]){
//     dupCount++;
// }else{
//     uniCount++;
// }
//     }
// }
// System.out.println("Duplicate elements: " + dupCount);
// System.out.println("Unique elements: " + uniCount);

int arr7[] = {1, 2, 3, 4, 5, 6,3,3,3,3,3,3};
int targetsum=10;
for(int i=0;i<arr7.length-1;i++){
    for(int j=i+1;j<arr7.length;j++){
        if(arr7[i]+arr7[j]==targetsum){
            System.out.println("pair found: "+arr7[i]+" and "+arr7[j]);
        }
        
    }
}

int arr8[] = {1, 2, 3, 4, 5, 6,3,3,3,3,3,3};
int targetsum3=10;


}
}