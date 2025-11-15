package www.s4owy.cn.train;

import java.util.Scanner;

/*
*
# 练习一：飞机票

需求:

机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。

按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。

*/
public class train1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month;
        double price;
        boolean isVip = false;
        System.out.print("请输入机票原价:");
        price = input.nextDouble();
        System.out.print("请输入月份:");
        month = input.nextInt();
        System.out.print("请输入舱型1.头等舱 2.经济舱");
        if (input.next().equals("1")) {
            isVip = true;
        }
        System.out.println("您的价格为:" + checkOut(price, month, isVip));
    }


    public static double checkOut(double price, int month, boolean isVip) {
        //旺季
        if (month >= 5 && month <= 10) {
            if (isVip) {
                price = price * 0.9;
            } else {
                price = price * 0.8;
            }
        } else {
            if (isVip) {
                price = price * 0.7;
            } else {
                price = price * 0.65;
            }
        }
        return price;
    }
}
