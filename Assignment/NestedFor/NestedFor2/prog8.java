

class Demo {

	public static void main(String[]args) {


		char a = 'A';
		char b = 'a';

		for(int i=1;i<=5;i++) {

			for(int j=1;j<=5;j++) {

				if(a%2==1) {

					System.out.print(a+" ");
				} else {
					System.out.print(b+" ");
				}
				a++;
				b++;
			}
			System.out.println();
		}
	}
}

