package nextgen;

public class ClassAndObjectAssgnment1 {
	String name;
	int age;
	double point;

	public static void main(String[] args) {
		// Create two Student objects and initialize their properties.

        //Print the details of each student and the total number of students.

         //Modify the age of one student and print the updated details.

          //Create another Student object and update the total number of students.

          //Print the details of the new student and the updated total number of students.
		ClassAndObjectAssgnment1 stud=new ClassAndObjectAssgnment1();
		stud.name ="peter";
		stud.age =25;
		stud.point=60.5;
		ClassAndObjectAssgnment1 stud1=new ClassAndObjectAssgnment1();
		stud1.name ="Alex";
		stud1.age = 20;
		stud1.point=70.4;
		System.out.println(stud.name+" "+stud.age+" "+stud.point+" ");
		System.out.println(stud1.name+" "+stud1.age+" "+stud1.point+" ");
		ClassAndObjectAssgnment1 stud2=new ClassAndObjectAssgnment1();
		
		

	}

}
