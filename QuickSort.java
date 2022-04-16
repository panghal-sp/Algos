package com.sort;

public class QuickSort {
	
	public void swap(int [] arr, int i , int j) {
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
		
	}
	public int partition(int [] arr, int low , int high) {
		
			
			// pivot
			int pivot = arr[high];
			
			// Index of smaller element and
			// indicates the right position
			// of pivot found so far
			int i = (low - 1);

			for(int j = low; j <= high - 1; j++)
			{
				
				// If current element is smaller
				// than the pivot
				if (arr[j] < pivot)
				{
					
					// Increment index of
					// smaller element
					i++;
					swap(arr, i, j);
				}
			}
			swap(arr, i + 1, high);
			System.out.println("\nSorted array");
			 printArray(arr);
			return (i + 1);
		
	}
	public void quickSort(int [] arr, int l , int h) {
		if(l<h) {
			int pivot=partition(arr,l,h);
			quickSort(arr,l,pivot-1);
			quickSort(arr,pivot+1,h);
		}
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
		QuickSort algo=new QuickSort();
		
		int arr[] = {12,11,2,6};
		  
     System.out.println("Given Array");
     printArray(arr);

    algo.quickSort(arr, 0, arr.length-1);

     System.out.println("\nSorted array");
     printArray(arr);
	}

}
