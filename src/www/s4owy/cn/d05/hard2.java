package www.s4owy.cn.d05;
/*## 题目7（很难）
定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）*/

import java.util.Random;

public class hard2 {
    public static void main(String[] args) {
        int[] Arr = new int[10];
        int[] NewArr = new int[10];
        int j = 0;
        Random ran = new Random();

        for (int i = 0; i < (Arr.length); i++) {
            Arr[i] = ran.nextInt(100);
        }

        for (int i = 0; i < Arr.length; i++) {
            //意味是奇数
            if (Arr[i] % 2 != 0 && Arr[i] != 0) {
                NewArr[j] = Arr[i];
                j++;
            }
        }
        for (int i = 0; i < Arr.length; i++) {
            //意味是偶数
            if (Arr[i] % 2 == 0 ) {
                NewArr[j] = Arr[i];
                j++;
            }
        }
        for (int k : NewArr) {
            System.out.print(k + " ");
        }

    }
}
