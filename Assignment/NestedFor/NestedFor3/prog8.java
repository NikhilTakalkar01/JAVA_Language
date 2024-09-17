

class Demo {

	public static void main(String[]args) {

		char x = 'F';

		for(int i=1;i<=6;i++) {

			char y = x;

			for(int j=1;j<=i;j++) {

				System.out.print(y+" ");
				y++;
			}
			x--;
			System.out.println();

		}
	}
}


