package www.s4owy.cn.array;

import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[50];
        int num = 0;
        do {
            System.out.print("请输入第" + (num + 1) + "位学生姓名:");
            arr[num] = input.next();
            num++;
            System.out.print("是否继续? Y/N");
        } while (input.next().equals("Y"));
        System.out.println("目前共录入" + num + "名学生");
    }
}
