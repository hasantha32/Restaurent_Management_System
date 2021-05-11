package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

	/**
	 *
	 * @author Mahendra
	 */
	public class DBC {
	    Connection conn = null;
	    
	    public static Connection food_connection(){
	        
	        try{
	        	Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	            return conn;
	        }catch(Exception e){
	            JOptionPane.showMessageDialog(null, e);
	            return null;
	        }
	        
	    }
	}


