package service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.GestionLivreImp;
import dao.InterfaceGestionLivre;
import model.Livre;

@Path("/rest")
public class GestionService {
	InterfaceGestionLivre dao;
	
	public GestionService() {
		super();
		this.dao = new GestionLivreImp();
	}
	@Path("/get")
	@GET
	@Produces
	public Livre getLivreById(int num) {
		return dao.getLivreByNumero(num);
	}
	@Path("/getall")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Livre> getAllLivre(){
		return dao.getAllLivre();
	}
	@Path("/add")
	@POST
	@Consumes
	public void addLivre(int numero,String description,float quantite) {
		dao.ajouterLivre(numero,description,quantite);
	}
	@Path("/update")
	@PUT
	@Consumes
	public void updateLivre(int numero,String description,float quantite) {
		dao.modifierLivre(numero, description, quantite);
	}
	@Path("/delete")
	@DELETE
	@Consumes
	public void deleteLivre(int numero) {
		dao.supprimerLivre(numero);
	}
	

}
