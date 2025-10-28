package www.s4owy.cn.day2;
//李雷想买一个价值7988元的新手机，
// 她的旧手机在二手市场能卖1500元，
// 而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？请在控制台输出。

public class phone {
    public static void main(String[] args) {
        double trade = 7988 * 0.8;
        int really = 7988 - 1500;

        if (trade < really) {
            System.out.println(trade);
        } else {
            System.out.println(really);
        }
    }
}
