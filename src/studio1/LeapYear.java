package studio1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String []args){
        
        Scanner in = new Scanner(System.in);
		int numYear = in.nextInt();
		
            boolean isLeapYear = (numYear % 4 == 0 && (numYear % 100 != 0 || numYear % 400 == 0));
            System.out.println(numYear + " is a leap year: " + isLeapYear);
        }
}
200