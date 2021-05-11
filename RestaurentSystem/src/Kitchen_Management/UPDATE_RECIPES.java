

package Kitchen_Management;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class UPDATE_RECIPES {

	private JFrame frame;
	private JTextField txtKitchenManagement;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	
	PreparedStatement pst = null;
	Connection conn = null;
	ResultSet rs = null;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UPDATE_RECIPES window = new UPDATE_RECIPES();
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
	public UPDATE_RECIPES() {
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
		
		
		
		
		
	
		
		
		
		
		JButton btnNewButton_1_1_1 = new JButton("LOGOUT");
		
		
		
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a =JOptionPane.showConfirmDialog(btnNewButton_1_1_1,"Are you sure");
				if(a==JOptionPane.YES_OPTION) {
				LOGIN logout=new LOGIN();
				LOGIN.main(null);
				frame.setVisible(false);
				
				}else {
					
				}
			}
		});
		
		
		
		btnNewButton_1_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1_1.setBounds(1616, 28, 158, 55);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		
		
		
		
		
		
		
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.BLACK);
		textField_3.setBounds(0, 0, 1807, 8);
		frame.getContentPane().add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.BLACK);
		textField_2.setBounds(0, 96, 1807, 14);
		frame.getContentPane().add(textField_2);
		
		txtKitchenManagement = new JTextField();
		txtKitchenManagement.setForeground(Color.RED);
		txtKitchenManagement.setHorizontalAlignment(SwingConstants.CENTER);
		txtKitchenManagement.setText("UPDATE RECIPES");
		txtKitchenManagement.setFont(new Font("Times New Roman", Font.BOLD, 40));
		txtKitchenManagement.setBackground(Color.DARK_GRAY);
		txtKitchenManagement.setBounds(0, 0, 1807, 110);
		frame.getContentPane().add(txtKitchenManagement);
		txtKitchenManagement.setColumns(10);
		
		
		JButton btnNewButton = new JButton("SEARCH");
		
		
		
		
		
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SEARCH search=new SEARCH();
				SEARCH.main(null);
			
				
			}
			
		});
		
		
		
		
		
		
		
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(0, 109, 313, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD RECIPES");
		
		
		
		
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ADD_RECIPES details=new ADD_RECIPES();
				ADD_RECIPES.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		
		
		
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBackground(new Color(105, 105, 105));
		btnNewButton_1.setBounds(0, 159, 313, 49);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("UPDATE RECIPES");
		btnNewButton_1_2.setForeground(Color.RED);
		
		
		
		
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				UPDATE_RECIPES update=new UPDATE_RECIPES();
				UPDATE_RECIPES.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		
		
		
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(0, 208, 313, 49);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_2_1_1 = new JButton("DAILY REPORT");
		
		
		
		
		
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DAILY_REPORT details=new DAILY_REPORT();
				DAILY_REPORT.main(null);
				
				
			}
			
		});
		
		
		
		
		btnNewButton_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2_1_1.setBounds(0, 365, 313, 49);
		frame.getContentPane().add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_2_2_1 = new JButton("VIEW ORDERS");
		
		
		
		
		btnNewButton_1_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VIEW_ORDERS details=new VIEW_ORDERS();
				VIEW_ORDERS.main(null);
				frame.setVisible(false);
			}
			
		});
		
		
		
		
		btnNewButton_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2_2_1.setBounds(0, 415, 313, 49);
		frame.getContentPane().add(btnNewButton_1_2_2_1);
		
		JButton btnNewButton_1_1 = new JButton("DELETE RECIPES");
		
		
		
		
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DELETE_RECIPES delete=new DELETE_RECIPES();
				DELETE_RECIPES.main(null);
				frame.setVisible(false);
				
			}
			
		});
		
		
		
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(0, 258, 313, 49);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("VIEW COOKS DETAILS");
		
		
		
		
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				COOKS_DETAILS_HOMEPAGE details=new COOKS_DETAILS_HOMEPAGE();
				COOKS_DETAILS_HOMEPAGE.main(null);
				frame.setVisible(false);
			}
			
		});
		
		
		
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2_1.setBounds(0, 308, 313, 55);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		
		
	
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textField.setColumns(10);
		textField.setBackground(Color.DARK_GRAY);
		textField.setBounds(0, 838, 1807, 110);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(0, 0, 0));
		textField_1.setBounds(0, 813, 1807, 25);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Recipe Name");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(662, 332, 182, 74);
		frame.getContentPane().add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.WHITE);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.DARK_GRAY);
		textField_4.setBounds(856, 339, 245, 49);
		frame.getContentPane().add(textField_4);
		
		JLabel lblRecipeId = new JLabel("Recipe ID");
		lblRecipeId.setBackground(Color.WHITE);
		lblRecipeId.setForeground(Color.WHITE);
		lblRecipeId.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblRecipeId.setBounds(662, 240, 182, 74);
		frame.getContentPane().add(lblRecipeId);
		
		textField_5 = new JTextField();
		textField_5.setForeground(Color.WHITE);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.DARK_GRAY);
		textField_5.setBounds(856, 253, 245, 49);
		frame.getContentPane().add(textField_5);
		
		JLabel lblUpdateIngrediants = new JLabel("Update Ingrediants");
		lblUpdateIngrediants.setBackground(Color.WHITE);
		lblUpdateIngrediants.setForeground(Color.WHITE);
		lblUpdateIngrediants.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblUpdateIngrediants.setBounds(593, 419, 263, 74);
		frame.getContentPane().add(lblUpdateIngrediants);
		
		
	
		
		
		JButton btnNewButton_2_1 = new JButton("Update Recipe");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
try {
					
					if(textField_5.getText().equals("")||textField_4.getText().equals("")||textField_6.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Please fill the form");
					}else {
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
						 /*
						String sql="UPDATE recipes_1 SET id= ?  where Ingrediants = ?";
						
						pst=conn.prepareStatement(sql);
						 pst.setInt(1, Integer.parseInt(textField_5.getText()));
						   pst.setString(2, textField_6.getText());
	/ ///		               /////////////////////////////////////////////////////////////////////////////////////
						  */
							String sql="UPDATE recipes_1 SET Ingrediants= ?  where id = ?";
						
						pst=conn.prepareStatement(sql);
						 
						   pst.setString(1, textField_6.getText());
						   pst.setInt(2, Integer.parseInt(textField_5.getText()));
			               
			                pst.execute();
			                
			                JOptionPane.showMessageDialog(null, "Updated Successfully");
			                
			                textField_5.setText(null);
			                textField_4.setText(null);
			               
			                textField_6.setText(null);
			                
					}
					
				}catch(Exception t) {
					
					
				}

			

		

			
			
			
			
			
			
			
			}	
		});
		
		

		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_2_1.setBackground(Color.GRAY);
		btnNewButton_2_1.setBounds(752, 675, 349, 65);
		frame.getContentPane().add(btnNewButton_2_1);
		
		textField_6 = new JTextField();
		textField_6.setForeground(Color.WHITE);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.DARK_GRAY);
		textField_6.setBounds(856, 438, 659, 152);
		frame.getContentPane().add(textField_6);
		
		JButton btnNewButton_1_2_2_1_1 = new JButton("");
		btnNewButton_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2_2_1_1.setBounds(0, 466, 313, 346);
		frame.getContentPane().add(btnNewButton_1_2_2_1_1);
		
		
	}
	
}
		