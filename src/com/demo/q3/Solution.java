package com.demo.q3;

import java.util.*;

// Time : O(N), Space : O(N), where N is the length of the array

// Approach : Array A can be of length more than n, but we need to check whether 
// all elements from 1 to n exists in the array. So if the elements in the array
// are in the range 1 to n, add it to a set, and check whether the size of the set 
// is same as n. 

public class Solution {
	private static int isPermutation(int[] A, int n) {
		Set<Integer> s = new HashSet<Integer>();
		for(int a : A) {
			if(a >= 1 && a <= n) {
				if(s.contains(a)) return 0;
				s.add(a);
			}
		}
		return s.size() == n ? 1 : 0;
	}
	
	public static void main(String[] args) {
		int[] A = {8,1,3,2,4,8,7};
		int n = 4;
		if(isPermutation(A, n) == 1) {
			System.out.println("It is a permutation");
		} else {
			System.out.println("Not a permutation");
		}
	}
}
