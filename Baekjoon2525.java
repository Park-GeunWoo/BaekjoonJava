import java.util.Scanner;

public class Baekjoon2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour=sc.nextInt();
        int min=sc.nextInt();
        int rate=sc.nextInt();

        min+=(rate%60);
        hour+=(rate/60);

        System.out.println((min/60+hour)%24+" "+min%60);
    }
}
