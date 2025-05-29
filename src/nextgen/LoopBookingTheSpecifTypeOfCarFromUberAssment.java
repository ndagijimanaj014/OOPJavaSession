package nextgen;

public class LoopBookingTheSpecifTypeOfCarFromUberAssment {

	public static void main(String[] args) {
		//6.WAP to book the specific type of car from the Uber app using Switch - Case. 

		//a,Car Type: Mini, Sedan, SUV, Premium

		//b,If user passes wrong car type, print please select the right car type
		String car1="Mini";
		String car2="sedan";
		String car3="suv";
		String car4="premium";
		String type="car3";
		switch(type){
			case "car1" :
				System.out.println("the specific type of car used for uber app is :"+car1);
				break;
			case "car2":
				System.out.println("the specific type of car used for uber app is :"+car2);
				break;
			case "car3":
				System.out.println("the specific type of car used for uber app is :"+car3);
				break;
			case "car4":
				System.out.println("the specific type of car used for uber app is :"+car4);
				break;
				default:
					System.out.println("please select the right car type");
					break;
		}
		
		
		
	}

}
