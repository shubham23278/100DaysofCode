import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int space = n-1, star = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=space; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("* ");
            }
            space--;
            star++;
            System.out.println();
        }
}
}