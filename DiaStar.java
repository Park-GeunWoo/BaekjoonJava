import java.util.Scanner;

public class DiaStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {//위 삼각형
            for (int j=i;j<n-1;j++) {
                System.out.print(" ");
            }
            for (int j=0;j<=i*2;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n-2;0<=i;i--) {//아래삼각형
            for (int j=i;j<n-1;j++) {
                System.out.print(" ");
            }
            for (int j=0;j<=i*2;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
