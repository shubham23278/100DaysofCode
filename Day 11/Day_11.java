import java.util.*;

public class Day_11 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int space = 0, star = n;
        for(int k = 0; k < n ; k++){
            for(int i = 0; i < space; i++){
                System.out.print("\t");
    
            }
            for(int j = 0; j < star; j++){
                System.out.print("*\t");
            }
            space++;
            star--;
            System.out.println();
        }
        }
        
}