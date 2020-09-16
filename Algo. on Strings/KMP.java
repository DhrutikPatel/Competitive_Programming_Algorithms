import java.io.*;
import java.util.*;

class KMP {
    static void ArrayF(int[] F, String p){
        int len = 0;
        F[0] = 0;
        for(int i=1; i<p.length(); i++){
            if(p.charAt(i) == p.charAt(len))
                F[i] = ++len;
            else if(len != 0){
                len = F[len-1];
                i--;
            }
            else
                F[i] = 0;
        }
    }

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String p = br.readLine();
        String t = br.readLine();
        int m = p.length();
        int count = 0;
        int j = 0;
        int[] F = new int[m];
        ArrayF(F, p);
        for(int i=0; i<t.length(); i++){
            if(p.charAt(j) == t.charAt(i))
                j++;
            else if(j != 0){
                j = F[j-1];
                i--;
            }

            if(j == m){
                count++;
                j = F[j-1];
            }
        }
        System.out.println(count);
    }
}