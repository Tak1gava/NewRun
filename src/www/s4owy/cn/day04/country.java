package www.s4owy.cn.day04;


import java.util.Scanner;

/*


2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。也就是说税前工资扣除三险一金（三险一金数额假设是税前工资的10%）
后如果不足5000元，则不交税。如果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下：

0 ~ 3000元的部分，交税3%

3000 ~ 12000元的部分，交税10%

12000 ~ 25000的部分 ， 交税20%

25000 ~ 35000的部分，交税25%

35000 ~ 55000的部分，交税30%

55000 ~ 80000的部分，交税35%

 超过80000的部分，交税45%
                                                                  san >                          三千以下 三千以上
 比如：黑马某学员入职一家企业后，税前工资是15000，则他每月该交个税的部分是15000-1500-5000=8500元，个税缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。

 请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少？
 */
public class country {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wage;
        double wagetemp;
        double result = 0;

        System.out.print("请输入税前工资:");
        wage = input.nextDouble();
        wagetemp = wage;
        wage = wage - (wage * 0.1);

        if ((wage-5000)>=0){
            for (int i = 1; i > 0; i++) {
                if (wage <= 3000) {
                    wage = wage - (wage * 0.03);
                    result += wage;
                    break;
                } else if (wage > 3000 && wage < 12000) {
                    wage = wage - (wage * 0.1);
                    result += wage;
                } else if (wage > 12000 && wage < 25000) {
                    wage = wage - (wage * 0.2);
                    result += wage;
                } else if (wage > 25000 && wage < 35000) {
                    wage = wage - (wage * 0.25);
                    result += wage;
                } else if (wage > 35000 && wage < 55000) {
                    wage = wage - (wage * 0.3);
                    result += wage;
                } else if (wage > 55000 && wage <= 80000) {
                    wage = wage - (wage * 0.35);
                    result += wage;
                } else if (wage > 80000) {
                    wage = wage - (wage * 0.45);
                    result += wage;
                }
            }
        }else{
            System.out.print("您无需交税");

        }
        System.out.println(wage+"a"+(wagetemp-wage));

    }
}
