package www.s4owy.cn.train;

import java.util.Random;

/*
* 需求：

	定义方法实现随机产生一个5位的验证码

验证码格式：

	长度为5

	前四位是大写字母或者小写字母

	最后一位是数字*/
public class authCode {
    public static void main(String[] args) {
        for (int i = 0; i < creatCode().length; i++) {
            System.out.print(creatCode()[i]);
        }
    }

    public static String[] creatCode() {
        Random random = new Random();
        int temp = 0;
        String[] code = new String[5];
        String[] little = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] big = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "G", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (int i = 0; i < 4; i++) {
            temp = random.nextInt(2);
            if (temp == 1) {
                code[i] = little[random.nextInt(25)];
            } else {
                code[i] = big[random.nextInt(25)];
            }
        }
        code[4] = String.valueOf(random.nextInt(10));
        return code;
    }
}
