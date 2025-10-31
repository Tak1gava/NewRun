package www.s4owy.cn.d05;

//数组：{2, 1, 3, 5, 4}
//表示的整数为：21354 // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的。

public class count {
    public static void main(String[] args) {
        int num = 10;
        int result = 0;
        int[] arr = new int[]{2, 1, 3, 5, 4};

        //arr.length 是数组长度 下标应-1
        for (int i = (arr.length - 1); i >= 0; i--) {
            if (i == (arr.length - 1)) {
                result = arr[i];
                continue;
            }
            result += arr[i] * num;
            num = num * 10;
        }
        System.out.println(result);
    }
}
