package inventory_man;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JPanel;

public class Edit_sup {

	private JFrame frmEditSuppliers;
	private JTextField address;
	private JTextField phone;
	private JTextField email;
	private JTextField name;
	private JTextField reg;
	private JTextField id;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit_sup window = new Edit_sup();
					window.frmEditSuppliers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Edit_sup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEditSuppliers = new JFrame();
		frmEditSuppliers.setResizable(false);
		frmEditSuppliers.setTitle("Edit Suppliers");
		frmEditSuppliers.setBounds(350, 150,1250, 750);
		frmEditSuppliers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditSuppliers.getContentPane().setLayout(null);
;
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(0, 70, 1244, 11);
		frmEditSuppliers.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Inventory Management System");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(311, 0, 648, 68);
		frmEditSuppliers.getContentPane().add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(225, 70, 9, 645);
		frmEditSuppliers.getContentPane().add(separator_1);
		
		JButton btnNewButton_2_1 = new JButton("Update Item");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				 if (reg.getText().equals("")||name.getText().equals("")|| email.getText().equals("")||phone.getText().equals("")||address.getText().equals(""))
					{
	                	JOptionPane.showMessageDialog(null, "Please fill the form frist!");
					}
				
				else {
					
					if (email.getText().matches("^[A-Za-z0-9_.]+[@][A-Za-z.]+$") )
					{
						 if((phone.getText().matches("^\\d{10}$"))) 
						 {
				
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					
					String query="Update suppliers set REGNumber='"+reg.getText()+"',SupplierName='"+name.getText()+"',Email='"+email.getText()+"',ContactNumber='"+phone.getText()+"',	Address='"+address.getText()+"' where ID='"+id.getText()+"'";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Updated");
					pst.close();
					
				}
				catch(Exception ea) {
					ea.printStackTrace();
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
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2_1.setBounds(250, 532, 331, 39);
		frmEditSuppliers.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2 = new JButton("Delete Item");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if(id.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please enter ID");
				}else {
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					String query="Delete from suppliers where ID='"+id.getText()+"'";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.execute();
					
					JOptionPane.showMessageDialog(null, "Data Deleted");
					pst.close();
					
					}
					catch(Exception en) {
						en.printStackTrace();
						
					}
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(250, 573, 331, 39);
		frmEditSuppliers.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("Refresh Table");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
					try {
						Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
						
						String query="select * from suppliers ";
						PreparedStatement pst=connection.prepareStatement(query);
						ResultSet rs=pst.executeQuery();
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(834, 621, 175, 33);
		frmEditSuppliers.getContentPane().add(btnNewButton);
		
		address = new JTextField();
		address.setForeground(Color.BLACK);
		
		address.setToolTipText("Address");
		address.setFont(new Font("Tahoma", Font.BOLD, 18));
		address.setColumns(10);
		
		address.setBounds(250, 410, 330, 120);
		frmEditSuppliers.getContentPane().add(address);
		
		phone = new JTextField();
		phone.setForeground(Color.BLACK);
		phone.setToolTipText("Contact Number");
		phone.setFont(new Font("Tahoma", Font.BOLD, 18));
		phone.setColumns(10);
		phone.setBounds(250, 365, 330, 39);
		frmEditSuppliers.getContentPane().add(phone);
		
		email = new JTextField();
		email.setForeground(Color.BLACK);
		
		email.setToolTipText("Email");
		email.setFont(new Font("Tahoma", Font.BOLD, 18));
		email.setColumns(10);
		email.setBounds(250, 321, 330, 39);
		frmEditSuppliers.getContentPane().add(email);
		
		name = new JTextField();
		name.setForeground(Color.BLACK);
		
		name.setToolTipText("Supplier Name");
		name.setFont(new Font("Tahoma", Font.BOLD, 18));
		name.setColumns(10);
		
		name.setBounds(250, 278, 331, 39);
		frmEditSuppliers.getContentPane().add(name);
		
		reg = new JTextField();
		reg.setForeground(Color.BLACK);
		
		reg.setToolTipText("REG Number");
		reg.setFont(new Font("Tahoma", Font.BOLD, 18));
		reg.setColumns(10);
		
		reg.setBounds(250, 234, 331, 39);
		frmEditSuppliers.getContentPane().add(reg);
		
		id = new JTextField();
		id.setForeground(Color.BLACK);
	
		id.setToolTipText("Enter ID");
		id.setFont(new Font("Tahoma", Font.BOLD, 18));
		id.setColumns(10);
		
		id.setBounds(251, 188, 329, 39);
		frmEditSuppliers.getContentPane().add(id);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(605, 188, 615, 420);
		frmEditSuppliers.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		table.setForeground(SystemColor.text);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID", "REG Number", "Supplier Name", "Email", "Contact Number", "Address"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(155);
		table.getColumnModel().getColumn(2).setPreferredWidth(139);
		table.getColumnModel().getColumn(3).setPreferredWidth(167);
		table.getColumnModel().getColumn(4).setPreferredWidth(160);
		table.getColumnModel().getColumn(5).setPreferredWidth(114);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Edit Supplires");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(622, 73, 225, 48);
		frmEditSuppliers.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login itm = new login();
				login.main(null);
				frmEditSuppliers.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(1135, 13, 97, 31);
		frmEditSuppliers.getContentPane().add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 70, 225, 645);
		frmEditSuppliers.getContentPane().add(panel_1);
		
		JButton btnNewButton_3 = new JButton("Change login details");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setBounds(12, 607, 201, 25);
		panel_1.add(btnNewButton_3);
		
		JButton btnCheckItems = new JButton("Check Items");
		btnCheckItems.setBounds(12, 133, 187, 39);
		panel_1.add(btnCheckItems);
		btnCheckItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				showitem itm = new showitem();
				showitem.main(null);
				frmEditSuppliers.setVisible(false);
			}
		});
		btnCheckItems.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnAddItem_1 = new JButton("Add Item");
		btnAddItem_1.setBounds(12, 29, 187, 39);
		panel_1.add(btnAddItem_1);
		btnAddItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				additem itm = new additem();
				additem.main(null);
				frmEditSuppliers.setVisible(false);
			}
		});
		btnAddItem_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnCheckSuppliers = new JButton("Check Suppliers");
		btnCheckSuppliers.setBounds(12, 289, 187, 39);
		panel_1.add(btnCheckSuppliers);
		btnCheckSuppliers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				check_sup itm = new check_sup();
				check_sup.main(null);
				frmEditSuppliers.setVisible(false);
			}
		});
		btnCheckSuppliers.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnEditSupplier = new JButton("Edit Item");
		btnEditSupplier.setBounds(12, 81, 187, 39);
		panel_1.add(btnEditSupplier);
		btnEditSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edit_item itm = new edit_item();
				edit_item.main(null);
				frmEditSuppliers.setVisible(false);
			}
		});
		btnEditSupplier.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnAddSupplier = new JButton("Add Supplier");
		btnAddSupplier.setBounds(12, 185, 187, 39);
		panel_1.add(btnAddSupplier);
		btnAddSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Sup itm = new Add_Sup();
				Add_Sup.main(null);
				frmEditSuppliers.setVisible(false);
			}
		});
		btnAddSupplier.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnEditItems = new JButton("Edit Supplier");
		btnEditItems.setBounds(12, 237, 215, 39);
		panel_1.add(btnEditItems);
		btnEditItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditItems.setForeground(Color.RED);
		btnEditItems.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(605, 167, 615, 27);
		frmEditSuppliers.getContentPane().add(panel);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset_pass itm = new reset_pass();
				reset_pass.main(null);
			}
		});
	}
}
