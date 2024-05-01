import java.util.Scanner;

public class Baekjoon2588 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1=0,n2=0,result=0,i=0;

        n1=sc.nextInt();//첫번째 수는 int형으로
        String string_n2=sc.next();//두번째수는 문자열로 받음

        int n2Len=string_n2.length();//for문의 반복횟수를 위한 n2의 길이

        for(i=n2Len-1;0<=i;i--) {//두번째 수의 길이만큼 반복
            n2 = Integer.parseInt(String.valueOf(string_n2.charAt(i)));//뒤에서부터 문자를 int형변환한다
            result=n1*n2;//형변환한 문자를 첫번째 수(n1)과 계산
            System.out.println(result);
        }
        n2=Integer.parseInt(String.valueOf(string_n2));//n1와n2를 곱하기위해 문자열을 int형변환
        System.out.println(n1*n2);
    }
}