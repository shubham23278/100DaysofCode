import java.util.*;
  
  public class Main{
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();

     System.out.println(anybasetobase(n, sourceBase, destBase));
   }
  
  public static int anybasetobase(int n, int b1, int b2){

    int dec = todecimal(n, b1);
    int value = anybase(dec , b2);
    
    return value;
  }

  public static int todecimal(int n, int b){
    
    int decimal = 0, power = 1;

    while(n > 0){
      int digit = n % 10;
      n /= 10;
      decimal += (digit * power);
      power *= b;
    }

    return decimal;
  }


  public static int anybase(int decimal, int b){

    int new_value = 0;
    int power = 1;

    while(decimal > 0){
      int digit = decimal % b;
      decimal /= b;
      new_value += digit * power;
      power *= 10;

    }
    return new_value;
  }
  }