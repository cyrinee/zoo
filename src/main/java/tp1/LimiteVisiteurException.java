package tp1;

public class LimiteVisiteurException extends Exception {
	
	String message="";
	
	



	 LimiteVisiteurException() {
		
		System.out.println("erreur, vous avez depassé le nombre maximale de visiteurs par zoo ");
	}
	
	

}
