package Forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import bean.utilisateur;
import dao.DAOException;
import dao.DAOFactory;
import dao.UtilisateurDao;
import Forms.FormValidationException;
import Forms.InscriptionForm;

public final class trouverForm {
    private static final String CHAMP_EMAIL      = "email";
    private static final String CHAMP_PASS       = "motdepasse";
    private static final String CHAMP_CONF       = "confirmation";
    private static final String CHAMP_NOM        = "nom";
    private static final String CHAMP_login      = "login";

    private static final String ALGO_CHIFFREMENT = "SHA-256";

    private String              resultat;
    private Map<String, String> erreurs          = new HashMap<String, String>();
    private UtilisateurDao      clientDao;

    public trouverForm( UtilisateurDao clientDao ) {
        this.clientDao = clientDao;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public String getResultat() {
        return resultat;
    }

    public utilisateur trouverClient( HttpServletRequest request ) {
        String email = getValeurChamp( request, CHAMP_EMAIL );
        String motDePasse = getValeurChamp( request, CHAMP_PASS );
        String confirmation = getValeurChamp( request, CHAMP_CONF );
        String nom = getValeurChamp( request, CHAMP_NOM );
        String login = getValeurChamp( request, CHAMP_login );

        utilisateur client = new utilisateur();
        client.getNom();
        client.getEmail();
        client.getMotDePasse();
        try {
/*            traiterEmail( email, client );
            traiterMotsDePasse( motDePasse, confirmation, client );
            traiterNom( nom, client );*/

            //if ( erreurs.isEmpty() ) {
                clientDao.trouver( email );
                resultat = "Succ�s de trouver.";
            /*} else {
                resultat = "echec de trouver.";
            }*/
        } catch ( DAOException e ) {
            resultat = "echec de trouver : une erreur  est survenue, merci de r�essayer dans quelques instants.";
            e.printStackTrace();
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return client;
    }



    /*
     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     */
    private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur;
        }
    }
	


}
