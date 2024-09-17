
class Demo {

	public static void main (String[]args) {

		int day = 7;

		int count = 0;

		while(count<=day){
			int x = day-count;

			if(x==0){
				System.out.println(x+"Days Assignment is overdue");
			}
			 else {
				 System.out.println(x+"days Remaining");
			 }
			 count++;
		}
	}
}

