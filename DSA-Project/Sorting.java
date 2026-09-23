public class Sorting{
    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
public static void quickSort(int[] array, int low, int high) {
    if (low < high) {
        int pivotIndex = partition(array, low, high);
        quickSort(array, low, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, high);
    }
}
public static int partition(int[] array, int low, int high) {
    int pivot = array[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
        if (array[j] <= pivot) {
            i++;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;
    return i + 1;
}

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }
    public static void merge(
        int[] array,
        int left,
        int middle,
        int right) {

        int size1 = middle - left + 1;
        int size2 = right - middle;
        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];
        for (int i = 0; i < size1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < size2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < size1 && j < size2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < size1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < size2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] originalArray = {17, 5, 23, 8, 14, 3, 11, 20, 6, 9};
            
        int[] quickArray = originalArray.clone();
        quickSort(quickArray,0,quickArray.length - 1);
        System.out.println("Quick Sort:");
        displayArray(quickArray); 

        int[] selectionArray = originalArray;
        selectionSort(selectionArray);
        System.out.println("Selection Sort:");
        displayArray(selectionArray);

        int[] insertionArray = originalArray;
        insertionSort(insertionArray);
        System.out.println("Insertion Sort:");
        displayArray(insertionArray);

        int[] mergeArray = originalArray;
        mergeSort(
            mergeArray,
            0,
            mergeArray.length - 1
        );
        System.out.println("Merge Sort:");
        displayArray(mergeArray);
    }
}
