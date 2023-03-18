import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Nhap vao gia tri cua n1:");
        int n1 = sc.nextInt();
        System.out.println("Nhap vao gia tri cua n2:");
        int n2 = sc.nextInt();
        int tong =  n1 + n2;
        System.out.println( n1 + " +" + n2 +"=" + tong);
        int hieu = n1 - n2;
        System.out.println(n1 + "-" + n2 +"=" + hieu);
        int thuong = n1 /n2;
        System.out.println(n1 + "/" + n2  +"=" + thuong);
        int phanDu = n1 % n2;
        System.out.println(n1 + "%" + n2  +"=" + phanDu);
        System.out.println("So sanh bang" + n1 + "va" + n2 + "la" + (n1 == n2));
        System.out.println("So sanh khong bang" + n1 + "va" + n2+ "la" + (n1 != n2));
        System.out.println("So sanh 2 so lon hon "+ n1 + "va" + n2 + "la" + (n1 >n2));
        System.out.println("So sanh lon hon bang" + n1 + "va" + n2 + "la" + (n1 >= n2));
        System.out.println("So sanh nho hon " + n1 + "va" + n2 + "la" + (n1 <n2));
        System.out.println("So sanh nho hon bang " + n1 + "va" + n2 + "la" + (n1 <= n2));
    }

}