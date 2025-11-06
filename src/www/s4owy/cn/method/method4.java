package www.s4owy.cn.method;

import java.util.Arrays;
import java.util.Scanner;

/*
在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：

```
请输入第一个整数：10
请输入第二个整数：30
请输入第三个整数：20
从大到小的顺序是： 30 20 10
```*/

public class method4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("1:");
        a = input.nextInt();
        System.out.print("2:");
        b = input.nextInt();
        System.out.print("3:");
        c = input.nextInt();
        printNum(a,b,c);
    }

    public static void printNum(int a, int b, int c) {
        int[] hajimi = new int[]{a, b, c};
        Arrays.sort(hajimi);
        for (int i = hajimi.length; i>0; i--) {
            System.out.print(hajimi[i-1] + " ");
        }
    }
}
