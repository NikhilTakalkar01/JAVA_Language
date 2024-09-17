
class Demo {

	public static void main(String[]args) {

		int sum = 0;
		int i = 1;
		int mult = 1;

		while(i<=10) {

			if(i%2==0) {
				sum = sum + i;
			} else {
				mult = mult + i;
			}
			i++;
		}

		System.out.println(sum);
		System.out.println(mult);
	}
}

