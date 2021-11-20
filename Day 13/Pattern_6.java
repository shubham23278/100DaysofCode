import java.util.*;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = (n / 2) + 1;
        int space = 1;

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= star; k++) { 
                System.out.print("*\t");
             }

            for (int j = 1; j <= space; j++) { 
                System.out.print("\t");
            }

            for (int k = 1; k <= star; k++) { 
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                space += 2;
                star--;
            } else {
                space -= 2;
                star++;
            }
            System.out.println();
        }
    }
}
