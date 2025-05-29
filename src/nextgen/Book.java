package nextgen;

public class Book {
	String title;
	String Author;
	int pagecount;
	int totalbooks;

	public static void main(String[] args) {
		//Create three Book objects and initialize their properties with different values.
		//Print the details of each book and the total number of books.
		//Modify the pageCount attribute of one book and print the updated details.
		//Create another Book object and update the total number of books.
		Book b1 =new Book();
		b1.title="lovestory";
		b1.Author="John m";
		b1.pagecount=500;
		b1.totalbooks=10;
		b1.totalbooks=15;
		System.out.println(b1.title+" "+b1.Author+" "+b1.pagecount+" "+b1.totalbooks);
		
		Book b2 =new Book();
		b2.title="Beginner";
		b2.Author="Peter jamson";
		b2.pagecount=1000;
		b2.totalbooks=20;
		System.out.println(b2.title+" "+b2.Author+" "+b2.pagecount+" "+b2.totalbooks);
		
		Book b3 =new Book();
		b3.title="NaturalRessources";
		b3.Author="Maddison K";
		b3.pagecount=400;
		b3.totalbooks=35;
		System.out.println(b3.title+" "+b3.Author+" "+b3.pagecount+" "+b3.totalbooks);
		
		Book b4 =new Book();
		b4.totalbooks=60;
		
		System.out.println(b4.totalbooks);
		b4.title="Humanities";
		b4.Author="Nelson G";
		b4.pagecount=350;
		b4.totalbooks=70;
		System.out.println(b4.title+" "+b4.Author+" "+b4.pagecount+" "+b4.totalbooks);
		
		
		
		
		

	}

}
