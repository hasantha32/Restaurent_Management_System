package admin;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import admin.Login;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddingAdmins {

	private JPanel controlPanel;
	private JFrame frame;
	private JTextField RegFirstname;
	private JTextField RegLastName;
	private JTextField NIC;
	private JPasswordField RegpasswordField;
	JLabel lblNewLabel_3;
	private JButton btnExit;
	private JButton btnLOGOUTButton;

	
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
					AddingAdmins window = new AddingAdmins();
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
	public AddingAdmins() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void clear() {
		
		RegFirstname.setText("");
		RegLastName.setText("");
		NIC.setText("");
		RegpasswordField.setText("");
		
		
	}
	
	
	private void initialize() {
		frame = new JFrame();
		//frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(350, 150, 1250, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTER ADMINS");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setIcon(null);
		lblNewLabel.setBounds(579, 40, 211, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel name1 = new JLabel("First Name");
		name1.setForeground(Color.WHITE);
		name1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		name1.setBounds(342, 149, 148, 52);
		frame.getContentPane().add(name1);
		
		
		
		
		JLabel fname = new JLabel("Last Name");
		fname.setForeground(Color.WHITE);
		fname.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		fname.setBounds(342, 222, 132, 47);
		frame.getContentPane().add(fname);
		
		JLabel nationalID = new JLabel("NIC");
		nationalID.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		nationalID.setForeground(Color.WHITE);
		nationalID.setBounds(342, 313, 132, 47);
		frame.getContentPane().add(nationalID);
		
		JLabel pwd = new JLabel("Password");
		pwd.setForeground(Color.WHITE);
		pwd.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		pwd.setBounds(342, 395, 132, 47);
		frame.getContentPane().add(pwd);
		
		RegFirstname = new JTextField();
		RegFirstname.setBounds(488, 149, 394, 40);
		frame.getContentPane().add(RegFirstname);
		RegFirstname.setColumns(10);
		
		RegLastName = new JTextField();
		RegLastName.setColumns(10);
		RegLastName.setBounds(488, 222, 394, 40);
		frame.getContentPane().add(RegLastName);
		
		NIC = new JTextField();
		NIC.setColumns(10);
		NIC.setBounds(488, 313, 394, 40);
		frame.getContentPane().add(NIC);
		
		RegpasswordField = new JPasswordField();
		RegpasswordField.setBounds(488, 395, 394, 40);
		frame.getContentPane().add(RegpasswordField);
		
		
		
		
		
		
		JButton RegistrationButton = new JButton("Register");
		RegistrationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				try {
					if(RegFirstname.getText().equals("")||RegLastName.getText().equals("")|| NIC.getText().equals("")||RegpasswordField.getText().equals("")) {
						
						JOptionPane.showMessageDialog(null, "Please fill the form");
					}else if(!(NIC.getText().trim().matches("^[0-9]{9}[vV]$"))) {
						 JOptionPane.showMessageDialog(null,"Invalid NIC ");
						
					}else {
						
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
						
						String sql="insert into admin (admin_name,admin_lname,NIC,Password) values(?,?,?,?)";
						
						pst=conn.prepareStatement(sql);
						
						   pst.setString(1, RegFirstname.getText());
			                pst.setString(2, RegLastName.getText());
			                pst.setString(3,NIC.getText());
			                pst.setInt(4, Integer.parseInt(RegpasswordField.getText()));
			                pst.execute();
			                
			                JOptionPane.showMessageDialog(null, "Added Successfully");
			                
			                RegFirstname.setText(null);
			                RegLastName.setText(null);
			                NIC.setText(null);
			                RegpasswordField.setText(null);
			                
						
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
				
			
	            /*try{
                    if(jTextField7.getText().equals("")){

                    }else{

                                  String sql = "insert into foods (id,type,price,quantity,amount) values(?,?,?,?,?)";
                                  pst=conn.prepareStatement(sql);
                                  pst.setString(1, String.valueOf(id));
                                  pst.setString(2, jLabel4.getText());
                                  pst.setString(3, jCheckBox1.getText());
                                  pst.setString(4, jTextField1.getText());
                                  pst.setString(5, jTextField7.getText());
                                  pst.execute();
                                 
                               
                          }
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, e );
                        }finally{
                      try{
                           pst.close();
                                  rs.close();
                      }catch(Exception e){
                          
                      }
                  }*/
                   

               
            }
        });
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			/*	

	            PreparedStatement pst;
	            DBC con = new DBC();
	            try{
	            	String fname = RegFirstname.getText().toString();
					String lname = RegLastName.getText().toString();
					String Nic = NIC.getText().toString();
					String pwd = RegpasswordField.getText().toString();
	            	
	            	
	            	
	            	
	            	
	                pst = con.mkDataBase().prepareStatement("insert into testing.admins(admin_name,admin_lname,password,NIC) values (?,?,?,?)");
	                pst.setString(1, fname.getText());
	                pst.setString(2, lname.getText());
	                pst.setDouble(3, Integer.parseInt(Nic.getText()));
	                pst.setString(4, pwd.getText());
	                pst.execute();

	                JOptionPane.showMessageDialog(null, "Done Inserting " + fname.getText());
	                mainFrame.setVisible(false);

	            }catch(Exception ex){
	                System.out.println(ex);
	                System.out.println("EEEE");
	                JOptionPane.showMessageDialog(null, "Inserting Error : " + fname.getText());
	            }finally{

	            }
	         
	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
			/*	
				try {
					
					String fname = RegFirstname.getText().toString();
					String lname = RegLastName.getText().toString();
					String Nic = NIC.getText().toString();
					String pwd = RegpasswordField.getText().toString();
					
					regadminDB adminsadding = new regadminDB();
					adminsadding.add(new Adding(fname,lname,Nic,pwd));
					//adminsadding.Adding(new Feedback(fname, lname, NIc, PWD));
					
					
					frame.setVisible(false);
					JOptionPane.showMessageDialog(null, "Item Added");
				}catch(Exception eq) {
					JOptionPane.showMessageDialog(null, "Error");
				}
				
				
				
				
				
				
				
				

				/*
				DBC con=new DBC();
				
				try {
					boolean status;
					status = con.regadmins((String)comboBox5.getSelectedItem(), (String)comboBox4.getSelectedItem(), 113.5);
					
					JOptionPane.showMessageDialog(null, "Item Added");
				}
				catch(Exception ex) {
					System.out.println(ex);
					System.out.println("EEE");
					JOptionPane.showMessageDialog(null, "Item not found");
				}finally {}
			
	
				Update newUpdate=new Update();
				Update.main(null);
			
//				// TODO Auto-generated method stub
//				
		
				
				
				
				
				
				
				
				
				
				
			/*	
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","");
					
					 String cfname = RegFirstname.toString();
			            String clname = RegLastName.toString();
			            String cnic = NIC.toString();
			           // String cpno = RegpasswordField.getText();
					
					String sqlX= "insert into regadmins values('"+cfname+"','"+clname+"','"+cnic+"')";
					Statement pst=con.prepare]Statement(sqlX);  
					Statement stmt=con.createStatement();
					
					/*pst.setString(1,cfname);
		            pst.setString(2,clname);
		            pst.setString(3,cnic);
					stmt.executeQuery(sqlX);*/
				
			/*	}catch(Exception q) {
					System.out.println(q);
				}
				
				
			
				
				
				
				
			    // DBC con = new DBC();
	          /*  try{
	            	
	            	Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","");
	            	 String cfname = RegFirstname.getText();
			            String clname = RegLastName.getText();
			            String cnic = NIC.getText();
			            String cpno = RegpasswordField.getText();
	            	
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","");
					//java.sql.Statement stmt=con1.createStatement();
					//String sql="insert into testing.regadmins(NIC,firstname,lastname,Password) values (?,?,?,?)";
					
	            	String query="insert into regadmins(NIC,first_name,last_name)values(?,?,?)";
	            	
					PreparedStatement pst=con1.prepareStatement(query);
	                //pst = con.mkDataBase().prepareStatement("insert into testing.regadmins(NIC,firstname,lastname,Password) values (?,?,?,?)");
					pst.setString(1,cfname);
		            pst.setString(2,clname);
		            pst.setString(3,cnic);
		         //   pst.setString(4,cpno);
	                //pst.setString(3, NIC.getText());
	                
	                //pst.setString(1, RegLastName.getText());
	              //  pst.setString(4,RegpasswordField.getText());
	                pst.execute();
	                //ResultSet re=pst.executeQuery();

	                RegFirstname.setText("");
		            RegLastName.setText("");
		            NIC.setText("");
		            RegpasswordField.setText("");
		            
		            
		            //NIC.requestFocus();
		            
	                
	                
	                
	                JOptionPane.showMessageDialog(null, "Done Inserting " + RegFirstname.getText());
	                

	            }catch(Exception ex){
	                System.out.println(ex);
	                System.out.println("EEEE");
	                JOptionPane.showMessageDialog(null, "Inserting Error : " + RegFirstname.getText());
	            }finally{

	            }
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			/*	try{
	                
		            String cfname = RegFirstname.getText();
		            String clname = RegLastName.getText();
		            String cnic = NIC.getText();
		            String cpno = RegpasswordField.getText();
		            
		            PreparedStatement pst=con.prepareStatement(query);
		            pst = con.prepareStatement("insert into regadmins(NIC,firstname,lastname,Password)values(?,?,?,?)");
		            pst.setString(1,cfname);
		            pst.setString(2,clname);
		            pst.setString(3,cnic);
		            pst.setString(4,cpno);
		            
		            JOptionPane.showMessageDialog(this,"Admin Added");
		            
		            RegFirstname.setText("");
		            RegLastName.setText("");
		            NIC.setText("");
		            RegpasswordField.setText("");
		            
		            
		            NIC.requestFocus();
		            
		            this.setVisible(false);
		            
		            //Customer c = new Customer();
		            //c.setVisible(true);
		            
		        } catch (SQLException ex) {
		            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
		        }
				
			
				
				
				
				/*
				
				
				
				
				
				
				
				
				
				
				
				/*	
				   try
				    {
				      // create a mysql database connection
					   Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","");
				    
				      // create a sql date object so we can use it in our INSERT statement
				     // Calendar calendar = Calendar.getInstance();
				      //java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

				      // the mysql insert statement
				      String query = " insert into regadmins (NIC,firstname,lastname,Password) values (?, ?, ?,?)";

				      // create the mysql insert preparedstatement
				      PreparedStatement preparedStmt = con.prepareStatement(query);
				      preparedStmt.setInt (1,Integer.parseInt(NIC.getText()));
				      preparedStmt.setString (2, RegFirstname.getText());
				      preparedStmt.setString  (3, RegLastName.getText());
				      
				     // preparedStmt.setString (4,RegpasswordField.getText());

				      // execute the preparedstatement
				      preparedStmt.execute();
				      
				      con.close();
				    }
				    catch (Exception q)
				    {
				      System.err.println("Got an exception!");
				      System.err.println(q.getMessage());
				      JOptionPane.showMessageDialog(null, "Inserting Error : " + RegFirstname.getText());
				    }
				  }
	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//PreparedStatement pst;
	           // DBC con = new DBC();
	            try{
	            	
					Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","");
					//java.sql.Statement stmt=con1.createStatement();
					//String sql="insert into testing.regadmins(NIC,firstname,lastname,Password) values (?,?,?,?)";
					
	            	String query="insert into regadmins(NIC,firstname,lastname,Password)values(?,?,?,?)";
	            	
					PreparedStatement pst=con1.prepareStatement(query);
	                //pst = con.mkDataBase().prepareStatement("insert into testing.regadmins(NIC,firstname,lastname,Password) values (?,?,?,?)");
	                pst.setDouble(1, Integer.parseInt(NIC.getText()));
	                pst.setString(2, RegFirstname.getText());
	                pst.setString(3, RegLastName.getText());
	                //pst.setString(3, NIC.getText());
	                
	                //pst.setString(1, RegLastName.getText());
	                pst.setString(4,RegpasswordField.getText());
	                pst.execute();
	                //ResultSet re=pst.executeQuery();

	                JOptionPane.showMessageDialog(null, "Done Inserting " + RegFirstname.getText());
	                

	            }catch(Exception ex){
	                System.out.println(ex);
	                System.out.println("EEEE");
	                JOptionPane.showMessageDialog(null, "Inserting Error : " + RegFirstname.getText());
	            }finally{

	            }
				
				/*
				
				/*try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","");
					
					java.sql.Statement stmt=con.createStatement();
					String sql="insert into testing.regadmins(NIC,firstname,lastname,password) values (?,?,?);
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
				}*/
				
				
			
		
		
		RegistrationButton.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		RegistrationButton.setBackground(Color.DARK_GRAY);
		RegistrationButton.setForeground(Color.WHITE);
		RegistrationButton.setBounds(488, 476, 148, 40);
		frame.getContentPane().add(RegistrationButton);
		
		
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminPanel exitregistration=new AdminPanel();
				AdminPanel.main(null);
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 18));
		btnExit.setBackground(Color.DARK_GRAY);
		btnExit.setBounds(734, 476, 148, 40);
		frame.getContentPane().add(btnExit);
		
		btnLOGOUTButton = new JButton("LOGOUT");
		btnLOGOUTButton.setForeground(Color.WHITE);
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
		btnLOGOUTButton.setBounds(60, 65, 168, 46);
		frame.getContentPane().add(btnLOGOUTButton);
		
		
		
		
		
	}
}
