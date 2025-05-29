package builderpattern;

public class EcommerceTest {

	public static void main(String[] args) {
		Ecommerce co = new Ecommerce();
		co.login("Damasiture@gmail.com","dama1234")
		    .search("iphone","15pro max","black")
		      .addtocart("iphone")
		        .adress("123","fortworth","dallas","tx","12345")
		          .payment("123456789087","123","january25,2025","75667")
		            .logout();
		System.out.println(".........................");
		co.search("tv",1000)
		    .addtocart("tv")
		     .search("shoes",300)
		       .addtocart("shoes")
		         .search("cassava",50)
		           .addtocart("cassava")
		             .payment("897654326787","456","4th july ,2024","76204")
		                .logout();
		  
		  
	}

}
