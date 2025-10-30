package www.s4owy.cn.d05;
import java.util.Random;

//创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。
public class random {
    public static void main(String[] args) {
        int result = 0;
        Random ran = new Random();
        int[] arr = new int[6];
        for (int i = 0;i<6;i++){
            arr[i] = ran.nextInt(100);
        }

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println(result);
    }
}
