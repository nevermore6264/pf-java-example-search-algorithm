public class BinarySearch {
    static int binarySearch(int[] arr, int row, int high, int value) {
        if (high >= row) {
            int mid = (row + high) / 2;
            if (value == arr[mid]) return mid;
            if (value > arr[mid])
                return binarySearch(arr, mid + 1, high, value);
            return binarySearch(arr, row, mid - 1, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        int value = 100;
        int arrNumber[] = {1, 2, 3, 33, 55, 67, 79};
        int resultIndex = binarySearch(arrNumber, 0, arrNumber.length - 1, value);
        System.out.println("Index is: " + resultIndex);
    }
}
