package nextgen;

public class LoopRunyourTestOnSpecificEnvironmentQaDevStageAssessmnents {

	public static void main(String[] args) {
		//1.i am batman(5).
		//3.10to1
		//Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		//Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		//WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		//WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod
		System.out.println("the specific environment is:");
		String testcases="Dev";
		switch(testcases) {
		case"QA":
			System.out.println("QA");
			break;
		case"Stage":
			System.out.println("Stage");
			break;
		case"Dev":
			System.out.println("Dev");
			break;
		case"UAT":
			System.out.println("UAT");
			break;
		case"Prod":
			System.out.println("Prod");
			break;
			default:
				System.out.println("invalid");
				break;
		}
		}
		}


	
	


