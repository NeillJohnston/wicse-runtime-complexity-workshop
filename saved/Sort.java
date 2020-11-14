import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
Test 1 Input:

5
1 2 3 4 5
1 2 4 5

Test 1 Output:

3

Test 2 Input:

6
2 3 5 7 11 13
13 5 2 7 3

Test 2 Output:

11
*/

class Solution {
    /* "Missing"
     * You’re given two arrays of numbers, creatively named array1 and array2.
     * The two arrays are extremely similar: array2 has all the elements that array1 has, except for exactly one.
     * Find the missing element.
     */
    int solve(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i] || i >= array2.length) {
                return array1[i];
            }
        }
        
        return 0;
    }
}

// Runs the program. Don't edit!
public class Main {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        Solution solver = new Solution();
        
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n-1];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        for (int i = 0; i < n-1; i++)
            b[i] = in.nextInt();
        
        int ans = solver.solve(a, b);
        
        System.out.println(ans);
    }
  
    static class FastReader { 
        BufferedReader br; 
        StringTokenizer st; 
    
        public FastReader() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
    
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            }
            return st.nextToken(); 
        } 
    
        int nextInt() { 
            return Integer.parseInt(next()); 
        }
    }
}