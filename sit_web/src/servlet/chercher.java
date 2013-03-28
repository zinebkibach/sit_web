package servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.utilisateur;

import dao.DAOFactory;
import dao.UtilisateurDao;

/**
 * Servlet implementation class chercher
 */
public class chercher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private UtilisateurDao     clientDao;
    public chercher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	utilisateur user ;
	DAOFactory fac= DAOFactory.getInstance();
	this.clientDao=fac.getUtilisateurDao();
	
	user = this.clientDao.trouver("zineb@hotmail.com");
	System.out.println(user.toString());
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
