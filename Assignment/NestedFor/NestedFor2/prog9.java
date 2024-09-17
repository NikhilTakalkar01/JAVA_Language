
class Demo {
	
	public static void main(String[]args) {


		int x = 1;
		int y = 3;

		for(int i=1;i<=3;i++) {

			int z = y;
			char a = 'C';

			for(int j=1;j<=3;j++) {

				System.out.print(x*x+""+a--+""+z+" ");
				z--;
				x++;
			}
			System.out.println();
		}
	}
}

