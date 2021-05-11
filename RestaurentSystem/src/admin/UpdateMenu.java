package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class UpdateMenu {

	private JFrame frame;
	private JTextField firstname;
	private JTextField supportername;
	private JTextField updatedpw;

	
	PreparedStatement pst = null;
	Connection conn = null;
	ResultSet rs = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateMenu window = new UpdateMenu();
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
	public UpdateMenu() {
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
		
		JLabel lblNewLabel = new JLabel("Admin Panel");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(537, 22, 148, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnLOGOUTButton = new JButton("LOGOUT");
		btnLOGOUTButton.setForeground(Color.WHITE);
		btnLOGOUTButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a =JOptionPane.showConfirmDialog(btnLOGOUTButton,"Are you sure");
				if(a==JOptionPane.YES_OPTION) {
				Login logout=new Login();
				Login.main(null);
				frame.setVisible(false);
				}else {
					
				}
				
			}
		});
		btnLOGOUTButton.setFont(new Font("Sylfaen", Font.BOLD, 18));
		btnLOGOUTButton.setBounds(50, 34, 154, 39);
		frame.getContentPane().add(btnLOGOUTButton);
		
		firstname = new JTextField();
		firstname.setColumns(10);
		firstname.setBounds(441, 182, 372, 35);
		frame.getContentPane().add(firstname);
		
		supportername = new JTextField();
		supportername.setColumns(10);
		supportername.setBounds(441, 281, 372, 35);
		frame.getContentPane().add(supportername);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(208, 182, 162, 60);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Supporter name");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(208, 265, 184, 60);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Updated password");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_2.setBounds(200, 367, 217, 60);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JButton btnAdd = new JButton("Update");
		btnAdd.setForeground(Color.WHITE);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					if(firstname.getText().equals("")||supportername.getText().equals("")||updatedpw.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Please fill the form");
						
					
					}else {
						////////////
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
						
						java.sql.Statement stmt=con.createStatement();
						String sql="Select *from admin where admin_name='"+firstname.getText()+"'";
						ResultSet re=stmt.executeQuery(sql);
						
						if(re.next()) {
						
						/////////
						
						
						
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
						
						String sql1="UPDATE admin SET Password= ?  where admin_name = ?";
						
						pst=conn.prepareStatement(sql1);
						 pst.setInt(1, Integer.parseInt(updatedpw.getText()));
						   pst.setString(2, firstname.getText());
			               
			               
			               
			                pst.execute();
			                
			                JOptionPane.showMessageDialog(null, "Updated Successfully");
			                
			                firstname.setText(null);
			                supportername.setText(null);
			               
			                updatedpw.setText(null);
						}else {
							
							JOptionPane.showMessageDialog(null, "Invalid user name");
						}  
					}
					
				}catch(Exception t) {
					
					
				}
				
				
			}
		});
		btnAdd.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		btnAdd.setBounds(446, 477, 154, 35);
		frame.getContentPane().add(btnAdd);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminPanel exiupdate=new AdminPanel();
				AdminPanel.main(null);
				frame.setVisible(false);
			}
		});
		btnExit.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		btnExit.setBounds(654, 477, 159, 35);
		frame.getContentPane().add(btnExit);
		
		updatedpw = new JTextField();
		updatedpw.setBounds(441, 383, 372, 35);
		frame.getContentPane().add(updatedpw);
		updatedpw.setColumns(10);
	}
}
