// A person is storing date,month and year in variables (write a code to print the date month, and year and also print the total seconds in a day, month and year.

class Demo {

	public static void main(String[]args) {

		int date = 23;
		int month = 6;
		int year = 2024;

		int secInDay = 24*60*60; // 1min = 60sec / 1hour = 60min/ 1day = 24 hour

		int secInMonth = secInDay*30;

		int secInYear = secInMonth*365;


		System.out.println("date:"+date+" seconds in day:"+secInDay);
		System.out.println("month:"+month+" seconds in month:"+secInMonth);
		System.out.println("year:"+year+" seconds in year:"+secInYear);
	}
}
