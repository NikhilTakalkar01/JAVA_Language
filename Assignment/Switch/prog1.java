
import java.io.*;

class Demo {

	public static void main(String[]args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				System.out.println("          Student Result:");
				System.out.println("----------------XOX----------------");
				System.out.println();
				System.out.println(" *  Enter Following Subjects Marks:");
				System.out.println();
				
				int ScienceMarks;
				System.out.println("    - Enter Science Marks:");
				ScienceMarks = Integer.parseInt(br.readLine());
				System.out.println();

				int MathsMarks;
				System.out.println("    - Enter Maths Marks:");
				MathsMarks = Integer.parseInt(br.readLine());
				System.out.println();

				int ChemistryMarks;
				System.out.println("    - Enter Chemistry Marks:");
				ChemistryMarks = Integer.parseInt(br.readLine());
				System.out.println();

				int EnglishMarks;
				System.out.println("    - Enter English Marks:");
				EnglishMarks = Integer.parseInt(br.readLine());
				System.out.println();

				int MarathiMarks;
				System.out.println("    - Enter Marathi Marks:");
				MarathiMarks = Integer.parseInt(br.readLine());
				System.out.println();

				if(ScienceMarks<35 || MathsMarks<35 || ChemistryMarks<35 || EnglishMarks<35 || MarathiMarks<35) {
					System.out.println("  - You'r Failed:");
				}
				else {
					double avg = (ScienceMarks+MathsMarks+ChemistryMarks+EnglishMarks+MarathiMarks)/5;

					char ch;

					if(avg>75){
						ch='A';
					} else if(avg>60) {
						ch='B';
					} else if(avg>50) {
						ch='C';
					} else if(avg>40) {
						ch='D';
					} else if(avg>=35){
						ch='E';
					} else {
						ch='F';
					}

					switch (ch) {

						case 'A':

							System.out.println("    - First Class with Distinction:");
							break;
						case 'B':
							System.out.println("    - First Class:");
							break;

						case 'C':
							System.out.println("    - Second Class:");
							break;

						case 'D':
							System.out.println("    - Third Class:");
							break;

						case 'E':
							System.out.println("    - Pass:");
							break;

						case 'F':
							System.out.println("    - Fail:");
							break;
					}

					System.out.println("    = "+avg);
				}
	}
}







	
	




