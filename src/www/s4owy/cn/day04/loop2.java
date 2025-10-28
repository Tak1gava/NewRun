package www.s4owy.cn.day04;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int number1;
        int result = 0;
        System.out.print("请输入第一个整数:");
        number = input.nextInt();
        System.out.print("请输入第二个整数:");
        number1 = input.nextInt();
        if (number > number1) {
            result = number1;
            for (int i = number; i != 1; i--) {
                result += number1 += 1;
            }
        } else {
            result = number;
            for (int i = number1; i != 1; i--) {
                result += number += 1;
            }
        }
        System.out.println(result);
    }
}
