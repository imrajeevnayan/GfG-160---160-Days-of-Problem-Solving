public class MoveZeroes {
    public static void moveZeroesToEnd(int[] arr) {
        int nonZeroIndex = 0; // Pointer to keep track of non-zero elements position

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element with the element at nonZeroIndex
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                
                // Increment nonZeroIndex to next position
                nonZeroIndex++;
            }
        }
    }

    // Test the function
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 0, 4, 5, 0, 3};
        moveZeroesToEnd(arr);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: 1 9 4 5 3 0 0 0
    }
}
