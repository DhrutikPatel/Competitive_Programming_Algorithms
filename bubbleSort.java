/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class sort{
    public void bubbleSort(int[] arr){
        int i=0,j=1;
        int n = arr.length;
        boolean b;
        for(;i<n;i++){
            b = true;
            for(j=1;j<n-i;j++)
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    b = false;
                }
            if(b)   break;
        }
    }
}
class GFG {
	public static void main (String[] args) {
		int[] arr = {2,4,7,2,9,50,99,3,6,3,7,01};
		sort bs = new sort();
		System.out.println(Arrays.toString(arr));
		bs.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}