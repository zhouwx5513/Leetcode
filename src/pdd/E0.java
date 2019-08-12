package pdd;

import java.util.HashMap;

public class E0 {



public static String predeal(String tmp){

        int i = 0, j = tmp.length()-1;

        while (tmp.charAt(i)<'0'||tmp.charAt(i)>'9'){
            i++;
        }
        while (tmp.charAt(j)<'0'||tmp.charAt(j)>'9'){
            j--;
        }
        return tmp.substring(i,j+1);
}


    public static double getNums(String str) throws InterruptedException {

        int length = str.length();
        int i = 0, j = i ;
        double max = Double.MIN_VALUE;
        String tmp = "";
        int biao = -1;

        while(i<length&&j<length){
            //Thread.sleep(100);
            if ((str.charAt(j) >= '0' && str.charAt(j) <= '9') || ((str.charAt(j) == '.')&&(biao==-1))) {
                if(j==length-1){
                    tmp += str.charAt(j);
                    max = max>Double.parseDouble(tmp)?max:Double.parseDouble(tmp);
                    if(biao==-1)  return max;
                    else{
                        max = max>Double.parseDouble(tmp)?max:Double.parseDouble(tmp);
                        j = i = biao+1;
                        tmp = "";
                        biao = -1;
                        continue;
                    }
                }
                if(str.charAt(j) == '.'){
                    tmp += str.charAt(j);
                    biao = j++;
                    continue;
                }
                tmp += str.charAt(j);
                j++;
            }
            else {
                max = max>Double.parseDouble(tmp)?max:Double.parseDouble(tmp);
                if(biao==-1) biao = j;
                i = biao + 1;
                while(str.charAt(i)<'0'||str.charAt(i)>'9') i++;
                j = i;
                tmp = "";
                biao = -1;
            }
        }
        return max;
    }


    public static void main(String[] args) throws Exception{

        System.out.println(getNums(predeal("a1a23.456.789.5.a...")));
        System.out.println(getNums(predeal("123.456.789")));
        System.out.println(getNums(predeal("789.654.321.98a7.1a")));
    }

}
