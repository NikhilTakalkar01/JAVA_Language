

class Demo {

	public static void main(String[]args) {

		int num = 2332;
		int temp = num;
		int rev = 0;

		while(num!=0) {

		int rem = num%10;
		rev = rev*10+rem;
		num = num/10;
		}
		if(temp==rev){
			System.out.println("Palindrom");
		} else {
			System.out.println("Not palindrom");
		}
	}
}


