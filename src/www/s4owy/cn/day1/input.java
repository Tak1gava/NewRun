package www.s4owy.cn.day1;

import java.util.Scanner;

//键盘录入一个三位数，求这个三位数每一位的数字和。

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("请输入三位数字:");
        int temp = input.nextInt();

        if (temp < 1000) {
            int bai = temp / 100;
            int shi = temp / 10 % 10;
            int ge = temp % 10;
            System.out.println("每位的和为:" + (bai + shi + ge));
        } else {
            System.out.println("?");
            System.exit(0);
        }
    }
}
