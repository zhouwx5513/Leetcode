package pdd;

import java.util.*;

/**
 *
 *
 * 给定两个数组A和B，其中数组A是几乎严格升序排列的，几乎的定义是只需改变其中一个数，即可满足完全升序排列。
 * 你的任务是从A中找到这个数组，并从数组B中选取一个数将其代替，使得A是严格升序排列的，请找出B中满足要求的最大数字，并输出有序数组，如不存在则输出NO。
 *
 *
 *
 *
 * 例如A=[1,3,8,7,10]，违反严格升序的数字有两个，可以是8也可以是7，代码的基本思路是从A中找到这两个数组，并且得到替换数字的两个区间，
 * 之后再从大到小遍历B，看是否有落在上述两个区间之一的数字。
 *
 */

public class E1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String[] aa = in.nextLine().split(" ");
            String[] bb = in.nextLine().split(" ");
            int[] a = new int[aa.length];
            int[] b = new int[bb.length];
            for(int i = 0; i < aa.length; ++i) {
                a[i] = Integer.parseInt(aa[i]);
            }
            for(int i = 0; i < bb.length; ++i) {
                b[i] = Integer.parseInt(bb[i]);
            }
            int cur = 0;
            for(; cur < a.length - 1; ++cur) {
                if(a[cur] >= a[cur+1]) break;
            }
            int left1 = cur == 0 ? Integer.MIN_VALUE : a[cur-1];
            int right1 = a[cur+1];
            int left2 = a[cur];
            int right2 = cur == a.length-2 ? Integer.MAX_VALUE : a[cur+2];

//            System.out.println("left1: " +  left1);
//            System.out.println("right1: "+ right1);
//            System.out.println("left2: "+   left2);
//            System.out.println("right2: "+ right2);

            Arrays.sort(b);
            int i = b.length - 1;
           // System.out.println("b "+Arrays.toString(b));
            for(; i >= 0; --i) {
                if(left1 < b[i] && b[i] < right1) {
                    a[cur] = b[i];
                    break;
                } else if(left2 < b[i] && b[i] < right2) {
                    a[cur+1] = b[i];
                    break;
                }
            }
            if(i == -1) {
                System.out.println("NO");
            } else {
                for(i = 0; i < a.length; ++i) {
                    System.out.print(a[i]);
                    if(i != a.length-1) System.out.print(" ");
                }
                System.out.print("\n");
            }
        }
    }
}
