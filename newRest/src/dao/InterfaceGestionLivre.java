package dao;

import java.util.List;

import model.Livre;

public interface InterfaceGestionLivre {
	public Livre getLivreByNumero(int numero);
	public List<Livre> getAllLivre();
	public void ajouterLivre(int numero,String description,float quantite);
	public void modifierLivre(int numero,String description,float quantite);
	public void supprimerLivre(int numero);
	
}
