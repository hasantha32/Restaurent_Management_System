package janith;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class StaffLogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffLogin window = new StaffLogin();
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
	public StaffLogin() {
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
		
		JLabel lblNewLabel = new JLabel("User Name :");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 22));
		lblNewLabel.setBounds(303, 150, 200, 31);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Serif", Font.BOLD, 20));
		textField.setBounds(563, 138, 344, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Serif", Font.BOLD, 22));
		lblPassword.setBounds(303, 264, 208, 31);
		frame.getContentPane().add(lblPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username=textField.getText();
				String password=passwordField.getText();
				
if(textField.getText().equals("")||passwordField.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please fill the form");
				}
else {
				try {
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					
					String query="select UserName,Password from staffadmin where UserName=? and Password=?";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1, username);
					pst.setString(2, password);
					ResultSet rs=pst.executeQuery();
					
					int count=0;
					while(rs.next()) {
						count=count+1;
					}
					if(count==1) {
						JOptionPane.showMessageDialog(null, "UserName and Password is correct");
						Dashboard abc =new Dashboard();
						Dashboard.main(null);
						
					}
					else if(count>1) {
						JOptionPane.showMessageDialog(null, "Duplicate UserName and Password");
					}
					else {
						JOptionPane.showMessageDialog(null, "UserName and Password is incorrect Try Again!!!");
					}
					rs.close();
					pst.close();
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
}
				
			}
		});
		btnNewButton.setFont(new Font("Serif", Font.BOLD, 22));
		btnNewButton.setBounds(581, 432, 319, 47);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Serif", Font.BOLD, 20));
		passwordField.setBounds(563, 252, 344, 58);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Staff Admin Login");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(303, 26, 667, 58);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton button = new JButton("<<<Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffHome abc =new StaffHome();
				StaffHome.main(null);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Serif", Font.BOLD, 14));
		button.setBounds(91, 597, 107, 37);
		frame.getContentPane().add(button);
		
	}
}
