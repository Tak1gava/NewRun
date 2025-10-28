package www.s4owy.cn.array;

public class main1 {
    public static void main(String[] args) {
        int result = 0;
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
                result++;
            }
        }
        System.out.println("能被整除的数字总和为" + result);
    }
}
