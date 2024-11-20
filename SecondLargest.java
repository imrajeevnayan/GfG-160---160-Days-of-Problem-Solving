public class SecondLargest {
    public static int secondLargest(int[] arr) {
        // If the array has fewer than two elements, return -1
        if (arr.length < 2) {
            return -1;
        }
        
        int largest = -1;
        int secondLargest = -1;
        
        // Loop through the array
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        // If no second largest element is found, return -1
        return secondLargest;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(secondLargest(arr));  // Output: 4
    }
}
