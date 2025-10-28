package www.s4owy.cn.day1;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dad = 177;
        int mom = 165;

        //强制类型转换
        int boy = (int)((dad + mom) * 1.08 / 2);
        int girl = (int)((dad * 0.923 + 165) / 2);

        System.out.println("boy:" + boy + "\t" + "girl:" + girl);
    }
}
