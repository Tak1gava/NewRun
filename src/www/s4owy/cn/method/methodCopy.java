package www.s4owy.cn.method;

import java.util.Scanner;

/*
*

## 题目9：（较难）

需求：

定义一个方法copyOf(int[] arr, int newLength)

功能：

将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引为0开始
*/
public class methodCopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("INPUT:");
        int count = input.nextInt();
        for (int i = 0; i < copyOf(arr, count).length; i++) {
            if (copyOf(arr,count)[i]==0){
                break;
            }else{
                System.out.print(copyOf(arr, count)[i] + " ");
            }
        }
    }

    public static int[] copyOf(int[] arr, int newLength) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newLength; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
