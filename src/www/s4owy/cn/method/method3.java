package www.s4owy.cn.method;

import java.util.Scanner;

public class method3 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int result = getMax();
        System.out.println(result);

    }

    public static int getMax() {
        System.out.print("请输入第1个数字");
        int a = input.nextInt();
        System.out.print("请输入第2个数字");
        int b = input.nextInt();
        System.out.print("请输入第3个数字");
        int c = input.nextInt();
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        }else {
            return c;
        }
    }
}
