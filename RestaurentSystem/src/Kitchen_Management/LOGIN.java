package Kitchen_Management;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import janith.StaffHome;



public class LOGIN {

	private JFrame frame;
	private JPasswordField txtPassword;
	private JTextField txtUsername;
	private JTextField txtKitchenManagement;

	
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/  UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DAILY_REPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DAILY_REPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DAILY_REPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DAILY_REPORT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN window = new LOGIN();
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
	public LOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(105, 105, 105));
		frame.setBounds(100, 100, 1825, 995);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.BLACK);
		textField_2.setBounds(0, 96, 1807, 14);
		frame.getContentPane().add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.BLACK);
		textField_1.setBounds(0, 825, 1807, 14);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.BLACK);
		textField_3.setBounds(0, 0, 1807, 8);
		frame.getContentPane().add(textField_3);
		
		txtKitchenManagement = new JTextField();
		txtKitchenManagement.setForeground(Color.RED);
		txtKitchenManagement.setHorizontalAlignment(SwingConstants.CENTER);
		txtKitchenManagement.setText("LOGIN");
		txtKitchenManagement.setFont(new Font("Times New Roman", Font.BOLD, 40));
		txtKitchenManagement.setBackground(Color.DARK_GRAY);
		txtKitchenManagement.setBounds(0, 0, 1807, 110);
		frame.getContentPane().add(txtKitchenManagement);
		txtKitchenManagement.setColumns(10);
		

		
		
		
		
		
		
		
		
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(585, 278, 127, 56);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(585, 423, 127, 56);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(764, 432, 332, 56);
		frame.getContentPane().add(txtPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(764, 278, 332, 56);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
				try {

					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");

					java.sql.Statement stmt=con.createStatement();
					String sql="Select *from kitchenmanager where KUserName='"+txtUsername.getText()+"' and  KPassword='"+txtPassword.getText().toString()+"'";
					ResultSet re=stmt.executeQuery(sql);

					if(re.next()) {
					JOptionPane.showMessageDialog(null, "Login Successfully");
					Kitchen kitchen=new Kitchen();
					Kitchen.main(null);
					frame.setVisible(false);
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
				
				if(password.contains("admmin") && username.contains("admin")) {
					
					Kitchen kitchen=new Kitchen();
					Kitchen.main(null);
					
				}else {
					//JOptionPane.showMessageDialog(null, "Invalid username or password");
					JOptionPane.showMessageDialog(null,"Invalid username or password","Loging Error",JOptionPane.ERROR_MESSAGE);
					txtUsername.setText(null);
					txtPassword.setText(null); */
					
				}
				
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(717, 611, 153, 42);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewAdmin = new JButton("Reset");
		btnNewAdmin.setBackground(Color.BLACK);
		btnNewAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnNewAdmin.setForeground(Color.WHITE);
		btnNewAdmin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewAdmin.setBounds(959, 611, 153, 42);
		frame.getContentPane().add(btnNewAdmin);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(184, 134, 11));
		textField.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		textField.setBounds(0, 813, 1807, 14);
		frame.getContentPane().add(textField);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setForeground(new Color(0, 0, 128));
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.DARK_GRAY);
		textField_4.setBounds(0, 839, 1807, 123);
		frame.getContentPane().add(textField_4);
		
		JButton btnNewButton_1 = new JButton("<<Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			StaffHome r = new StaffHome();
			StaffHome.main(null);
			frame.setVisible(false);
			
			
			
			}
			
			
			
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(25, 754, 153, 42);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
