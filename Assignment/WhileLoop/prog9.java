
class Demo {

	public static void main(String[]args) {

		int num = 12345678;

		int rev = 0;

		while(num!=0) {

			rev = num%10;
			System.out.print(rev);

			num = num/10;
		}
		System.out.println();
	}
}

