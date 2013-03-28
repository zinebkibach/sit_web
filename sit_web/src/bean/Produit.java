package bean;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")

public class Produit implements Serializable{
	
private  int  ID_produit;
private  String nom_prod;
private  int prix_prod;
private  String couleur_prod;
private  String quantite_prod;



public int getID_produit() {
	return ID_produit;
}



public void setID_produit(int iD_produit) {
	ID_produit = iD_produit;
}



public String getNom_prod() {
	return nom_prod;
}



public void setNom_prod(String nom_prod) {
	this.nom_prod = nom_prod;
}



public int getPrix_prod() {
	return prix_prod;
}



public void setPrix_prod(int prix_prod) {
	this.prix_prod = prix_prod;
}



public String getCouleur_prod() {
	return couleur_prod;
}



public void setCouleur_prod(String couleur_prod) {
	this.couleur_prod = couleur_prod;
}



public String getQuantite_prod() {
	return quantite_prod;
}



public void setQuantite_prod(String quantite_prod) {
	this.quantite_prod = quantite_prod;
}



}
