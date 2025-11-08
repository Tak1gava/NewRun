package www.s4owy.cn.method;

import java.util.Random;

/*
* ## 题目11（很难）

一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
* 打印效果如下：（随机顺序，不一定是下面的顺序）

```
888元的奖金被抽出
588元的奖金被抽出
10000元的奖金被抽出
1000元的奖金被抽出
2元的奖金被抽出
```*/
public class methodRandom {
    public static void main(String[] args) {
        int[] gift = new int[]{2,588,888,1000,10000};


    }
    public static void extract(int[] arr){
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(ran.nextInt(1));
        }
    }
}
