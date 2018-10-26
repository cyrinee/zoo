package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class secteurmauvais {

	@Test
	public void test() throws AnimalDansMauvaisSecteurException {
		zoo zoo1=new zoo(3);
		String Chien=null;
		String Chat=null;

		Secteur chiens=new Secteur(Chien);
		
		Secteur chats=new Secteur(Chat);
		zoo1.nouveausecteur(chiens);
		zoo1.nouveausecteur(chats);
		Chien c=new Chien();
		zoo1.nouveauanimal(c);
		fail("exception non envoyée");
		
		try {
			zoo1.nouveauanimal(c);
			fail("exception non envoyée");
			
		}
		catch( AnimalDansMauvaisSecteurException e) {
			
			
		}


		


	}

}
