package www.s4owy.cn.d05;

//数组：{2, 1, 3, 5, 4}
//表示的整数为：21354 // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的。

public class count {
    public static void main(String[] args) {
        int result = 0;
        int[] arr = new int[]{2, 1, 3, 5, 4};
        for (int i = arr.length; i > 0; i--) {
            if (i == arr.length){
                result = arr[i];
            }


        }
    }
}
