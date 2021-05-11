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
import javax.swing.SwingConstants;





import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class ADD_RECIPES {

	private JFrame frame;
	private JTextField txtKitchenManagement;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	

	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADD_RECIPES window = new ADD_RECIPES();
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
	public ADD_RECIPES() {
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
		txtKitchenManagement.setText("ADD RECIPES");
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
		
		
		
	
		
		
		
		
		
		

		
		
	
		
		
		
		
		
		
		JButton btnNewButton_2 = new JButton("Add Recipe");
		

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
	
				/*

				try {
					if(textField_4.getText().equals("")||textArea.getText().equals("")) {
						
						JOptionPane.showMessageDialog(null, "Please fill the form");
					}else {
						
						Class.forName("com.mysql.jdbc.Driver");
						 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kitchen", "root", "root");
						 
						String sql="insert into recipes_1 (0,Name,Ingrediants) values(?,?,?)";
						
						pst=connection.prepareStatement(sql);
						
					
						   pst.setString(1, textField_4.getText());
						   pst.setString(2, textArea.getText());
			                pst.execute();
			                
			                JOptionPane.showMessageDialog(null, "Added Successfully");
			                
			                
			            
			                textField_4.setText(null);
			                textArea.setText(null);
						
					}
					
					
				}catch(Exception w) {
					
					JOptionPane.showMessageDialog(null, w );
				}
				finally{
                    try{
                         pst.close();
                                rs.close();
                    }catch(Exception r){
                        
                    }
                }
				
	        }
	        });
		
			*/
			 
		  String Name = textField_4.getText();
		  String id = textField_7.getText();
		  String Type = textField_6.getText();
        String Ingrediants = textField_5.getText();

        String msg = "" + Name;
        msg += " \n";
        

        try {
        	Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");

            String query = "INSERT INTO recipes_1 values('" + id + "','" + Name + "','" + Type + "','" + Ingrediants + "')";
            
           Statement sta = con.createStatement();
            int x = sta.executeUpdate(query);
            if (x == 0) {
                JOptionPane.showMessageDialog(btnNewButton_2, "This is alredy exist");
            } else {
                JOptionPane.showMessageDialog(btnNewButton_2,
                    "Welcome, " + msg + "Your recipe is added successfully");
            }
            con.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        
        
        
    }
});
		
		
	
				
				
				/*
		
		
		
		
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ID = textField_5.getText();
				  String Name = textField_4.getText();
	              String ingrediants = textArea.getText();
	               

	               
	                String msg = "" + Name;
	                msg += " \n";

	                try {
	                	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/has", "root", "root");

	                    String query = "INSERT INTO account values('" + ID + "','" + Name + "','" + ingrediants + "')";

	                    java.sql.Statement sta = connection.createStatement();
	                    int x = sta.executeUpdate(query);
	                    if (x == 0) {
	                        JOptionPane.showMessageDialog(btnNewButton_2, "This is alredy exist");
	                    } else {
	                        JOptionPane.showMessageDialog(btnNewButton_2,
	                            "Welcome, " + msg + "Your account is sucessfully created");
	                    }
	                    connection.close();
	                } 
	                catch (Exception exception) {
	                    exception.printStackTrace();
	                }
	            }
	        });
	            
	            
	            
	          
		*/   
	         
		
		
		
		
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.setBounds(774, 701, 349, 65);
		frame.getContentPane().add(btnNewButton_2);
		
		
		
		
		
		
		
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
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(519, 219, 182, 74);
		frame.getContentPane().add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.WHITE);
		textField_4.setBackground(Color.DARK_GRAY);
		textField_4.setBounds(713, 225, 650, 49);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblIngrediants = new JLabel("Ingrediants");
		lblIngrediants.setForeground(Color.WHITE);
		lblIngrediants.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblIngrediants.setBounds(519, 464, 182, 74);
		frame.getContentPane().add(lblIngrediants);
		
		textField_5 = new JTextField();
		textField_5.setForeground(Color.WHITE);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.DARK_GRAY);
		textField_5.setBounds(713, 464, 650, 155);
		frame.getContentPane().add(textField_5);
		
		JLabel lblRecipeType = new JLabel("Recipe Type");
		lblRecipeType.setForeground(Color.WHITE);
		lblRecipeType.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblRecipeType.setBounds(519, 365, 182, 74);
		frame.getContentPane().add(lblRecipeType);
		
		textField_6 = new JTextField();
		textField_6.setForeground(Color.WHITE);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.DARK_GRAY);
		textField_6.setBounds(713, 384, 650, 49);
		frame.getContentPane().add(textField_6);
		
		JLabel lblRecipeId = new JLabel("Recipe ID");
		lblRecipeId.setForeground(Color.WHITE);
		lblRecipeId.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblRecipeId.setBounds(519, 297, 182, 74);
		frame.getContentPane().add(lblRecipeId);
		
		textField_7 = new JTextField();
		textField_7.setForeground(Color.WHITE);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.DARK_GRAY);
		textField_7.setBounds(713, 303, 650, 49);
		frame.getContentPane().add(textField_7);
		
		JButton btnNewButton_1_2_2_1_1 = new JButton("");
		btnNewButton_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2_2_1_1.setBounds(0, 464, 313, 348);
		frame.getContentPane().add(btnNewButton_1_2_2_1_1);
		

	}
}