package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DBconnect;
import models.Feedback;

public class FeedbackService {
	
	private Connection connection;
	private PreparedStatement preparedStatement;

	public void addFeedback(Feedback feedback) {
		String email = feedback.getEmail();
		String fname = feedback.getFirstname();
		String lname = feedback.getLastName();
		String msg = feedback.getMessage();
		
		String insertFeedbackQueary = "INSERT INTO `feedback`(`Email`, `FirstName`, `LastName`, `YourFeedback`) VALUES ('"+email+"', '"+fname+"','"+lname+"', '"+msg+"')";
		
		try {
			connection = new DBconnect().connect();
			preparedStatement = connection.prepareStatement(insertFeedbackQueary);
			preparedStatement.execute();
			System.out.println("Feedback inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void deleteFeedback(int id) {
		
		
		//String deleteFeedbackQueary = "DELETE FeedbackID, Email, Date, FirstName, LastName, YourFeedback FROM feedback WHERE FeedbackID = " +id;
		
		String deleteFeedbackQueary = "DELETE FROM Feedback WHERE FeedbackID = " + id;
		
		
		try {
			connection = new DBconnect().connect();
			preparedStatement = connection.prepareStatement(deleteFeedbackQueary);
			preparedStatement.execute();
			System.out.println("Feedback inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}


	
	public void addFeedbackorg(Feedback feedbackorg) {
		String email = feedbackorg.getEmail();
		String fname = feedbackorg.getFirstname();
		String lname = feedbackorg.getLastName();
		String msg = feedbackorg.getMessage();
		
		String insertFeedbackQueary = "INSERT INTO `feedbackorg`(`Emailorg`, `FirstNameorg`, `LastNameorg`, `Feedorg`) VALUES ('"+email+"', '"+fname+"','"+lname+"', '"+msg+"')";
		
		try {
			connection = new DBconnect().connect();
			preparedStatement = connection.prepareStatement(insertFeedbackQueary);
			preparedStatement.execute();
			System.out.println("Feedback inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	public void addreview(String ser,String ex,String food ) {
		
		
		String insertreviewQueary = "INSERT INTO `review`(`service`, `experience`, `food`) VALUES ('"+ser+"', '"+ex+"','"+food+"')";
		
		try {
			connection = new DBconnect().connect();
			preparedStatement = connection.prepareStatement(insertreviewQueary);
			preparedStatement.execute();
			System.out.println("review inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public ArrayList<Integer> serviceCount() {
		
		ResultSet resultSet;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.clear();
		int exe = 0, vgood = 0, good = 0, avg = 0, poor = 0;

		String serviceCountQueary = "select * from review";
		
		try {
			connection = new DBconnect().connect();
			preparedStatement = connection.prepareStatement(serviceCountQueary);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				if(resultSet.getString("service").toLowerCase().equals("excellent")) {
					exe = exe + 1;
				}else if (resultSet.getString("service").toLowerCase().equals("very good")) {
					vgood = vgood + 1;
				}else if (resultSet.getString("service").trim().toLowerCase().equals("good")) {
					good = good + 1;
				}else if (resultSet.getString("service").toLowerCase().equals("average")) {
					avg = avg + 1;
				}else if (resultSet.getString("service").toLowerCase().equals("poor")) {
					poor = poor + 1;
				}
			}
		
			arrayList.add(exe);
			arrayList.add(vgood);
			arrayList.add(good);
			arrayList.add(avg);
			arrayList.add(poor);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return arrayList;
	
	}
	
	
public ArrayList<Integer> experienceCount() {
		
		ResultSet resultSet;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.clear();
		int exe = 0, vgood = 0, good = 0, avg = 0, poor = 0;

		String experienceCountQueary = "select * from review";
		
		try {
			connection = new DBconnect().connect();
			preparedStatement = connection.prepareStatement(experienceCountQueary);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				if(resultSet.getString("experience").toLowerCase().equals("excellent")) {
					exe = exe + 1;
				}else if (resultSet.getString("experience").toLowerCase().equals("very good")) {
					vgood = vgood + 1;
				}else if (resultSet.getString("experience").trim().toLowerCase().equals("good")) {
					good = good + 1;
				}else if (resultSet.getString("experience").toLowerCase().equals("average")) {
					avg = avg + 1;
				}else if (resultSet.getString("experience").toLowerCase().equals("poor")) {
					poor = poor + 1;
				}
			}
		
			arrayList.add(exe);
			arrayList.add(vgood);
			arrayList.add(good);
			arrayList.add(avg);
			arrayList.add(poor);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return arrayList;
	
	}
	
	
public ArrayList<Integer> foodCount() {
	
	ResultSet resultSet;
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	arrayList.clear();
	int exe = 0, vgood = 0, good = 0, avg = 0, poor = 0;

	String foodCountQueary = "select * from review";
	
	try {
		connection = new DBconnect().connect();
		preparedStatement = connection.prepareStatement(foodCountQueary);
		resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			if(resultSet.getString("food").toLowerCase().equals("excellent")) {
				exe = exe + 1;
			}else if (resultSet.getString("food").toLowerCase().equals("very good")) {
				vgood = vgood + 1;
			}else if (resultSet.getString("food").trim().toLowerCase().equals("good")) {
				good = good + 1;
			}else if (resultSet.getString("food").toLowerCase().equals("average")) {
				avg = avg + 1;
			}else if (resultSet.getString("food").toLowerCase().equals("poor")) {
				poor = poor + 1;
			}
		}
	
		arrayList.add(exe);
		arrayList.add(vgood);
		arrayList.add(good);
		arrayList.add(avg);
		arrayList.add(poor);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return arrayList;

}
	
	
}

