package daji;

import  java.util.*;
public class Main1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        while(cases-- >0){
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] w = new int[n];
            int[] p = new int[n];
            for(int i = 0; i<n;i++){
                p[i] = scan.nextInt();
                w[i] = scan.nextInt();
            }
            System.out.println(soulution(m,n,w,p));
        }
      /*
        int m = 4; //容量
        int n = 3; //数量
       // int[] w = {1,2};
      //  int[] p = {10,20};

        int[] w = {2,3,2};
        int[] p = {10,18,10};

        System.out.println(soulution(m,n,w,p));
*/
    }
    public static int soulution(int m, int n, int[] w, int[] p){
        int[] c = new int[m+1];
        for(int i = 1; i<=n;i++){
            for(int j = m; j>=w[i-1];j--){
                c[j]  =Math.max(c[j-w[i-1]]+p[i-1],c[j]);
            }
        }
        return c[m];
    }

}
