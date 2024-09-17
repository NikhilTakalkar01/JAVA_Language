
class Demo {

	public static void main(String[]args) {

		int row = 4;

		for(int i=1;i<=row;i++) {

			int temp = i;

			for(int j=1;j<=i;j++) {

				System.out.print(temp+++" ");
			}
			
				System.out.println();
		}
	}
}

