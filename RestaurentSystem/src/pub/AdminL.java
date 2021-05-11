package pub;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class AdminL {

	private JFrame frame;
	private JTextField txtuname;
	private JPasswordField pswd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminL window = new AdminL();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminL() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(350, 150, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGrandMansionRestaurant = new JLabel("GRAND MANSION Restaurant");
		lblGrandMansionRestaurant.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblGrandMansionRestaurant.setBounds(451, 11, 392, 44);
		frame.getContentPane().add(lblGrandMansionRestaurant);
		
		JEditorPane dtrpnAdminLogin = new JEditorPane();
		dtrpnAdminLogin.setEditable(false);
		dtrpnAdminLogin.setForeground(Color.RED);
		dtrpnAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		dtrpnAdminLogin.setText("ADMIN LOGIN");
		dtrpnAdminLogin.setBounds(515, 164, 156, 26);
		frame.getContentPane().add(dtrpnAdminLogin);
		
		JEditorPane dtrpnUserName = new JEditorPane();
		dtrpnUserName.setEditable(false);
		dtrpnUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		dtrpnUserName.setText("User name");
		dtrpnUserName.setBounds(321, 269, 106, 37);
		frame.getContentPane().add(dtrpnUserName);
		
		txtuname = new JTextField();
		txtuname.setBounds(504, 269, 262, 37);
		frame.getContentPane().add(txtuname);
		txtuname.setColumns(10);
		
		pswd = new JPasswordField();
		pswd.setBounds(504, 390, 262, 37);
		frame.getContentPane().add(pswd);
		
		JEditorPane dtrpnPassword = new JEditorPane();
		dtrpnPassword.setEditable(false);
		dtrpnPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		dtrpnPassword.setText("Password");
		dtrpnPassword.setBounds(321, 401, 106, 26);
		frame.getContentPane().add(dtrpnPassword);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 66, 1234, 9);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("<<Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				exp itm = new exp();
				exp.main(null);
				frame.setVisible(false);
				
				
			}
			
		
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(1083, 101, 106, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				 try {

					 Class.forName("com.mysql.jdbc.Driver");
					 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");

					 java.sql.Statement stmt=con.createStatement();
					 String sql="Select *from pubmanager where PUsername='"+txtuname.getText()+"' and  Ppassword='"+pswd.getText().toString()+"'";
					 ResultSet re=stmt.executeQuery(sql);

					 if(re.next()) {
					 JOptionPane.showMessageDialog(null, "Login Successfully");
					 AdminP adminpanel=new AdminP();
					 AdminP.main(null);
					 frame.setVisible(false);
					 }else {
					 //JOptionPane.showMessageDialog(null, "Invalid username or password");
					 JOptionPane.showMessageDialog(null,"Invalid username or password","Loging Error",JOptionPane.ERROR_MESSAGE);
					 txtuname.setText(null);
					 pswd.setText(null);
					 }


					 }catch(Exception q) {
					 System.out.println();
					 }
				
				 
			
				
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin.setBounds(948, 528, 98, 44);
		frame.getContentPane().add(btnLogin);
	}
}
