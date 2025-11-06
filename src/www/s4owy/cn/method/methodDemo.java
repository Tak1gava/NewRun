package www.s4owy.cn.method;

/*键盘录入一个正整数

定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回

在main方法中打印该数字是几位数

演示格式如下:
(1)演示一:
	请输入一个整数:1234
	控制台输出:1234是4位数字
(2)演示二:
	请输入一个整数:34567
	控制台输出:34567是5位数字*/

import java.util.Scanner;

public class methodDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数字:");
        int num = input.nextInt();
        System.out.println("这个数字的位数:"+getCount(num));
    }

    public static int getCount(int num){
        int result=1;
        do{
            num = num/10;
            if (num<=0){
                break;
            }
            result++;

        }while (true);
        return result;
    }
}
