package feedback;

import java.sql.PreparedStatement;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import db.DBconnect;
import models.Feedback;
import services.FeedbackService;


import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;


public class Feedback1 {
	

	private JFrame frame;
	private JTextField txtFeedback;
	private JTextField txtFirstName;
	private JTextField txtLastname;
	private JTextField textEmail;
	 int id;
	
	private Feedback feedback;
	private JTextField textMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Feedback1 window = new Feedback1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void db()
	{
Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useTimezone=true&serverTimezone=UTC","root","");
            System.out.println("Connected");
            Statement stmt = conn.createStatement();
            String sql;
            
         
            sql = "select * from feedback WHERE FeedbackID = (select max(FeedbackID) from feedback)";
            ResultSet R;
            R = stmt.executeQuery(sql);
           
            
            if (R.next()) {
                
            	 id  = R.getInt(1);
                txtFirstName.setText(R.getString(4));
                txtLastname.setText(R.getString(5));
                textEmail.setText(R.getString(2));
                textMessage.setText(R.getString(6));
            }

        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }

	}

	/**
	 * Create the application.
	 */
	public Feedback1() {
		
		initialize();
		db();
		
//		txtFirstName.setText(t1);
//		txtLastname.setText(t2);
//		textEmail.setText(t3);
//		textMessage.setText(t4);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
	
		frame.setBounds(350, 150, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtFeedback = new JTextField();
		txtFeedback.setEditable(false);
	
		
		txtFeedback.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtFeedback.setText("                                                                                      FEEDBACK");
		txtFeedback.setBounds(0, 37, 1412, 82);
		frame.getContentPane().add(txtFeedback);
		txtFeedback.setColumns(10);
		
		JTextArea txtrThankYou = new JTextArea();
		txtrThankYou.setEditable(false);
	
		txtrThankYou.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
		
		txtrThankYou.setText("      Thank you for your feedback...!");
		txtrThankYou.setBounds(0, 129, 663, 32);
		frame.getContentPane().add(txtrThankYou);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(254, 230, 103, 26);
		frame.getContentPane().add(lblNewLabel);
		
		txtFirstName = new JTextField();
		txtFirstName.setForeground(Color.BLACK);
		txtFirstName.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtFirstName.setEnabled(false);
		txtFirstName.setBounds(446, 266, 493, 26);
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		/*
		public void actionPerformed(ActionEvent arg0) {
			try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurent_management","root","");
					Statement load1 = conn.createStatement();
					String sql = "Select * from ordert where OType = 'food' AND Order_Num='"+textBillNo.getText().toString()+"'";
					ResultSet rs = load1.executeQuery(sql);
					
					DefaultTableModel tm = new DefaultTableModel();
					tm = (DefaultTableModel)table_1.getModel();
				
					while(rs.next()){
						tm.addRow(new Object[]{
						
								rs.getInt(2),
								rs.getInt(1),
								rs.getString(4),
								rs.getDouble(5),
								rs.getInt(5),
								rs.getDouble(10),
					});
				}//while1	
						table_1.setModel(tm);
						
					Statement load2 = conn.createStatement();
					String sql2 = "Select * from ordert where OType='rese' AND Order_Num='"+textBillNo.getText().toString()+"'";
						ResultSet rs2 = load2.executeQuery(sql2);	
						
					DefaultTableModel table2 = new DefaultTableModel();
					table2 = (DefaultTableModel)table_2.getModel();	
					while(rs2.next()){
						table2.addRow(new Object[]{
						
								rs2.getInt(2),
								rs2.getInt(1),
								rs2.getString(4),
								rs2.getDouble(5),
								//rs2.
								rs2.getDouble(9),				
					});
						table_2.setModel(table2);	
		
		
		
		
		*/
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmail.setBounds(254, 378, 103, 26);
		frame.getContentPane().add(lblEmail);
		
		txtLastname = new JTextField();
		txtLastname.setColumns(10);
		txtLastname.setBounds(446, 317, 493, 26);
		frame.getContentPane().add(txtLastname);
		txtLastname.setEnabled(false);
		
		JLabel lblYourFeedback = new JLabel("Your Feedback");
		lblYourFeedback.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblYourFeedback.setBounds(311, 431, 134, 32);
		frame.getContentPane().add(lblYourFeedback);
		
		JButton btnNewButton = new JButton("Delete the Feedback");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				FeedbackService feedback = new FeedbackService();
				feedback.deleteFeedback(id);
			
				
				  int a=JOptionPane.showConfirmDialog(btnNewButton,"Are Yor Sure");
				  if(a==JOptionPane.YES_OPTION) {
					  Feedbacknreview logout=new Feedbacknreview  ();
					  Feedbacknreview .main(null);
					  frame.setVisible(false);
					  
				  
				  }else { }
			
		}
		});
		
		
		
		
		
		
		/*btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Feedbacknreview FND = new Feedbacknreview();
				Feedbacknreview.main(null);
				frame.setVisible(false);
			}
		});*/
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(296, 573, 155, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEditThe = new JButton("Edit the Feedback");
		btnEditThe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setEnabled(true);
				txtLastname.setEnabled(true);
				textEmail.setEnabled(true);
				textMessage.setEnabled(true);
				
				
				
			
				//Edit insert = new Edit();
				//.Edit.main(null);
			
				}
		});
		btnEditThe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEditThe.setBounds(547, 573, 155, 37);
		frame.getContentPane().add(btnEditThe);
		
		JButton btnSubmitAnyway = new JButton("Submit Anyway");
	

		btnSubmitAnyway.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*public void addFeedback(Feedback feedback) {
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
					
				}*/
				
				
				
				
					
					String fname = txtFirstName.getText().toString();
					String lname = txtLastname.getText().toString();
					String email = textEmail.getText().toString();
					String message = textMessage.getText().toString();
					
					FeedbackService feedbackService = new FeedbackService();
					feedbackService.addFeedbackorg(new Feedback(fname, lname, email, message));
				
				
				
				
				int a=JOptionPane.showConfirmDialog(btnSubmitAnyway,"are yor sure");
				if(a==JOptionPane.YES_OPTION) {
					Feedbacknreview submit =new Feedbacknreview ();
					Feedbacknreview .main(null);
					frame.setVisible(false);
					
					
				}else {
					
			}
				
		}
		});
		
		
		
		
		
		
		
		btnSubmitAnyway.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Feedbacknreview FnR = new Feedbacknreview();
				Feedbacknreview.main(null);
				
				
				
				
			
				
				
			}
		});
		btnSubmitAnyway.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSubmitAnyway.setBounds(814, 573, 155, 37);
		frame.getContentPane().add(btnSubmitAnyway);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFirstName.setBounds(333, 266, 103, 26);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblLastName.setBounds(333, 314, 103, 26);
		frame.getContentPane().add(lblLastName);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setEnabled(false);
		textEmail.setBounds(446, 382, 493, 26);
		frame.getContentPane().add(textEmail);
		
		textMessage = new JTextField();
		textMessage.setEnabled(false);
		textMessage.setBounds(457, 455, 482, 74);
		frame.getContentPane().add(textMessage);
		textMessage.setColumns(10);
	}
}
