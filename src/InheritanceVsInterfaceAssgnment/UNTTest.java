package InheritanceVsInterfaceAssgnment;

public class UNTTest  {

	public static void main(String[] args) {
		UNT unt = new UNT();
		unt.Itschool();
		unt.Informationschool();
		unt.managementschool();
		unt.pharmacyschool();
		unt.biologyschool();
		unt.Historyschool();
		//TOPCASTING:child class referred by parent interface referrence variable.
		Uscampus us = new UNT();
		us.biologyschool();
		us.medecineschool();
		us.nursingschool();
		
		
		

	}

	
	

}
