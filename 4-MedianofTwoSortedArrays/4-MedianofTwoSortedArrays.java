// Last updated: 10/22/2025, 2:32:53 PM
import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];

        // Copy elements
        for (int i = 0; i < nums1.length; i++) arr[i] = nums1[i];
        for (int i = 0; i < nums2.length; i++) arr[nums1.length + i] = nums2[i];

        // Sort the combined array
        Arrays.sort(arr);

        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n/2 - 1] + arr[n/2]) / 2.0;
        } else {
            return arr[n/2];
        }
    }
}