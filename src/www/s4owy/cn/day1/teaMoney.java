package www.s4owy.cn.day1;

public class teaMoney {
    public static void main(String[] args) {
        int redTea = 21 * 2 + 3;
        int greenTea = 24 * 2;
        String money;
        if (redTea != greenTea){
            money = "错误的";
        }else {
            money = "正确的";
        }
        System.out.println("red:" + redTea + "green:" + greenTea + "?:" + money);

    }
}
