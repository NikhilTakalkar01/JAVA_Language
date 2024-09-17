
import java.io.*;
import java.util.*;

class Demo {

	public static void main(String[]args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("* What's Your Interest? ");
		System.out.println("- 1 Movies");
		System.out.println("- 2 Series");

		System.out.println("- Enter your choice 1 or 2");
		int choice;
		choice = Integer.parseInt(br.readLine());
		switch(choice) {

			case 1:{
			int wish;

			System.out.println("- You choice Movies");
			System.out.println("Movies you Wish to watch today");
			System.out.println("1. Maharaja");
			System.out.println("2. Kalki 2898 AD");
			System.out.println("3. Deadpool 3");
			System.out.println("4. Shree 2");
			System.out.println("5. Weapon");
			System.out.println("6. Bastar");
			wish = Integer.parseInt(br.readLine());

			switch(wish) {
				case 1:
					System.out.println("You Wished To watch Maharaja");
					break;
				case 2:
					System.out.println("You Wished To watch Kalki 2898 AD");
					break;
				case 3:
					System.out.println("You Wished To watch Deadpool 3");
					break;
				case 4:
					System.out.println("You Wished To watch Shree 2");
					break;
				case 5:
					System.out.println("You Wished To watch Weapon");
					break;
				case 6:
					System.out.println("You Wished To watch Bastar");
					break;

				default:
					System.out.println("Invalid choice");
			}
		}
		break;

		case 2:{
			       int wish;
			       System.out.println("Best series to watch");
			       System.out.println("1. Mirjapur");
			       System.out.println("2. The Boys");
			       System.out.println("3. Breaking Bad");
			       System.out.println("4. Money Heist");
			       System.out.println("Enter your choice");
			       wish = Integer.parseInt(br.readLine());

			       switch(wish) {

				       case 1:
					       System.out.println("You wished to watch Mirjapur");
					       break;

				       case 2:
					       System.out.println("You wished to watch The Boys");
					       break;

				       case 3:
					       System.out.println("You wished to watch Breaking Bad");
					       break;

				       case 4:
					       System.out.println("You wished to watch Money Heist");
					       break;

				       default:
					       System.out.println("Invalid choice try again");
			       }
		}
		break;
		default:
			System.out.println("Invalid Choice try again");
		}
	}
}














