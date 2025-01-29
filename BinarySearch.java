import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: List size and elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (space-separated): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sorting the array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Input: Element to search
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(arr, key);

        // Output result
        if (result == -1) {
            System.out.println("Element not found in the list.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }

    // Binary search method
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if key is at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If key is smaller than mid, search left subarray
            if (key < arr[mid]) {
                right = mid - 1;
            } else { // Search right subarray
                left = mid + 1;
            }
        }

        // Key not found
        return -1;
    }
}


OUTPUT
Enter the number of elements: 5
Enter 5 elements (space-separated):
26 28 29 65 89
Sorted array: [26, 28, 29, 65, 89]
Enter the element to search: 29
Element found at index: 2