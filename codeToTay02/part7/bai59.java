package codeToTay02.part7;
import java.util.Scanner;
public class bai59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0;i < 10;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i < 10;i++){
            System.out.print(a[i] + " ");
        }
    }
}
