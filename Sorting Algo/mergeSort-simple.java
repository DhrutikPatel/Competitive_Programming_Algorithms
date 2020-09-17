import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(str[i]);

        Merge(arr, 0, n-1);

        for(int i=0; i<n; i++)
            System.out.print(arr[i] + " ");
    }


    static void Merge(int[] arr, int start, int end){
        if(start < end){
            int mid = (start + end)/2;

            Merge(arr, start, mid);
            Merge(arr, mid+1, end);
            MergeSort(arr, start, mid, end);
        }
    }

    static void MergeSort(int[] arr, int s, int m, int e){
        int l = s;
        int r = m+1;
        int k = 0;
        int[] A = new int[e-s+1];

        for(k=0; k<e-s+1; k++){
            if(l > m)
                A[k] = arr[ r++ ];
            else if(r > e)
                A[k] = arr[ l++ ];
            else if(arr[l] > arr[r])
                A[k] = arr[ r++ ];
            else
                A[k] = arr[ l++ ];
        }
        for(k=0; k<A.length; k++){
            arr[ s++ ] = A[k];
        }
    }
}
