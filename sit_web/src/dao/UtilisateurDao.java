package dao;

import bean.utilisateur;

public interface UtilisateurDao {
 
    void creer( utilisateur utilisateur ) throws Exception;
    utilisateur trouver( String email ) throws DAOException;
    void update(String email) throws Exception;
	Boolean supprimer(String email) throws Exception;
    
}
