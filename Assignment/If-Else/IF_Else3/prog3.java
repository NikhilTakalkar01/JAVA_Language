

class Demo {

	public static void main(String[]args) {

		int num = 13;

		if(num%2==0&&num>10) {
			System.out.println(num+" Number is Even & Greater than 10");
		} else if(num%2==0&&num<10) {
			System.out.println(num+" Number is Even & Less than 10");
		} else if(num%2==0&&num==10){
			System.out.println(num+" Number is Even & equal to 10");
		}
	       	else if(num%2==1&&num>10) {
			System.out.println(num+" Number is Odd & greater than 10");
		} else {
			System.out.println(num+" Number is Odd & less than 10");
		}

	}
}

