package www.s4owy.cn.day2;

import java.util.Scanner;



/*
 某商场购物可以打折，具体规则如下：

普通顾客购不满100元不打折，满100元打9折；

会员购物不满200元打8折，满200元打7.5折；

不同打折规则不累加计算。

 请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。
 */

public class utils {
    boolean vip;
    int money;
    double discount = 0;

    Scanner input = new Scanner(System.in);


    public void login() {
        System.out.print("您是vip吗?(是/否):");
        if (input.hasNext("是")) {
            vip = true;
        } else {
            vip = false;
        }
    }
}
