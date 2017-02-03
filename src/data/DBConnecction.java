package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DBConnecction {
	private String bd = "sakila";
	private String login = "root";
	private String password = "1234";
	private String url = "jdbc:mysql://localhost:3306/"+bd;
	
	private Connection con = null;

	public void conectar() throws Exception {
		
	      try {

	         Class.forName("com.mysql.jdbc.Driver").newInstance();
	         con = DriverManager.getConnection(url,login,password);

	         if (con != null) {
	            System.out.println("Conexión a base de datos "+url+" ... Ok");
	        	JOptionPane.showMessageDialog(null,"Conexión a base de datos "+url+" ... Ok");
	            con.close();
	         }
	      }
	      catch(SQLException ex) {
	         System.out.println("Hubo un problema al intentar conectarse con la base de datos "+url);
	    	 JOptionPane.showMessageDialog(null, "Hubo un problema al intentar conectarse con la base de datos"+url);
	      }
	      catch(ClassNotFoundException ex) {
	         System.out.println(ex);
	    	 JOptionPane.showMessageDialog(null, ex);
	      }
   }
}//fin de la clase
