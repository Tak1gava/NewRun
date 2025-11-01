package www.s4owy.cn.d05;

import java.util.Arrays;
import java.util.Scanner;

/*
有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。
再通过键盘录入一个整数数字。要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：


请输入一个整数数字：
50
生成的新数组是：12 14 23 45 50 66 68 70 77 90 91
*/
public class hard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[]{12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] NewArr = new int[11];
        System.out.print("请输入数字:");
        NewArr[10] = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            NewArr[i] = arr[i];
        }
        Arrays.sort(NewArr);

        for (int i : NewArr) {
            System.out.print(i+" ");
        }
    }
}
