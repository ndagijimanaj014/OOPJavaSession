package nextgen;

public class LunchBrowser {
	public boolean Browser(String browserName) {
		
	Boolean frag=true;
		
	switch (browserName) {
		case "firefox" : 
			
			System.out.println("lunch browser name is:"+browserName);
		
		break;
	case "chrome" : 
			
			System.out.println("lunch browser name is:"+browserName);
		
	break;
	case "edge" : 
		
		System.out.println("lunch browser name is:"+browserName);
		break;
	
	case "safari" : 
		
		System.out.println("lunch browser name is:"+browserName);
		break;
	
		default:
			System.out.println("lunch browser name is not correct:"+browserName);
			break;
	}
		
	return true;
		
		
			
		
	}
	


	public static void main(String[] args) {
		LunchBrowser br = new LunchBrowser();
		br.Browser("firefox");

	}

}
