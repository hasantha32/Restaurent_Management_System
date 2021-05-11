package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
	
	public static Connection connect()
    {
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useTimezone=true&serverTimezone=UTC","root","");
            System.out.println("Connected");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            
         
        return conn;
    }
	
//	public static void main(String[] args) {
//	
//		new DBconnect().connect();
//		
//	} cvxv

}

