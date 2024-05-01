import java.util.Scanner;

public class Baekjoon2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int result;
        if (n1==n2 && n1==n3) {//n1,n2,n3 모두 같을때
            result = 10000+n1*1000; //10000+(n1*1000)
        }
        else if (n1==n2 || n1==n3) { //n1와 n2,n3가 같을때
            result=1000+n1*100;
        }
        else if (n2==n3) { //n1과 같은 숫자가 없을떄는 n2와 n3가 같은지만 확인하면댐
            result=1000+n2*100;
        }
        else {//n2와n3 중 큰값과 n1의 값을 비교한다
            result=Math.max(n1,Math.max(n2,n3))*100;
        }
        System.out.println(result);
    }
}
