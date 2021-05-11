package inventory_man;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JPanel;

public class Add_Sup {

	private JFrame frmAddSuppliers;
	private JTextField reg;
	private JTextField sname;
	private JTextField mail;
	private JTextField cnum;
	private JTextField address;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Sup window = new Add_Sup();
					window.frmAddSuppliers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_Sup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddSuppliers = new JFrame();
		frmAddSuppliers.setResizable(false);
		frmAddSuppliers.setTitle("Add Suppliers");
		frmAddSuppliers.setBounds(350, 150,1250, 750);
		frmAddSuppliers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddSuppliers.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inventory Management System");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(311, 0, 648, 68);
		frmAddSuppliers.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(0, 70, 1248, 11);
		frmAddSuppliers.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(225, 70, 9, 645);
		frmAddSuppliers.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Add Suppliers");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(571, 81, 228, 48);
		frmAddSuppliers.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_5_1_2 = new JLabel("REG Number :");
		lblNewLabel_2_5_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_5_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_5_1_2.setBackground(Color.BLACK);
		lblNewLabel_2_5_1_2.setBounds(247, 264, 215, 39);
		frmAddSuppliers.getContentPane().add(lblNewLabel_2_5_1_2);
		
		reg = new JTextField();
		reg.setFont(new Font("Tahoma", Font.BOLD, 20));
		reg.setColumns(10);
		
		reg.setBounds(488, 262, 549, 39);
		frmAddSuppliers.getContentPane().add(reg);
		
		JLabel a = new JLabel("Supplier Name :");
		a.setForeground(Color.WHITE);
		a.setFont(new Font("Tahoma", Font.BOLD, 20));
		a.setBackground(Color.BLACK);
		a.setBounds(247, 320, 165, 39);
		frmAddSuppliers.getContentPane().add(a);
		
		sname = new JTextField();
		sname.setFont(new Font("Tahoma", Font.BOLD, 20));
		sname.setColumns(10);
		
		sname.setBounds(488, 316, 549, 39);
		frmAddSuppliers.getContentPane().add(sname);
		
		JLabel b = new JLabel("E-Mail :");
		b.setForeground(Color.WHITE);
		b.setFont(new Font("Tahoma", Font.BOLD, 20));
		b.setBackground(Color.BLACK);
		b.setBounds(247, 372, 136, 39);
		frmAddSuppliers.getContentPane().add(b);
		
		mail = new JTextField();
		mail.setFont(new Font("Tahoma", Font.BOLD, 20));
		mail.setColumns(10);
	
		mail.setBounds(488, 368, 549, 39);
		frmAddSuppliers.getContentPane().add(mail);
		
		JLabel c = new JLabel("Contact Number :");
		c.setForeground(Color.WHITE);
		c.setFont(new Font("Tahoma", Font.BOLD, 20));
		c.setBackground(Color.BLACK);
		c.setBounds(247, 424, 207, 39);
		frmAddSuppliers.getContentPane().add(c);
		
		cnum = new JTextField();
		cnum.setFont(new Font("Tahoma", Font.BOLD, 20));
		cnum.setColumns(10);
		cnum.setBounds(488, 420, 549, 39);
		frmAddSuppliers.getContentPane().add(cnum);
		
		JLabel d = new JLabel("Address :");
		d.setForeground(Color.WHITE);
		d.setFont(new Font("Tahoma", Font.BOLD, 20));
		d.setBackground(Color.BLACK);
		d.setBounds(246, 476, 142, 39);
		frmAddSuppliers.getContentPane().add(d);
		
		address = new JTextField();
		address.setHorizontalAlignment(SwingConstants.LEFT);
		address.setFont(new Font("Tahoma", Font.BOLD, 20));
		address.setColumns(10);
		address.setBounds(488, 472, 549, 39);
		frmAddSuppliers.getContentPane().add(address);
		
		JSeparator separator_2_1_2_1_1_1 = new JSeparator();
		separator_2_1_2_1_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1.setBounds(226, 255, 1022, 11);
		frmAddSuppliers.getContentPane().add(separator_2_1_2_1_1_1);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_1.setBounds(466, 255, 10, 261);
		frmAddSuppliers.getContentPane().add(separator_2_1_1);
		
		JSeparator separator_2_1_2_1_1_1_1_1 = new JSeparator();
		separator_2_1_2_1_1_1_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1.setBounds(226, 360, 1022, 11);
		frmAddSuppliers.getContentPane().add(separator_2_1_2_1_1_1_1_1);
		
		JSeparator separator_2_1_2_1_1_1_1 = new JSeparator();
		separator_2_1_2_1_1_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1.setBounds(226, 305, 1022, 11);
		frmAddSuppliers.getContentPane().add(separator_2_1_2_1_1_1_1);
		
		JSeparator separator_2_1_2_1_1_1_1_1_1 = new JSeparator();
		separator_2_1_2_1_1_1_1_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1_1.setBounds(226, 413, 1022, 11);
		frmAddSuppliers.getContentPane().add(separator_2_1_2_1_1_1_1_1_1);
		
		JSeparator separator_2_1_2_1_1_1_1_1_1_1 = new JSeparator();
		separator_2_1_2_1_1_1_1_1_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1_1_1.setBounds(226, 466, 1022, 11);
		frmAddSuppliers.getContentPane().add(separator_2_1_2_1_1_1_1_1_1_1);
		
		JSeparator separator_2_1_2_1_1_1_1_1_1_1_1 = new JSeparator();
		separator_2_1_2_1_1_1_1_1_1_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1_1_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1_1_1_1.setBounds(226, 517, 1022, 11);
		frmAddSuppliers.getContentPane().add(separator_2_1_2_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2 = new JButton("Add Supplier");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String 	REGNumber= reg.getText();
                String SupplierName= sname.getText();
                String 	Email = mail.getText();
                String ContactNumber = cnum.getText();
                String 	Address = address.getText();
                
                

                String msg = "" + SupplierName;
                msg += " \n";
               
                
                
                
                
                if (reg.getText().equals("")||sname.getText().equals("")|| mail.getText().equals("")||cnum.getText().equals("")||address.getText().equals(""))
				{
                	JOptionPane.showMessageDialog(null, "Please fill the form");
				}
			
			else {
				
				if (mail.getText().matches("^[A-Za-z0-9_.]+[@][A-Za-z.]+$") )
				{
					 if((cnum.getText().matches("^\\d{10}$"))) 
					 {
						
						 
							
                
               
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");

                    String query = "INSERT INTO suppliers values(0,'" + 	REGNumber + "','" + SupplierName + "','" + 	Email + "','" +
                    		ContactNumber + "','" + Address + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(null,"This item is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(null,
                            "Item, " + msg + "is sucessfully added");
                    	reg.setText(null);
						sname.setText(null);
						mail.setText(null);
						cnum.setText(null);
						address.setText(null);
						
                        
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                
				}
				else {
					JOptionPane.showMessageDialog(null, "wrong phone");
				    
				}
					 
				}
				else {
					JOptionPane.showMessageDialog(null, "wrong email!");
				    
				}
                
                
				
              
			
			
			
			
			
			
			
			
			
			
			
			}
			
			}
			});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(1047, 642, 173, 48);
		frmAddSuppliers.getContentPane().add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 70, 225, 645);
		frmAddSuppliers.getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("Check Items");
		btnNewButton.setBounds(12, 133, 187, 39);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				showitem itm = new showitem();
				showitem.main(null);
				frmAddSuppliers.setVisible(false);
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnAddItem_1 = new JButton("Add Item");
		btnAddItem_1.setBounds(12, 29, 187, 39);
		panel_1.add(btnAddItem_1);
		btnAddItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				additem itm = new additem();
				additem.main(null);
				frmAddSuppliers.setVisible(false);
			}
		});
		btnAddItem_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnCheckSuppliers = new JButton("Check Suppliers");
		btnCheckSuppliers.setBounds(12, 290, 187, 39);
		panel_1.add(btnCheckSuppliers);
		btnCheckSuppliers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				check_sup itm = new check_sup();
				check_sup.main(null);
				frmAddSuppliers.setVisible(false);
			}
		});
		btnCheckSuppliers.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnEditItem = new JButton("Edit Item");
		btnEditItem.setBounds(12, 81, 187, 39);
		panel_1.add(btnEditItem);
		btnEditItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edit_item itm = new edit_item();
				edit_item.main(null);
				frmAddSuppliers.setVisible(false);
			}
		});
		btnEditItem.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnAddSupplires = new JButton("Add Supplires");
		btnAddSupplires.setBounds(12, 186, 215, 39);
		panel_1.add(btnAddSupplires);
		btnAddSupplires.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddSupplires.setForeground(Color.RED);
		btnAddSupplires.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnEditSupplier = new JButton("Edit Supplier");
		btnEditSupplier.setBounds(12, 238, 187, 39);
		panel_1.add(btnEditSupplier);
		btnEditSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edit_sup itm = new Edit_sup();
				Edit_sup.main(null);
				frmAddSuppliers.setVisible(false);
			}
		});
		btnEditSupplier.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnNewButton_3 = new JButton("Change login details");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				reset_pass itm = new reset_pass();
				reset_pass.main(null);
			}
		});
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setBounds(12, 607, 201, 25);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login itm = new login();
				login.main(null);
				frmAddSuppliers.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(1135, 13, 97, 31);
		frmAddSuppliers.getContentPane().add(btnNewButton_1);
	}
}
