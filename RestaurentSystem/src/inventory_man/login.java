package inventory_man;



//ushan
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;

import Customer.MainPage;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class login {

	private JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setResizable(false);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(350, 150, 1250, 750);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(SystemColor.textHighlight);
		layeredPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(100, 100, 100), new Color(0, 0, 0), SystemColor.controlText, SystemColor.textInactiveText));
		layeredPane.setBounds(320, 239, 866, 450);
		frmLogin.getContentPane().add(layeredPane);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(340, 175, 457, 39);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("LogIn");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(495, 279, 152, 39);
		layeredPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("User Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(87, 189, 218, 25);
		layeredPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password   :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPassword.setBounds(87, 241, 218, 25);
		layeredPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField.setBounds(340, 227, 457, 39);
		layeredPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("please enter user name and password to acess the inventory");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(12, 32, 675, 30);
		layeredPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1_1 = new JButton("<<Back");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(12, 663, 152, 39);
		frmLogin.getContentPane().add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage abc =new MainPage();
				MainPage.main(null);
				frmLogin.setVisible(false);
			}
		});

		
		JLabel lblNewLabel_1 = new JLabel("Welcome To The Inventory Management System");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBounds(122, 25, 1041, 92);
		frmLogin.getContentPane().add(lblNewLabel_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username=textField.getText();
				String password=passwordField.getText();
				
				
				
				
				if(textField.getText().equals("")||passwordField.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please enter user name and password!");
				}else {
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					
					String query="select UserName,Password from login where UserName=? and Password=?";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, username);
					pst.setString(2, password);
					ResultSet rs=pst.executeQuery();
					
					int count=0;
					while(rs.next()) {
						count=count+1;
					}
					if(count==1) {
						JOptionPane.showMessageDialog(null, "Welcome to the inventory management system");
						additem adminpanel=new additem();
						additem.main(null);
						frmLogin.setVisible(false);
						
					}
					else if(count>1) {
						JOptionPane.showMessageDialog(null, "Duplicate UserName and Password");
					}
					else {
						JOptionPane.showMessageDialog(null, "UserName or Password is incorrect Try Again!!!");
						textField.setText(null);
						passwordField.setText(null);
						
					}
					rs.close();
					pst.close();
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
				}
				
				
				
				
			}
		});
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               
                  UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
	}
}
