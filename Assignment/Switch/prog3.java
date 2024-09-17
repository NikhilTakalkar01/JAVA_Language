

import java.util.*;

class Demo {

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		int num1,num2;
		
		System.out.println("Enter First Number");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		num2 = sc.nextInt();

		if(num1<0 && num2>0) {
			System.out.println("Sorry Negative Number Not Valid:");
		} else if(num1>0 && num2<0) {
			System.out.println("Sorry Negative Number Not Valid:");
		} else {
			int temp = (num1*num2)%2;
			switch (temp) {

				case 0:
					System.out.println("Multification of both: "+temp+" Even Number");
					break;

				case 1:
					System.out.println("Multification of both: "+temp+" Odd Number");
					break;
			}
		}
	}
}




