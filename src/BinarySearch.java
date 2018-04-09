public class BinarySearch {
    static int binarySearch(int arr[], int low, int high, int value) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearch(arr, low, mid - 1, value);
            return binarySearch(arr, mid + 1, high, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        int value = 4;
        int arrNumber[] = {1, 2, 3, 33, 55, 67, 79};
        int resultIndex = binarySearch(arrNumber, 0, arrNumber.length, value);
        System.out.println("Index is: " + resultIndex);
    }
}
