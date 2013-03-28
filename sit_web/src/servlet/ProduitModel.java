package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOFactory;
import dao.ProduitDAO;

import bean.Produit;

/**
 * Servlet implementation class ServletProduitModel
 */
@WebServlet("/ServletProduitModel")
public class ProduitModel extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAOFactory df;
	ProduitDAO dp;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitModel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	       ArrayList<Produit> listeProduit=new ArrayList<Produit>();
	 
	       df=DAOFactory.getInstance();
           dp=df.getProduitDAO();


	       listeProduit= dp.getAll();
	       if(listeProduit.size()==0)
	    	   System.out.println("ziiz");
	       
	            request.setAttribute("listeProduit", listeProduit);
	            
	            RequestDispatcher dis=request.getRequestDispatcher("ListeProduit.jsp");
	                            dis.forward(request, response);
	        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
	}

}
