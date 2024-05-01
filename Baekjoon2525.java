import java.util.Scanner;

public class Baekjoon2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour=sc.nextInt(); //시작시간
        int min=sc.nextInt(); //시작 분
        int rate=sc.nextInt(); //빵 굽는시간

        int total_min=(hour*60)+min+rate; //빵굽는 총시간을 분으로 만듬

        System.out.println((total_min/60)%24+" "+total_min%60);
    }
}
