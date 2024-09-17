

class Demo {

	public static void main (String[]args) {

		int num = 9423765;
		
		while(num!=0){
			int squire = num%10;
			if(squire%2==0){
				System.out.println(squire*squire);
			}
			num = num/10;
		}
	}
}


