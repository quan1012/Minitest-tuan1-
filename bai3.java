import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
       int n,i;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng :");
        n = scanner.nextInt();
        int arr[] = new int[n];
        for (i = 0;i<n;i++){
            System.out.println("Nhập phần tử thứ " + i + ":");
            arr[i]= scanner.nextInt();
        }
        System.out.println("Mảng được tạo là : " );
        for (i=0; i<n; i++){
            System.out.print(arr[i]);
        }
    }
}
