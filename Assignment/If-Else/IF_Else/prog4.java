

class Demo {

	public static void main(String[]args) {

		double perc = 90.00;

		if(perc>85.00) {

			System.out.println("Medical");
		}
		else if(perc<=85.00 && perc>75.00) {

			System.out.println("Engineering");
		}
		else if(perc<+75.00 && perc>=65.00) {

			System.out.println("pharmacy or bachelor in science");
		}
		else {
			System.out.println("Arts / Commerce");
		}
	}
}

