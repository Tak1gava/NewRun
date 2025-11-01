package www.s4owy.cn.d05;

//定义一个数组来存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。
public class stu {
    public static void main(String[] args) {
        int[] stu = new int[]{72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int result = 0;
        for (int i = 0; i < stu.length; i++) {
            result += stu[i];
        }
        System.out.println("平均数为"+(result / stu.length));
    }
}
