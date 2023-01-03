
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        int num;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        int ans = fact(num);
        System.out.println(num + "! = " + ans);
    }

    static int fact(int x) {
        if (x == 1) {
            return 1;
        }
        return x * fact(x - 1);
    }
}
