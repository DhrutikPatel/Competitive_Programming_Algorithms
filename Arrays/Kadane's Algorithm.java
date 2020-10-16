import java.util.*;

import java.lang.*;

import java.io.*;


class GFG {
	public static void main (String[] args) throws IOException {

		//code

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while(t-- > 0){

		    int n = Integer.parseInt(br.readLine());

		    String[] str = br.readLine().split(" ");

		    int[] arr = new int[n];

		    for(int i=0; i<n; i++){

		        arr[i] = Integer.parseInt(str[i]);

		    }

		    int max2 = 0;

		    int max = arr[0];



		    for(int i=0; i < n; i++){

		        max2 += arr[i];

		        if(max2 > max){

		            max = max2;

		        }

		        if (max2 < 0){

		            max2 = 0;

		        }

		    }

		     System.out.println(max);

		}

	}

}