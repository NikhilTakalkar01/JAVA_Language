

class Demo {

	public static void main(String[]args) {

		int num = 7;

		while(num>=1) {

			if(num%2==0){
				System.out.println(num);
				num--;
			} else{
				System.out.println(num);
				num = num-2;
			}
		}
	}
}

