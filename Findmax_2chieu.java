package Lession2;
import java.util.Scanner;

public class Findmax_2chieu {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //Chỉ số của mảng
        int n = 3;
        int i;
        int j;
        int [][] array = new int[n][n];
        int num;

        //Nhap mang
        for(i = 0;i<n;i++) {
            for (j = 0; j < n; j++) {
                System.out.println("a[" + i+"][" + j+"] =");
                num = scanner.nextInt();
                array[i][j] = num;
            }
        }
        //Tim gia tri max cua
        int max = array[0][0];
        for(i = 0; i< n;i++) {
            for (j = 0; j < n; j++) {
                if( max <array[i][j])
                    max =array[i][j];
            }
        }
        //In ra gia tri max
        System.out.println("Max = "+max);
        /*/In mang
        for(i = 0; i< n;i++) {
            for (j = 0; j < n; j++) {
                System.out.println("a[" + i+"][" + j+"] ="+ array[i][j]);
            }
        }*/
    }
}
