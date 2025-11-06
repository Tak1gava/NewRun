package www.s4owy.cn.method;

import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {
        getResult();

    }
    public static void getResult(){
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int b = input.nextInt();
        System.out.println(i+b);
    }
}
