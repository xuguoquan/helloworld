package www.cashbus.com;

import java.util.Arrays;

/**
 * 冒泡排序
 * Created by PCc on 2017/9/18.
 */
public class MaoPaoTest {
    public static void main(String[] args) {
        int[] arr=new int[]{5,4,4,8,9,1,-1,6};
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
