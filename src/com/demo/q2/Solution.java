package com.demo.q2;

// Time Complexity : O(n), Space Complexity : O(1) 

// Approach : When we rotate the array k times, k%nk elements from the back end of the array 
// come to the front and the rest of the elements from the front shift backwards.
// We firstly reverse all the elements of the array. Then, reversing the first 
// k elements followed by reversing the rest n-kn−k elements gives us the required result.

class Solution {
    private static void rotateArray(int[] A, int n, int k) {
    	if(n == 0) return;
        k = k % n;
        reverse(A, 0 , n-1);
        reverse(A, 0, k-1);
        reverse(A, k, n-1);
        
        for(int a : A) {
        	System.out.print(a + " ");
        }
    }
    
    private static void reverse(int[] A, int start, int end) {
        while(start < end) {
            int temp = A[start];
            A[start++] = A[end];
            A[end--] = temp;
        }
    }
    
    public static void main(String[] args) {
    	int[] A = {3, 8, 9, 7, 6};
    	int k = 3;
    	rotateArray(A, A.length, k);
    }
}
