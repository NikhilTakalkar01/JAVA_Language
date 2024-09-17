

class Demo {

	public static void main(String[]args) {

		for(int i=1;i<=6;i++) {

			int num = 6;
			char ch = 'F';

			for(int j=1;j<=6;j++) {

				if(j%2==1) {
					System.out.print(ch+" ");
				} else {
					System.out.print(num+" ");	
				}
				ch--;
				num--;
			}
			System.out.println();
		}
	}
}

				

