package tp1;

import java.util.ArrayList;



public class zoo {
	int nbvisiteurs;
	ArrayList<Secteur> msecteursAnimaux=new ArrayList <Secteur>();



public zoo() {
	
}
	public zoo(int nbvisiteurs,ArrayList<Secteur> msecteursAnimaux ) {
		// TODO Auto-generated constructor stub
		this.nbvisiteurs=nbvisiteurs;
		this.msecteursAnimaux=msecteursAnimaux;
	}
	public zoo(int nbvisiteurs  ) {
		// TODO Auto-generated constructor stub
		this.nbvisiteurs=nbvisiteurs;
	}
	
	public void nouveauVisiteur() throws LimiteVisiteurException {
		nbvisiteurs++;
		if (nbvisiteurs >getLimiteVisiteur()) {
		      throw new LimiteVisiteurException();

		}
		
		
		
	}
	public void nouveausecteur(Secteur sec) {
		msecteursAnimaux.add(sec);
	}
	public void nouveauanimal(Animal a) throws AnimalDansMauvaisSecteurException  {
		for(int i=0;i<msecteursAnimaux.size();i++) {
			
		
		if(a.getTypeAnimal()==msecteursAnimaux.get(i).typeAnimauxDansSecteur)
			
		msecteursAnimaux.get(i).ajouteranimal(a);
		 throw new AnimalDansMauvaisSecteurException();

	}}
	public  int getLimiteVisiteur() {
		return msecteursAnimaux.size()*15;
		
		
	}
	

}
