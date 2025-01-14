
// https://www.geeksforgeeks.org/problems/wave-array-1587115621/1?track=amazon-arrays&batchId=192
/**** Problem Statement:
 Given an array of integers, convert it into a wave-like array.
 A wave-like array is defined such that:
 - arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] ...
 This means that every even-indexed element is greater than or equal to its next element,
 and every odd-indexed element is less than or equal to its previous element.

 Example:
 Input: [1, 2, 3, 4, 5]
 Output: [2, 1, 4, 3, 5] or [4, 3, 2, 1, 5] (any valid wave-like arrangement) 
*******/

class WaveArray {
    public static void convertToWave(int[] arr) {
        for(int i=1; i < arr.length; i+=2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Display input array
        System.out.print("Input Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line for better formatting
        
        // Convert to wave
        convertToWave(arr);
        
        // Display output array
        System.out.print("Output Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
