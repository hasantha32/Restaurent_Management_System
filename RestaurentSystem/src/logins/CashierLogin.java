package logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class CashierLogin extends JFrame {

	private JPanel LoginCashier;
	private JTextField textCuname;
	private JTextField textCpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierLogin frame = new CashierLogin();
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
	public CashierLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		LoginCashier = new JPanel();
		LoginCashier.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(LoginCashier);
		LoginCashier.setLayout(null);
		
		textCuname = new JTextField();
		textCuname.setBounds(281, 87, 86, 20);
		LoginCashier.add(textCuname);
		textCuname.setColumns(10);
		
		textCpass = new JTextField();
		textCpass.setBounds(281, 131, 86, 20);
		LoginCashier.add(textCpass);
		textCpass.setColumns(10);
		
		JButton btnCahierLogin = new JButton("Login");
		btnCahierLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection concCashier = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurent_management","root","");
					Statement cashierstmt = concCashier.createStatement();
					String sql = "Select * from cashier where CAUsername='"+textCuname.getText()+"' and CAPassword='"+ textCpass.getText()+"'";
					ResultSet rs = cashierstmt.executeQuery(sql);
						if(rs.next()){
							JOptionPane.showMessageDialog(null, "Login Successfull .... ");
							Cashier cashier = new Cashier();
							cashier.setVisible(true);
							dispose();
						}	
						else
							JOptionPane.showMessageDialog(null, "Incorrect username or Password... ");
						concCashier.close();
					
				}catch(Exception e){
					System.out.println(e);
				}
			}
		});
		btnCahierLogin.setBounds(278, 201, 89, 23);
		LoginCashier.add(btnCahierLogin);
	}

}
