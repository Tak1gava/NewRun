package www.s4owy.cn.method;




//定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。

import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {
        ifSmall();
    }
    public static void ifSmall(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a>b){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }
}
