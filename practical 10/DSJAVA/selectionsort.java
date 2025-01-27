package DSJAVA;

public class selectionsort {
    

    void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; ++i) {
            int minIndex = i;
            for (int j = i+1; j < n; ++j) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        selectionsort ob = new selectionsort();
        ob.selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
