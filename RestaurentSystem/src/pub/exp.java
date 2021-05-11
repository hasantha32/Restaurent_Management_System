package pub;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class exp {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_2;
	private JComboBox combobox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exp window = new exp();
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
	public exp() {
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
		
		JLabel lblNewLabel = new JLabel("GRAND MANSION Restaurant");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(431, 4, 391, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 69, 1233, 12);
		frame.getContentPane().add(separator);
		
		JLabel lblPleaseChooseA = new JLabel("Please Choose a type");
		lblPleaseChooseA.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPleaseChooseA.setBounds(33, 92, 224, 54);
		frame.getContentPane().add(lblPleaseChooseA);
		
		JRadioButton r1=new JRadioButton("Beer");
		JRadioButton r2=new JRadioButton("Whisky");
		r1.setBounds(288,107,100,30);    
		r2.setBounds(454,107,100,30);    
		ButtonGroup bg=new ButtonGroup();    
		bg.add(r1);bg.add(r2);    
		frame.getContentPane().add(r1);frame.getContentPane().add(r2);      
		frame.setSize(1249,747);    
		frame.getContentPane().setLayout(null);    
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(884, 614, 175, 60);
		btnNewButton.setVisible(false);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(75, 468, 74, 54);
		lblName.setVisible(false);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(159, 486, 250, 36);
		textField.setVisible(false);
		frame.getContentPane().add(textField);
		
		JLabel lblType = new JLabel("Type :");
		lblType.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblType.setBounds(75, 545, 74, 54);
		lblType.setVisible(false);
		frame.getContentPane().add(lblType);
		
		JLabel lblQuantity = new JLabel("Quantity :");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblQuantity.setBounds(686, 468, 113, 54);
		lblQuantity.setVisible(false);
		frame.getContentPane().add(lblQuantity);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(784, 480, 250, 36);
		textField_2.setVisible(false);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton_1 = new JButton("Admin Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AdminL itm = new AdminL();
				AdminL.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(1095, 39, 113, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.WHITE);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBox.addItem("whisky");
		comboBox.addItem("Beer");
		comboBox.setVisible(false);
		comboBox.setBounds(159, 560, 255, 39);
		frame.getContentPane().add(comboBox);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double UPrice = 0;
				
				System.out.println("Inside the Order | "+textField.getText());
				
				try {
					Connection connection = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
							"root", "");

					
					
						String query = "select UPrice from pubinventory where ItemName = '"+textField.getText()+"' ";

						Statement sta = connection.createStatement();
						ResultSet rs = sta.executeQuery(query);
						while(rs.next()) {
							UPrice  = rs.getInt("UPrice");
						}
						

						System.out.println("Unit Price | "+UPrice);
						
						if(UPrice != 0) {
							
							System.out.println("If Uprice is not null | "+textField_2.getText());
							int qty = Integer.parseInt(textField_2.getText());
							
							double Price = UPrice * qty;
							int totalprice = (int)Price;
							System.out.println(totalprice);
							
							String sql = "insert into order_table (Qantity,ItemName,TotalPrice,Type,Added_At) Values ('"+qty+"','"+textField.getText()+"','"+totalprice+"','"+comboBox.getSelectedItem()+"', CURRENT_TIMESTAMP)"; 
							 Statement sta1 = connection.createStatement();
			                 int x = sta1.executeUpdate(sql);
			                 
			                 if (x == 0) {
			                        JOptionPane.showMessageDialog(btnNewButton, "Failed to Added");
			                    } else {
			                        JOptionPane.showMessageDialog(btnNewButton, "Order Added Successfully");
			                    }
						}

				}catch (Exception exception) {
                    exception.printStackTrace();
                }	
				
				
			}});
		
		
		ArrayList<String> list = new ArrayList<>();
		   
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println(r1.getText());
				
				try {
					Connection connection = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
							"root", "");

					
					
						String query = "select * from pubinventory where Type = '"+r1.getText()+"' ";

						Statement sta = connection.createStatement();
						ResultSet rs = sta.executeQuery(query);

						String[] columns = { "ItemName", "Unit Price", "Type", "Available Quantity"};
						DefaultTableModel tableModel = new DefaultTableModel(columns, 0);

						while (rs.next()) {
							String ItemName = rs.getString("ItemName");
							String UPrice = rs.getString("UPrice");
							String Type = rs.getString("Type");
							String Quantity = rs.getString("Quantity");

							Object o[] = { ItemName, UPrice, Type, Quantity };
							list.add(ItemName);

							tableModel.addRow(new Object[] { ItemName, UPrice, Type, Quantity });

							System.out.println(ItemName + "\t" + UPrice + "\t" + Type + "\t" + Quantity);

						}
						
						
						
						JScrollPane scrollPane = new JScrollPane();
						scrollPane.setBounds(34, 190, 698, 209);
						frame.getContentPane().add(scrollPane);

						table = new JTable();
						table.setModel(tableModel);
						scrollPane.setViewportView(table);
						
						
						
						btnNewButton.setVisible(true);
						lblName.setVisible(true);
						textField.setVisible(true);
						lblType.setVisible(true);
						comboBox.setVisible(true);
						lblQuantity.setVisible(true);
						textField_2.setVisible(true);
						

						connection.close();
						
					}
					
				 catch (Exception exception) {
					exception.printStackTrace();
				}
				
				
		
			
		}});
		
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println(r1.getText());
				
				try {
					Connection connection = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
							"root", "");

					
					
						String query = "select * from pubinventory where Type = '"+r2.getText()+"' ";

						Statement sta = connection.createStatement();
						ResultSet rs = sta.executeQuery(query);

						String[] columns = { "ItemName", "Unit Price", "Type", "Available Quantity"};
						DefaultTableModel tableModel = new DefaultTableModel(columns, 0);

						while (rs.next()) {
							String ItemName = rs.getString("ItemName");
							String UPrice = rs.getString("UPrice");
							String Type = rs.getString("Type");
							String Quantity = rs.getString("Quantity");

							Object o[] = { ItemName, UPrice, Type, Quantity };
							list.add(ItemName);

							tableModel.addRow(new Object[] { ItemName, UPrice, Type, Quantity });

							System.out.println(ItemName + "\t" + UPrice + "\t" + Type + "\t" + Quantity);

						}
						
						
						
						JScrollPane scrollPane = new JScrollPane();
						scrollPane.setBounds(34, 190, 698, 209);
						frame.getContentPane().add(scrollPane);

						table = new JTable();
						table.setModel(tableModel);
						scrollPane.setViewportView(table);
						
						JLabel lblName = new JLabel("Name :");
						lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
						lblName.setBounds(23, 415, 74, 54);
						frame.getContentPane().add(lblName);
						
						
						btnNewButton.setVisible(true);
						lblName.setVisible(true);
						textField.setVisible(true);
						lblType.setVisible(true);
						comboBox.setVisible(true);
						lblQuantity.setVisible(true);
						textField_2.setVisible(true);
						

						connection.close();
						
					}
					
				 catch (Exception exception) {
					exception.printStackTrace();
				}
		
			
		}});
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               
                  UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(exp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		
		
	}
}
