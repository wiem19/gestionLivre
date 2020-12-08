package model;

public class Livre {
	
	
	private int numero ;
	private String description ;
	private float quantite ;
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Livre(int numero, String description, float quantite) {
		super();
		this.numero = numero;
		this.description = description;
		this.quantite = quantite;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getQuantite() {
		return quantite;
	}
	public void setQuantite(float quantite) {
		this.quantite = quantite;
	}
	@Override
	public String toString() {
		return "Livre [numero=" + numero + ", description=" + description + ", quantite=" + quantite + "]";
	}
	
	
	

}
