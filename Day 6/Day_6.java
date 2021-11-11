import java.util.*;
  
public class Day_6{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int dn = getValueInBase(n, b);
    System.out.println(dn);
  }

  public static int getValueInBase(int n, int b){
    int new_value = 0;
    int x = 1;
    while(n > 0){
        int digit = n % b;
        n /= b;
        new_value += digit * x;
        x *= 10;
    }
    return new_value;
}
}