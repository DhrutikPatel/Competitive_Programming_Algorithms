/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class sort{
    public void InsertionSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
class GFG {
	public static void main (String[] args) {
		int[] arr = {2,4,7,2,9,50,99,3,6,3,7,01};
		sort is = new sort();
		System.out.println(Arrays.toString(arr));
		is.InsertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}