package heritage;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;
@SuppressWarnings("unused")

interface Animal
{
	// Setter pour le champ nom
	public void setNom(String nom);

	// Getter pour le champ nom
	public String getNom();

	// Retourne le cri de l'animal
	public String cri();
}

public class ExempleAnimaux
{
	public static void main(String[] args)
	{
		ArrayList<Animal> animaux = new ArrayList<>();
		animaux.add(new Chat("Ronron"));
		animaux.add(new Chien("Médor"));
		animaux.add(new Vache("Huguette"));
		for (Animal animal : animaux)
			System.out.println("Je m'appelle " + animal.getNom()
				+ " et je dis " + animal.cri() + "!");
	}
}

class Chat implements Animal
{
	private String name;

	Chat(String name){
		this.name = name;
	}
	public void setNom(String nom){
			this.name = nom;
	}
	public String getNom(){
		return(this.name);
	}
	public String cri(){
		return("Miaou");
	}
}

class Chien implements Animal
{
	private String name;
	
	Chien(String name){
		this.name = name;
	}
	public void setNom(String nom){
			this.name = nom;
	}
	public String getNom(){
		return(this.name);
	}
	public String cri(){
		return("WAF");
	}
}

class Vache implements Animal
{
	private String name;
	
	Vache(String name){
		this.name = name;
	}
	public void setNom(String nom){
			this.name = nom;
	}
	public String getNom(){
		return(this.name);
	}
	public String cri(){
		return("Meuuuuuuuuuuuuuuuuuh");
	}
}
