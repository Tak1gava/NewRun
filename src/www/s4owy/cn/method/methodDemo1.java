package www.s4owy.cn.method;

/*
* 需求：

	定义一个方法fill(int[] arr,int value)

功能：

将数组arr中的所有元素的值改为value
*/

import java.util.Scanner;

public class methodDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[]{1,2,3,4,5,6,7};
        System.out.print("请输入数值:");
        int value = input.nextInt();
        fill(num,value);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }

    }
    public static void fill(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }
}
