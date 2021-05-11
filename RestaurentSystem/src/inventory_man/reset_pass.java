package inventory_man;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Window.Type;

public class reset_pass {

	private JFrame frmResetLogin;
	private JTextField user;
	private JPasswordField pass;
	private JTextField id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reset_pass window = new reset_pass();
					window.frmResetLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public reset_pass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmResetLogin = new JFrame();
		frmResetLogin.setType(Type.POPUP);
		frmResetLogin.getContentPane().setBackground(Color.BLACK);
		frmResetLogin.setTitle("Reset Login");
		frmResetLogin.setResizable(false);
		frmResetLogin.setBounds(700, 350, 531, 338);
		frmResetLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmResetLogin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		
		panel.setBounds(34, 27, 454, 236);
		frmResetLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblResetUserName = new JLabel("New User Name :");
		lblResetUserName.setBounds(25, 83, 165, 21);
		lblResetUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(lblResetUserName);
		
		JLabel lblNewLabel = new JLabel("Reset Login Details");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(135, 13, 202, 21);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewPassword = new JLabel("New Password   :");
		lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewPassword.setBounds(25, 136, 156, 21);
		panel.add(lblNewPassword);
		
		user = new JTextField();
		user.setForeground(Color.WHITE);
		user.setFont(new Font("Tahoma", Font.BOLD, 17));
		user.setBounds(181, 75, 245, 40);
		panel.add(user);
		user.setColumns(10);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				

				 if (user.getText().equals("")||pass.getText().equals(""))
					{
	                	JOptionPane.showMessageDialog(null, "Please enter the login details frist!");
					}
				
				else {
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					
					String query="Update login set UserName='"+user.getText()+"',Password='"+pass.getText()+"' where ID='"+id.getText()+"'";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Login Details Reseted!");
					pst.close();
					user.setText(null);
					pass.setText(null);
					
					
				}
				catch(Exception ea) {
					ea.printStackTrace();
				}
				
				}
			
			
			
			
			}
		});
		btnNewButton.setBounds(202, 181, 139, 42);
		panel.add(btnNewButton);
		
		pass = new JPasswordField();
		pass.setForeground(Color.WHITE);
		pass.setFont(new Font("Tahoma", Font.BOLD, 17));
		pass.setBounds(181, 128, 245, 40);
		panel.add(pass);
		
		id = new JTextField();
		id.setEditable(false);
		id.setEnabled(false);
		id.setText("1");
		id.setBounds(647, 133, 60, 22);
		frmResetLogin.getContentPane().add(id);
		id.setColumns(10);
	}
}
