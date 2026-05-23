public class Array {
    public static void main(String[] args) {
        int[] arr = getArray();

        System.out.println("Alternate elements of arr:");
        printAlternateElements(arr);
        System.out.println("duplicate array");
        duplicateArray(arr);
        
    }

    private static int[] getArray() {
        return new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    }

    private static void printAlternateElements(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("arrsy printed");
    }

    private static void duplicateArray(int[] arr){
        int n=arr.length;
        int res[]=new int[n];
        System.out.println("dup");
        for(int i=0;i<n;i++){
            res[i]=arr[i];
        System.out.println(res[i]);

        }
    }
}
