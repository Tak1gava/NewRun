package www.s4owy.cn.day04;
//程序自动生成一个1-100之间的随机数字，使用程序实现猜出这个数字是多少？

import java.util.Scanner;
import java.util.Random;

public class guess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int random = r.nextInt(101);
        int i;

        do {
            System.out.print("请输入:");
            i=input.nextInt();

            if (i<random){
                System.out.println("小了");
            } else if (i>random) {
                System.out.println("大了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }while (true);
    }
}
