package InheritanceVsInterfaceAssgnment;

public interface Uscampus {
	
	public void medecineschool();
	public void nursingschool();
	//After JDK 1.8 release,interface can have
    //Static method with method body
    //Default method with method body.
	public static void pharmacyschool() {
		System.out.println("Uscampus pharmacyschool");
	}
	default void biologyschool() {
		System.out.println("Uscampus biologyschool");
	}

}
