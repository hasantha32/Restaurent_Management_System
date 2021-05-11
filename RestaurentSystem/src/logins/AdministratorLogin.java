package logins;

import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import inventory_man.additem;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdministratorLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textAUname;
	private JTextField textAPass;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministratorLogin frame = new AdministratorLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdministratorLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textAUname = new JTextField();
		textAUname.setBounds(270, 95, 86, 20);
		contentPane.add(textAUname);
		textAUname.setColumns(10);
		
		textAPass = new JTextField();
		textAPass.setBounds(270, 151, 86, 20);
		contentPane.add(textAPass);
		textAPass.setColumns(10);
		
		JButton btnALogin = new JButton("Login");
		btnALogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection conAdmin = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1","root","");
					Statement adminstmt = conAdmin.createStatement();
					String sql = "Select * from cashieradmin where Cusername='"+textAUname.getText()+"' and Cpassword='"+ textAPass.getText()+"'";
					ResultSet rs = adminstmt.executeQuery(sql);
				
					if(rs.next()){
						JOptionPane.showMessageDialog(null, "Login Successfull .... ");
						AdminDashboard adminpanel=new AdminDashboard();
						AdminDashboard.main(null);

						
					}	
					else
						JOptionPane.showMessageDialog(null, "Incorrect username or Password... ");
					conAdmin.close();
					
				}catch(Exception e){
					System.out.println(e);
				}
			
			}

			public void close() {
			//	WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
				//Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
			}
		});
		btnALogin.setBounds(270, 208, 89, 23);
		contentPane.add(btnALogin);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			dispose();
			}

			private void close() {
				// TODO Auto-generated method stub
				
			}
		});
		btnBack.setBounds(69, 208, 89, 23);
		contentPane.add(btnBack);
	}
}
