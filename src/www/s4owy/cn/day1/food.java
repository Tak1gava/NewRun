package www.s4owy.cn.day1;

//某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，
// 米饭单点3元。订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？


public class food {
    public static void main(String[] args) {
        int yu = 24;
        int hua = 8;
        int rice = 3;

        double discount = (yu + hua + rice) * 0.8;
        int money = ((yu - 8) + hua + rice);

        // if (discount > money) {
        //    System.out.println(discount + "\tis better");
        // } else {
        //    System.out.println(money + "\tis better");

        double max = discount > money ? discount : money;
        System.out.println(max + "is better");
    }
}

