package studio1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String []args){
        boolean jus = true;
        Scanner in = new Scanner(System.in);
		int numYear = in.nextInt();
		if (numYear % 4==0 && numYear % 100 != 0) {
			System.out.println(numYear+" is a leap year : "+ jus);
		}else {
			jus = false;
			System.out.println(numYear+" is a leap year : "+ jus);
		}
    }
}
