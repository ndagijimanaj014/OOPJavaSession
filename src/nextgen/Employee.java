package nextgen;

public class Employee {
	String name;
	int age;
	double salary;
	double totalsalary;

	public static void main(String[] args) {
		//Create three Employee objects and initialize their properties with different values.
		//Print the details of each employee and the total salary of all employees.
		//Give a raise to one employee by increasing their salary, and update the total salary accordingly.
		//Create another Employee object with a different salary and update the total salary of all employees..
		Employee emp1=new Employee ();
		emp1.name="Olivier";
		emp1.age=30;
		emp1.salary=135000;
		System.out.println(emp1.name+" "+emp1.age+" "+emp1.salary);
		Employee emp2=new Employee ();
		emp2.name="John";
		emp2.age=15;
		emp2.salary=120000;
		System.out.println(emp2.name+" "+emp2.age+" "+emp2.salary);
		Employee emp3=new Employee ();
		emp3.name="peter";
		emp3.age=40;
		emp3.salary=100000;
		
		System.out.println(emp3.name+" "+emp3.age+" "+emp3.salary);
		emp3.salary=110000;
		System.out.println(emp3.salary);
		Employee emp4=new Employee();
		emp4.name="Mary";
		emp4.age=25;
		emp4.salary=95000;
		System.out.println(emp4.name+" "+emp4.age+" "+emp4.salary);
		
		

	}

}
