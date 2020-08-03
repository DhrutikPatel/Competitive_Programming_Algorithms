/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class sort{
    public void SelectionSort(int[] arr){
        int i=0,j=0;
        int n = arr.length;
        int minInd;
        for(;i<n;i++){
            minInd = i;
    
            for(j=i+1;j<n;j++)
                if(arr[minInd]>arr[j])
                    minInd = j;
            
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
    }
}
class GFG {
	public static void main (String[] args) {
		int[] arr = {2,4,7,2,9,50,99,3,6,3,7,01};
		sort ss = new sort();
		System.out.println(Arrays.toString(arr));
		ss.SelectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}