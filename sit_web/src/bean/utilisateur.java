package bean;

import java.sql.Timestamp;
import java.util.Date;

public class utilisateur {
 
    private Long      id;
    private String    email;
    private String    motDePasse;
    private String    nom;
    private Date dateInscription;
 
    public Long getId() {
        return id;
    }
    public void setId( Long id ) {
        this.id = id;
    }
 
    public void setEmail( String email ) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
 
    public void setMotDePasse( String motDePasse ) {
        this.motDePasse = motDePasse;
    }
    public String getMotDePasse() {
        return motDePasse;
    }
 
    public void setNom( String nom ) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
 
    public Date getDateInscription() {
        return dateInscription;
    }
    public void setDateInscription( Date dateInscription ) {
        this.dateInscription = dateInscription;
    }
	@Override
	public String toString() {
		return "utilisateur [id=" + id + ", email=" + email + ", motDePasse="
				+ motDePasse + ", nom=" + nom + ", dateInscription="
				+ dateInscription + "]";
	}
}