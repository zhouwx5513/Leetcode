package Array;

public class Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] A) {
        if(A == null || A.length == 1) return A;
        //左、右指针初始化
        int left = 0;
        int right = A.length - 1;
        int tem;
        while(left < right){
            //左指针对应奇数值，右指针对应偶数值，进行交换
            if((A[left] & 1) == 1 && (A[right] & 1) == 0){
                tem = A[left];
                A[left] = A[right];
                A[right] = tem;
            }else if((A[left] & 1) == 0){
                //左指针对应的是偶数值，符合题意，继续向右移动
                left++;
            }
            else if((A[right] & 1) == 1){
                //右指针对应的是奇数值，符合题意，继续向左移动
                right--;
            }
        }
        return A;
    }
}
