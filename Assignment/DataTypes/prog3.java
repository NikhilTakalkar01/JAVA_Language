// A scientist is working on his research and wants to find an area using pi (Write a code to print the value of pi angle of triangle). Scientist are also eager to print the highest degree of angle of circle (360).
// Solution:-
			/* pi angle of a triangle = pi (r*r)
			 *  pi = 3.14 or 22/7 */

class Demo {
	public static void main(String[]args) {
		
		int radius = 5;

		double pi = 3.14;
	       pi = pi*radius*radius;

	       int angle = 360;

	       System.out.println("angle of triangle:"+pi);
	       System.out.println("highest angle of triangle:"+angle+" degree");

	}
}


