public class BinarySearchRecursive {
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
        int[] numbers = {1, 4, 6, 8, 10, 13, 44};
        int index = binarySearch(numbers, 0, numbers.length - 1, 45);
        System.out.println(index);
    }
}
