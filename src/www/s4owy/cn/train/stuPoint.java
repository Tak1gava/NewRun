package www.s4owy.cn.train;
/*
*
需求 :
在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
**/

import java.util.Arrays;
import java.util.Random;

public class stuPoint {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] count = new int[6];
        for (int i = 0; i < count.length; i++) {
            count[i] = ran.nextInt(101);
        }
        int result = resolvePoint(count);
        System.out.println("得分为:" + result);
    }

    public static int resolvePoint(int[] point) {
        int result = 0;
        Arrays.sort(point);
        point[0] = 0;
        point[5] = 0;
        for (int i = 0; i < point.length; i++) {
            result += point[i];
        }
        result = result/4;
        return result;
    }

}
