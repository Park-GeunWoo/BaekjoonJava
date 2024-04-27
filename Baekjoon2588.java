import java.util.Scanner;

public class Baekjoon2588 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=0,n2=0,result=0,i=0;

        n1=sc.nextInt();
        String string_n2=sc.next();

        int n2Len=string_n2.length();

        for(i=n2Len-1;0<=i;i--) {
            n2 = Integer.parseInt(String.valueOf(string_n2.charAt(i)));
            result=n1*n2;
            System.out.println(result);
        }
        n2=Integer.parseInt(String.valueOf(string_n2));
        System.out.println(n1*n2);
    }
}