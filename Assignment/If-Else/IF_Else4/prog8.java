

class Demo {

	public static void main(String[]args) {

		int sellPrice = 1500;
		int costPrice = 1200;
		int profit = sellPrice - costPrice;
		if(sellPrice > costPrice) {

			System.out.println("Profit "+ profit);
		}
		else {
			System.out.println("loss");
		}
	}
}

