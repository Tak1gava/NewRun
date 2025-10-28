package www.s4owy.cn.day2;
//某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
//
//	存期		年利率（%）
//
//  一年		2.25
//
//  两年		2.7
//
//	三年		3.25
//
//	五年		3.6
//
//请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
//
//提示：
//
//存入金额和存入年限均由键盘录入
//
//本息计算方式：本金+本金×年利率×年限

import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入金额:");
        double money;
        //存入
        do {
            money = input.nextInt();
            if (money < 1000) {
                System.out.println("金额太少了");
                System.out.print("请重新输入*大于1000:");
            }

        } while (money < 1000);

        //本息计算
        System.out.print("请输入年限:");
        switch (input.nextInt()) {
            case 1:
                money = money + (money * 2.25 * 1);
                break;
            case 2:
                money = money + (money * 2.7 * 2);
                break;
            case 3:
                money = money + (money * 3.25 * 3);
                break;
            case 4:
                money = money + (money * 3.6 * 4);
                break;
            default:
                System.out.println("?");
                System.exit(123);
        }

        System.out.println("本息总额为:" + money);
    }

}
