package www.s4owy.cn.day04;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("请输入第一个整数");
        a = input.nextInt();
        System.out.print("请输入第二个整数");
        b = input.nextInt();
        System.out.print("请选择1.加 2.减 3.乘 4.除");
        switch (input.nextInt()) {
            case 1:
                System.out.println(":" + (a + b));
                break;
            case 2:
                System.out.println(":" + (a - b));
                break;
            case 3:
                System.out.println(":" + (a * b));
                break;
            case 4:
                System.out.println(":" + (a / b));
                break;
        }
    }
}
