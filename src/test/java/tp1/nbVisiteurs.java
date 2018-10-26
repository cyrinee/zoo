package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class nbVisiteurs {

	@Test
	public void test() throws LimiteVisiteurException {

		zoo zoo1=new zoo(9);
		for(int i=0;i<6;i++)
		{
			zoo1.nouveauVisiteur();}

		try {
			zoo1.nouveauVisiteur();
			fail("exception non envoyée");


		}
		catch(LimiteVisiteurException e) {
			
			
		}




	}

}
