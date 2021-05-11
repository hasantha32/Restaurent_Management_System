package Reservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;

public class dbconnector {
	//private static String url="jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","";
	//private  static String  username="madu";
	//private static String password="madu";
	private static Connection con;
	private static boolean isSuccess;
	private static Statement stmt= null;
	private static ResultSet rs= null;
	
	public static Connection getconnection() {
		
		 try{
	        	Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
	            return conn;
	        }catch(Exception e){
	            JOptionPane.showMessageDialog(null, e);
	            return null;
	        }
	
		
		
	}
	
	public String reserveName(String resName) {
		String name;
		switch (resName) {
		  case "Hall Araliya":
		    name = "hall_araliya";
		    break;
		  case "Hall Gardiniya":
			name = "hall_gardiniya";
		    break;
		  case "Hall Rose":
			name = "hall_rose";
		    break;
		  case "Hall Lily":
			name = "hall_lily";
		    break;
		  case "Pool":
			name = "pool";
		    break;
		  default:
			name = "";
		}
		return name;
	}
	
	
	public boolean createbooking(String name, String address, String reservationName, String checkIn, String checkOut, double total) {
		
		try {
			con= getconnection();
			stmt= con.createStatement();
			String sql="insert into reservation (CusName,Address,reservationName,CheckIN,CheckOut,Total) values ('"+name+"','"+address+"','"+reservationName+"','"+checkIn+"','"+checkOut+"',"+total+")";
			int rs= stmt.executeUpdate(sql);
			 
			 
			 if(rs>0) {
				 isSuccess=true;
			 }
			 
			 else {
				 isSuccess=false;
			 }
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	
	public boolean updateBooking(String name, String address, String reservationName, String checkIn, String checkOut, double total, String bookedCheckIn) {
		
		try {
			con= getconnection();
			stmt= con.createStatement();
			String sql="UPDATE reservation SET CusName = '"+name+"', Address = '"+address+"', CheckIN = '"+checkIn+"', CheckOut = '"+checkOut+"', Total = "+total+" WHERE reservationName = '"+reservationName+"' AND CheckIN = '"+bookedCheckIn+"' ";
			int rs= stmt.executeUpdate(sql);
			 
			 
			 if(rs>0) {
				 isSuccess=true;
			 }
			 
			 else {
				 isSuccess=false;
			 }
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	
	
	public boolean deletebooking(String resName, String checkIn) {
		
		try {
			 
			con= getconnection();
			stmt= con.createStatement();
			String sql ="delete from reservation where reservationName='"+resName+"' AND CheckIN='"+checkIn+"'";
			int r=stmt.executeUpdate(sql);
			
			
			if(r>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	
	public double getUnitPrice(String item) {
		
		try {
			con= getconnection();
			stmt= con.createStatement();
			String name = reserveName(item);
			String sql="SELECT rate FROM rates WHERE name='"+name+"'";
			ResultSet rs= stmt.executeQuery(sql);
			double rate = 0;
			while (rs.next()) {
				rate = rs.getDouble("rate");
			}
			
			con.close();
			stmt.close();
			
			return rate;
		}
		
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public ArrayList<Date[]> getBookedDates(String resName){
		ArrayList<Date[]> checkInDates = new ArrayList<>();
	    try {
	    	con= getconnection();
			stmt= con.createStatement();
	        ResultSet result = stmt.executeQuery("SELECT CheckIN, CheckOut FROM reservation WHERE reservationName='"+resName+"'");

	        while(result.next()) {
	        	Date existingBooking[] = new Date[2];
	        	existingBooking[0] = result.getDate("CheckIN");
	        	existingBooking[1] = result.getDate("CheckOut");
	        	checkInDates.add(existingBooking);
	        }
	        
	        con.close();
		    stmt.close();
	    }
	    catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	    
	    return checkInDates;
	}
	

		
}



	
		
	


	
	
	
	


	


