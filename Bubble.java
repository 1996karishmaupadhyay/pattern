public class Bubble {
    public static void main(String args[]) {

        // selection();
        buble();
    }

    // static void bubbleSort(int arr[]) {
    // int n = arr.length;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n - i - 1; j++) {
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    // }

    static void selectionSort(int arr1[]) {
        int n = arr1.length;
        for (int i = 0; i < n - 1; i++) {
            int minidx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr1[minidx] > arr1[j]) {
                    minidx = j;
                }
            }
            int temp = arr1[i];
            arr1[i] = arr1[minidx];
            arr1[minidx] = temp;
        }
    }

    static void buble() {
        int arr[] = { 6, 5, 1, 3 };
        int arr1[] = { 6, 9, 1, 3 };
       // bubbleSort(arr);
        selectionSort(arr1);
        for (int value : arr) {
            System.out.println("value" + value);
        }
    }

    static void selection() {
        int arr[] = { 6, 5, 1, 3 };
        // bubbleSort(arr);
        selectionSort(arr);
        for (int value : arr) {
            System.out.println("value" + value);
        }
    }
}