package www.s4owy.cn.d05;

public class revense {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5};
        int[] brr = new int[5];
        int j = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            brr[i]= arr[j];
            j--;
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }
}
