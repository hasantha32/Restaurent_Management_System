package admin;

import Customer.Menu;
import java.awt.EventQueue;
import admin.AddingAdmins;
import admin.AdminPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import DBConnection.DBC;

public class Login {

	private JFrame frame;
	private JPasswordField txtPassword;
	private JTextField txtUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(350, 150, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN LOGIN");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(566, 35, 249, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(324, 188, 99, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(324, 268, 99, 45);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(526, 268, 289, 35);
		frame.getContentPane().add(txtPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(526, 188, 289, 35);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		//btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					
					java.sql.Statement stmt=con.createStatement();
					String sql="Select *from admin where admin_name='"+txtUsername.getText()+"' and  password='"+txtPassword.getText().toString()+"'";
					ResultSet re=stmt.executeQuery(sql);
					
					if(re.next()) {
						JOptionPane.showMessageDialog(null, "Login Successfully");
						AdminPanel adminpanel=new AdminPanel();
						AdminPanel.main(null);
					}else {
						//JOptionPane.showMessageDialog(null, "Invalid username or password");
						JOptionPane.showMessageDialog(null,"Invalid username or password","Loging Error",JOptionPane.ERROR_MESSAGE);
						txtUsername.setText(null);
						txtPassword.setText(null);
					}
						
					
				}catch(Exception q) {
					System.out.println();
				}
				/*String username=txtUsername.getText();
				String password=txtPassword.getText();
				
				if(password.contains("admin") && username.contains("admin")) {
					
					AdminPanel adminpanel=new AdminPanel();
					AdminPanel.main(null);
					
				}else {
					//JOptionPane.showMessageDialog(null, "Invalid username or password");
					JOptionPane.showMessageDialog(null,"Invalid username or password","Loging Error",JOptionPane.ERROR_MESSAGE);
					txtUsername.setText(null);
					txtPassword.setText(null);
					
				}*/
				}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(526, 369, 109, 35);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewAdmin = new JButton("Reset");
		//btnNewAdmin.setBackground(Color.LIGHT_GRAY);
		btnNewAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnNewAdmin.setForeground(Color.WHITE);
		btnNewAdmin.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		btnNewAdmin.setBounds(699, 369, 116, 35);
		frame.getContentPane().add(btnNewAdmin);
		
		JButton LoginControllerExit = new JButton("Exit");
		//LoginControllerExit.setBackground(Color.WHITE);
		LoginControllerExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu controllerExit=new Menu();
				Menu.main(null);
				frame.setVisible(false);
				
			}
		});
		LoginControllerExit.setForeground(Color.WHITE);
		LoginControllerExit.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		LoginControllerExit.setBounds(1112, 33, 109, 36);
		frame.getContentPane().add(LoginControllerExit);
	}

}
