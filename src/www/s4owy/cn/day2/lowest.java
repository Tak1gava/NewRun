package www.s4owy.cn.day2;

import java.util.Scanner;

//让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。


public class lowest {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一位整数:");
        a = input.nextInt();
        System.out.print("请输入第二位整数:");
        b = input.nextInt();
        System.out.print("请输入第三位整数:");
        c = input.nextInt();
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }

    }

}
