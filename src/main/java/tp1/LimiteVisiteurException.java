package tp1;

public class LimiteVisiteurException extends Exception {
	
	String message="";
	
	



	 LimiteVisiteurException() {
		
		System.out.println("erreur, vous avez depass� le nombre maximale de visiteurs par zoo ");
	}
	
	

}
