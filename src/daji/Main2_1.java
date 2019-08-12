package daji;

/*
4 4
ZuoZhuan TurnLeft
YouZhuan TurnRight
QianJin Forward
HouTui Backward
ZuoZhuan
QianJin
QianJin
HouTui
1 1
SDFlkjdf LNCIls
SDFlkjdf
 */

import java.util.*;


public class Main2_1 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            scanner.nextLine();
            //System.out.println("tmp"+scanner.nextLine()+"tmp");
            for (int i = 0; i < m; i++) {
                String[] tmp = scanner.nextLine().split(" ");
                hashMap.put(tmp[0], tmp[1]);
            }
            for (int i = 0; i < n; i++) {
                String tmp1 = scanner.nextLine();
                System.out.println(hashMap.get(tmp1));
            }
       }
    }
}
