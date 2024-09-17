

class Demo {

	public static void main(String[]args) {

		int num = 215246732;

		int count = 0;

		while(num!=0) {

			int num2=num%10;
			if(num%2==0) {
				count++;
			} num=num/10;
		}
		System.out.println(count);
	}
}

