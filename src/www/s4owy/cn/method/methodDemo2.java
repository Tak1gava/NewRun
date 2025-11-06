package www.s4owy.cn.method;

/*
*
需求：

定义一个方法equals(int[] arr1,int[] arr2).

功能：

比较两个数组是否相等（长度和内容均相等则认为两个数组是相同的）*/
public class methodDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(isEquals(arr, arr1));

    }

    public static Boolean isEquals(int[] arr1, int[] arr2) {
        boolean equals = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i] && arr1.length == arr2.length) {
                equals = true;
            } else {
                equals = false;
            }
        }
        return equals;
    }
}
