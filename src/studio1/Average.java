package studio1;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    
    int sum = n1 +n2; 
    double ave = sum/2.0;
    System.out.println(" The average of " + n1 + " and " + n2 + " is " +ave);

}
}