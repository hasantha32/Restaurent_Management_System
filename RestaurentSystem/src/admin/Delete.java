package admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import DBConnection.DBC;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Delete {

	private JFrame frame;
	private JTextField adminname;
	private JTextField confirmpw;

	
	
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
					Delete window = new Delete();
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
	public Delete() {
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
		lblNewLabel.setBounds(601, 29, 148, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnLOGOUTButton = new JButton("LOGOUT");
		btnLOGOUTButton.setForeground(Color.WHITE);
		btnLOGOUTButton.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		btnLOGOUTButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a =JOptionPane.showConfirmDialog(btnLOGOUTButton,"Are you sure");
				if(a==JOptionPane.YES_OPTION) {
				Login logout=new Login();
				Login.main(null);
				}else {
					
				}
			}
		});
		btnLOGOUTButton.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		btnLOGOUTButton.setBounds(36, 52, 165, 37);
		frame.getContentPane().add(btnLOGOUTButton);
		
		JLabel lblNewLabel_1 = new JLabel("Admin name");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(364, 167, 135, 60);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(394, 292, 105, 60);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		adminname = new JTextField();
		adminname.setColumns(10);
		adminname.setBounds(511, 179, 346, 37);
		frame.getContentPane().add(adminname);
		
		confirmpw = new JTextField();
		confirmpw.setColumns(10);
		confirmpw.setBounds(511, 304, 346, 37);
		frame.getContentPane().add(confirmpw);
		
		JButton btnAdd = new JButton("Delete");
		btnAdd.setForeground(Color.WHITE);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				try {
					
					if(adminname.getText().equals("")||confirmpw.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Please fill the form");
					}else {
						
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
						
						java.sql.Statement stmt=con.createStatement();
						String sql="Select *from admin where admin_name='"+adminname.getText()+"' and  password='"+confirmpw.getText().toString()+"'";
						ResultSet re=stmt.executeQuery(sql);
						
						if(re.next()) {
							
							Class.forName("com.mysql.jdbc.Driver");
							Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
							
							String sq="DELETE FROM admin where admin_name = ?";
							
							pst=conn.prepareStatement(sq);
							
							   pst.setString(1, adminname.getText());
				               
				               
				              
				                pst.execute();
				                
				                JOptionPane.showMessageDialog(null, "Delete Successfully");
				                
				                adminname.setText(null);
				                confirmpw.setText(null);
				               
				                
							
						}else {
							//JOptionPane.showMessageDialog(null, "Invalid username or password");
							JOptionPane.showMessageDialog(null,"Invalid username or password","Invalid username or password",JOptionPane.ERROR_MESSAGE);
							adminname.setText(null);
							confirmpw.setText(null);
						}
						
					
			                
					}
					
				}catch(Exception t) {
					
					
				}
				
				
				
				
				
				 /*PreparedStatement pst;
		            DBC con = new DBC();
		            try{
		                pst = con.mkDataBase().prepareStatement("Delete from regadmins where first_name='"+foodName.getText()+"' and  NIC='"+foodID.getText().toString()+"'");
		                pst.setString(1,foodName.getText());
		                pst.setString(2,foodID.getText());
		                
						
		                pst.execute();
		                
		                
		                
		                JOptionPane.showMessageDialog(null,"Item Deleted ");
		                
		                
		            }catch(Exception ex){
		                System.out.println(ex);
		                System.out.println("EEEE");
		                JOptionPane.showMessageDialog(null, "Item not found");
		            }finally{
		                
		            }*/
			}
		});
		btnAdd.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		btnAdd.setBounds(511, 392, 135, 37);
		frame.getContentPane().add(btnAdd);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AdminPanel exitdelete=new AdminPanel();
				AdminPanel.main(null);
				 
				frame.setVisible(false);
				
				
				
				
			}
		});
		btnExit.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		btnExit.setBounds(722, 392, 135, 37);
		frame.getContentPane().add(btnExit);
	}

}
