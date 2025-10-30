package www.s4owy.cn.d05;

//现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。

public class little {
    public static void main(String[] args) {
        double[] count = new double[]{12.9,53.54,75.0,99.1,3.14};
        double result = count[0];

        for (int i = 0; i < count.length; i++) {
            if (count[i]<result){
                result =count[i];
            }
        }
        System.out.println(result);
    }

}
