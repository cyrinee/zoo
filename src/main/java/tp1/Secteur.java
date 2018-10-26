package tp1;

import java.util.ArrayList;

public class Secteur {
	String typeAnimauxDansSecteur;
	ArrayList<Animal> animauxDanssecteurs=new ArrayList <Animal>();


	public Secteur(String typeAnimauxDansSecteur,ArrayList<Animal> animauxDanssecteurs) {
		this.typeAnimauxDansSecteur=typeAnimauxDansSecteur;
		this.animauxDanssecteurs=animauxDanssecteurs;
	}
	public Secteur(String typeAnimauxDansSecteur) {
		this.typeAnimauxDansSecteur=typeAnimauxDansSecteur;
	}
		// TODO Auto-generated constructor stub
	
	public void ajouteranimal(Animal animal) {
		animauxDanssecteurs.add(animal);
		
		
	}
	public int getNombreAnimaux() {
		return animauxDanssecteurs.size();
	}
		
	
	public String obtenirType() {
		return typeAnimauxDansSecteur;
	}

}
