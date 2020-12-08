package dao;

import java.util.ArrayList;
import java.util.List;

import model.Livre;

public class GestionLivreImp implements InterfaceGestionLivre {
	List<Livre> lv ;
	
	public GestionLivreImp() {
		super();
		this.lv =new ArrayList<Livre>();
		this.lv.add(new Livre(1, "test", 4));
	}

	@Override
	public Livre getLivreByNumero(int numero) {
		// TODO Auto-generated method stub
		Livre l = new Livre();
		for(int i=0;i<lv.size();i++) {
			if(lv.get(i).getNumero()==numero) {
				l=lv.get(i);
			}
		}
		return l;
	}

	@Override
	public List<Livre> getAllLivre() {
		// TODO Auto-generated method stub
		return lv;
	}

	@Override
	public void ajouterLivre(int numero,String description,float quantite) {
		// TODO Auto-generated method stub
		Livre l = new Livre();
		l=getLivreByNumero(numero);
		lv.add(l);
	}

	@Override
	public void modifierLivre(int numero,String description ,float quantite) {
		// TODO Auto-generated method stub
		Livre l = new Livre();
		l=getLivreByNumero(numero);
		l.setDescription(description);
		l.setQuantite(quantite);
		
	}

	@Override
	public void supprimerLivre(int numero) {
		// TODO Auto-generated method stub
		Livre l = new Livre();
		l=getLivreByNumero(numero);
		lv.remove(l);
		
	}

}
