import java.util.Scanner;
import java.lang.Math;  
  public class Day_8{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){

    int new_value = 0;
    int power = 0;

    while(n > 0){
        int digit = n % 10;
        new_value += digit * Math.pow(b , power);
        power++; 
        n /= 10;
    }
    return new_value;
   }
  }
