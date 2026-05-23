public class Array {
    public static void main(String[] args) {
        int[] arr = getArray();

        System.out.println("Alternate elements of arr:");
        printAlternateElements(arr);
        System.out.println("duplicate array");
        duplicateArray(arr);
        System.out.println("odd even");
        oddEven(arr);
        System.out.println("sum Product");
        sumproductB(arr);
        System.out.println("count target 2");
        countTarget(arr);
        System.out.println("searc sorted or not");
        sortin(arr);
        System.out.println("count unique and duplicate");
        countUniqueAndDuplicate(arr);
    }

    private static int[] getArray() {
        // return new int[] { 1, 2, 3, 4, 2, 6, 7, 8, 2 };
        return new int[] { 1, 2, 3, 4 ,1,3,4};
    }

    private static void printAlternateElements(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("arrsy printed");
    }

    private static void duplicateArray(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];
        System.out.println("dup");
        for (int i = 0; i < n; i++) {
            res[i] = arr[i];
            System.out.println(res[i]);

        }
    }

    private static void oddEven(int[] arr) {
        int n = arr.length;

        int odd_count = 0;
        int even_count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }
        int[] odd = new int[odd_count];
        int[] even = new int[even_count];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even[evenIndex] = arr[i];
                evenIndex++;
            } else {
                odd[oddIndex] = arr[i];
                oddIndex++;
            }
        }
        System.out.println("odd");
        for (int i = 0; i < odd_count; i++) {

            System.out.println(odd[i]);
        }
        System.out.println("even");
        for (int i = 0; i < even_count; i++) {

            System.out.println(even[i]);
        }

    }

    private static void sumproductB(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int product = 1;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("sum" + sum);
        System.out.println("product" + product);
    }

    private static void countTarget(int[] arr) {
        int count = 0;
        int n = arr.length;
        int target = 2;
        // for(int i=0;i<n;i++){
        // if(arr[i]==target){
        // count=count+1;
        // }
        // }
        int i = 0;
        while (i < n) {
            System.out.println("skip " + i);
            if (arr[i] == target) {
                count++;
                System.out.println("index = " + i + " count = " + count);
            }

            i++;

        }

        System.out.println("final count = " + count);
    }

    private static void sortin(int[] arr){
        int n= arr.length;
        boolean asc=true;
        boolean des=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                des=false;
            }else{
                asc=false;
            }
        }
        if(asc){
            System.out.println("asc");
        } else if(des){
            System.out.println("des");
        }else{
            System.out.println("not sorted");
        }
    }

    private static void countUniqueAndDuplicate(int[] arr){
        int n=arr.length ;
        int[] ans=new int[n+1];
      
        for(int i=0;i<n;i++){
           ans[arr[i]]++;
             System.out.println(arr[i]);
             
        }
        for(int i=0;i<=n;i++){
            System.out.println(ans[i]);
        }
        int unique=0;
        int dup=0;
        for(int i=0;i<=n;i++){
            if(ans[i]==1){
                unique++;
            }else if(ans[i]>1){
                dup++;
            }
        }
        System.out.println("uni" + unique);
        System.out.println("dup" + dup);
      
    }
}
