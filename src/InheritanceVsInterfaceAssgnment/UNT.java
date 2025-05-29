package InheritanceVsInterfaceAssgnment;

public class UNT extends UsUniversity implements Uscampus,UkCampus,CanadaCampus {
	public void Itschool() {
		System.out.println("UNT Itschool");
	}
	public void Informationschool() {
		System.out.println("UNT Informationschool");
	}
	@Override
	public void nursingschool() {
		System.out.println("UNT nursingschool");
		
	}

	@Override
	public void economicschool() {
		System.out.println("UNT nursingschool");
		
	}

	@Override
	public void managementschool() {
		System.out.println("UNT managementschool");
		
	}

	@Override
	public void mechanicalschool() {
		System.out.println("UNT mechanicalschool");
		
	}
	@Override
	public void medecineschool() {
		System.out.println("UNT medecineschool");
		
	}


	@Override
	public void electricalschool() {
		System.out.println("UNT electricalschool");
		
	}
	public static void pharmacyschool() {
		System.out.println("UNT pharmacyschool");
	}
	public void biologyschool() {
		System.out.println("Uscampus biologyschool");
	}
	@Override
	public void Historyschool() {
		System.out.println("Us Historyschool");
		}



}
