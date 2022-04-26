package AminusB;
import java.util.Scanner;
public class AminusB {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        System.out.println(A-B);

        in.close();  //필수 사항은 아니지만 닫는걸 꼭 적극 권장한다.  ex 리소스 누수...
    }
}
