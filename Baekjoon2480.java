import java.util.Scanner;

public class Baekjoon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int result;
        if (n1==n2 && n1==n3) {
            result = 10000+n1*1000;
        }
        else if (n1==n2 || n1==n3) {
            result=1000+n1*100;
        }
        else if (n2==n3) {
            result=1000+n2*100;
        }
        else {
            result=Math.max(n1,Math.max(n2,n3))*100;
        }
        System.out.println(result);
    }
}
