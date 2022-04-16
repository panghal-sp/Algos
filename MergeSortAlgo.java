package com.sort;

import java.util.Arrays;

public class MergeSortAlgo {

	public int[] merge_sort(int[] input) {
		if (input.length <= 1) {
			return input;
		}
		int mid = input.length / 2;
		int[] left_list = merge_sort(Arrays.copyOfRange(input, 0, mid));
		System.out.println("left");
		printArray(left_list);
		int[] right_list = merge_sort(Arrays.copyOfRange(input, mid, input.length));
		System.out.println("right");
		printArray(right_list);
		return merge(left_list, right_list);
	}

	public static int[] merge(int[] left_list, int[] right_list) {
		int[] ret = new int[left_list.length + right_list.length];
		int left_cursor = 0, right_cursor = 0, ret_cursor = 0;
		int count=0;
		while (left_cursor < left_list.length && right_cursor < right_list.length) {
			if (left_list[left_cursor] <= right_list[right_cursor]) {
				ret[ret_cursor++] = left_list[left_cursor++];
			} else {
				ret[ret_cursor++] = right_list[right_cursor++];
				count += ((left_list.length+right_list.length)/2)-left_cursor;
			}
		}
		System.out.println(count);
		// append what is remain the above lists
		while (left_cursor < left_list.length) {
			ret[ret_cursor++] = left_list[left_cursor++];
		}
		while (right_cursor < right_list.length) {
			ret[ret_cursor++] = right_list[right_cursor++];
		}
		return ret;
	}

	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortAlgo algo=new MergeSortAlgo();
		
		int arr[] = { 12, 11, 13, 5, 6, 7 ,7,11,2 };
		  
        System.out.println("Given Array");
        printArray(arr);
  
       int newArr []= algo.merge_sort(arr);
  
        System.out.println("\nSorted array");
        printArray(newArr);
		
	}
	

}
