import java.util.Scanner;
class Solution {
   public static void main(String[] args) {
      
	   Scanner scan = new Scanner(System.in);
	   System.out.println("values:");
	   double a= scan.nextDouble();
	   double b= scan.nextDouble();
	   double c= scan.nextDouble();
	   Box vol = new Box( a,b,c);
	   
	   System.out.println("volume: ");
	   System.out.println(vol.volume());
	   
   }
}