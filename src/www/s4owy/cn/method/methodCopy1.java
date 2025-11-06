package www.s4owy.cn.method;

import java.util.Scanner;

/*
* 定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)

功能：

	将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value*/
public class methodCopy1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        Scanner input = new Scanner(System.in);
        System.out.print("from");
        int fromIndex = input.nextInt();
        System.out.print("to");
        int toIndex = input.nextInt();
        System.out.print("value");
        int value = input.nextInt();
        fill(arr,fromIndex,toIndex,value);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void fill(int[] arr,int fromIndex,int toIndex,int value){
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
    }
}
