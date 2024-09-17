

class Demo {

	public static void main(String[]args) {

		int num = 5;
		int num1 = 10;

		for(int i=1;i<=num;i++) {

			for(int j=1;j<=i;j++) {

				System.out.print(num1--+" ");

			}
			num1++;

			System.out.println();
		}
	}
}

