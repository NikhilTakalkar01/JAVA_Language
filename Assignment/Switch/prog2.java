import java.util.*;

class Demo {

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number From 0 to 5:");

		int num;
		num = sc.nextInt();

		if(num>5) {
			System.out.println("You Enter Large Number:");
		}
		else if(num<0){
			System.out.println("You Enter Negative Number:");
		} 
		else {

			switch(num) {

				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
			}
		}
	}
}






				

