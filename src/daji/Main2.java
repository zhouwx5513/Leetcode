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
public class Main2 {

    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap();
        List<String> res = new ArrayList<>();
        List<String> resoure = new ArrayList<>();
        List<String> order = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < m; i++) {
                String tmp1 = scanner.nextLine();
                resoure.add(tmp1);
            }
            for (int i = 0; i < n; i++) {
                String tmp1 = scanner.nextLine();
                order.add(tmp1);
            }
            for (int i = 0; i < m; i++) {
                // System.out.println("hehe "+ resoure.get(i));
                String[] tmp = resoure.get(i).split(" ");
                hashMap.put(tmp[0], tmp[1]);
            }
            for (int i = 0; i < n; i++) {
                res.add(hashMap.get(order.get(i)));
            }
            for (String r : res)
                System.out.println(r);
            res = new ArrayList<>();
            order = new ArrayList<>();
            resoure = new ArrayList<>();
       }
    }
}
