package www.s4owy.cn.array;

public class count1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            //偶数
            if (arr[i] % 2 == 0) {
                temp = arr[i];
                System.out.print("偶数:" + (temp / 2) + "\t");
            } else {
                temp = arr[i];
                System.out.print("奇数" + (temp * 2) + "\t");
            }
        }
    }
}
