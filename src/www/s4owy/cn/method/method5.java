package www.s4owy.cn.method;

import java.util.Scanner;

/*
 * 数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
 * */
public class method5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数字");
        double i = input.nextDouble();
        System.out.println("绝对值为"+getSheep(i));
    }

    public static double getSheep(double i) {
        if (i < 0) {
            i = -i;
        }
        return i;
    }
}
