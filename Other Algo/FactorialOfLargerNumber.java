
import java.util.*;

import java.lang.*;

import java.io.*;




class GFG {

    
	public static void main (String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		
		while(t-- > 0){

		    int n = Integer.parseInt(br.readLine());

		    int[] fact = new int[100000000];

		    fact[0] = 1;

		    int size = 1;

		    int carry = 0;

		    

		    for(int i=2; i<=n; i++){

		        for(int j=0; j<size; j++){

		            int product = i*fact[j] + carry;

		            fact[j] = product%10;

		            carry = product/10;

		        }

		        while(carry > 0){

		            fact[size] = carry%10;

		            carry /= 10;

		            size++;

		        }

		    }

		    

		    for(int i=size-1; i>=0; i--)

	    		    System.out.print(fact[i]);



    		System.out.println();

		}

	}

}