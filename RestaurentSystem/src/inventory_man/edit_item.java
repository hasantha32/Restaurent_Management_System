package inventory_man;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import java.awt.Window.Type;
import javax.swing.JPanel;

public class edit_item {

	private JFrame frmEditItems;
	private JTable table;
	private JTextField id;
	private JTextField no;
	private JTextField name;
	private JTextField qty;
	private JTextField mfd;
	private JTextField pdate;
	private JTextField exp;
	private JTextField supplier;
	private JTextField price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					edit_item window = new edit_item();
					window.frmEditItems.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public edit_item() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEditItems = new JFrame();
		frmEditItems.setResizable(false);
		frmEditItems.setTitle("Edit Items");
		frmEditItems.setBounds(350, 150,1250, 750);
		frmEditItems.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEditItems.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inventory Management System");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(311, 0, 648, 68);
		frmEditItems.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(0, 70, 1244, 11);
		frmEditItems.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(225, 70, 9, 633);
		frmEditItems.getContentPane().add(separator_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(589, 155, 631, 511);
		frmEditItems.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setForeground(SystemColor.text);
		
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "ItemNUmber", "ItemName", "Type", "Quantity", "MFD", "Pdate", "EXP", "Price", "Supplier"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(87);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Refresh Table");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					
					String query="select * from item ";
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
		btnNewButton.setBounds(846, 670, 161, 27);
		frmEditItems.getContentPane().add(btnNewButton);
		
		id = new JTextField();
		id.setToolTipText("Enter ID To Delete Or Update");
	
		id.setFont(new Font("Tahoma", Font.BOLD, 18));
		id.setBounds(246, 545, 330, 39);
		frmEditItems.getContentPane().add(id);
		id.setColumns(10);
		
		no = new JTextField();
		no.setHorizontalAlignment(SwingConstants.LEFT);
		no.setForeground(Color.BLACK);
		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				no.setText(null);
			}
		});
		
	    no.setToolTipText("Enter item number");
		no.setFont(new Font("Tahoma", Font.BOLD, 18));
		no.setColumns(10);
		no.setBounds(246, 155, 330, 39);
		frmEditItems.getContentPane().add(no);
		
		name = new JTextField();
		name.setToolTipText("Enter item  name");
		name.setFont(new Font("Tahoma", Font.BOLD, 18));
		name.setColumns(10);
		name.setBounds(246, 198, 330, 39);
		frmEditItems.getContentPane().add(name);
		
		qty = new JTextField();
		qty.setToolTipText("Enter Quantity");
		qty.setFont(new Font("Tahoma", Font.BOLD, 18));
		qty.setColumns(10);
		qty.setBounds(246, 284, 330, 39);
		frmEditItems.getContentPane().add(qty);
		
		mfd = new JTextField();
		mfd.setToolTipText("Manufactured Date");
	
		mfd.setEditable(false);
		mfd.setFont(new Font("Tahoma", Font.BOLD, 18));
		mfd.setColumns(10);
		mfd.setBounds(247, 324, 237, 39);
		frmEditItems.getContentPane().add(mfd);
		
		pdate = new JTextField();
		pdate.setToolTipText("Parchased Date");
	
		pdate.setEditable(false);
		pdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		pdate.setColumns(10);
		pdate.setBounds(246, 370, 238, 39);
		frmEditItems.getContentPane().add(pdate);
		
		exp = new JTextField();
		exp.setToolTipText("Expiry Date");
	
		exp.setEditable(false);
		exp.setFont(new Font("Tahoma", Font.BOLD, 18));
		exp.setColumns(10);
		exp.setBounds(246, 414, 238, 39);
		frmEditItems.getContentPane().add(exp);
		
		supplier = new JTextField();
		supplier.setToolTipText("Enter Supplier");
		supplier.setFont(new Font("Tahoma", Font.BOLD, 18));
		supplier.setColumns(10);
		supplier.setBounds(246, 501, 330, 39);
		frmEditItems.getContentPane().add(supplier);
		
		price = new JTextField();
		price.setToolTipText("Enter Price");
		price.setFont(new Font("Tahoma", Font.BOLD, 18));
		price.setColumns(10);
		price.setBounds(246, 457, 330, 39);
		frmEditItems.getContentPane().add(price);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.addItem("Solid");
		comboBox.addItem("Liquid");
		comboBox.addItem("Other");
		comboBox.setBounds(246, 239, 330, 39);
		frmEditItems.getContentPane().add(comboBox);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dateChooser.setBounds(483, 324, 25, 39);
		frmEditItems.getContentPane().add(dateChooser);
		
		JButton btnNewButton_1 = new JButton("Set");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				mfd.setText(df.format(dateChooser.getDate()));
			}
		});
		btnNewButton_1.setBounds(511, 324, 66, 39);
		frmEditItems.getContentPane().add(btnNewButton_1);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dateChooser_1.setBounds(483, 370, 25, 39);
		frmEditItems.getContentPane().add(dateChooser_1);
		
		JButton btnNewButton_1_1 = new JButton("Set");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat dn = new SimpleDateFormat("dd/MM/yyyy");
				pdate.setText(dn.format(dateChooser_1.getDate()));
			}
		});
		btnNewButton_1_1.setBounds(511, 370, 66, 39);
		frmEditItems.getContentPane().add(btnNewButton_1_1);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			}
		});
		dateChooser_2.setBounds(483, 414, 25, 39);
		frmEditItems.getContentPane().add(dateChooser_2);
		
		JButton btnNewButton_1_1_1 = new JButton("Set");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat dx = new SimpleDateFormat("dd/MM/yyyy");
				exp.setText(dx.format(dateChooser_2.getDate()));
			}
		});
		btnNewButton_1_1_1.setBounds(511, 414, 66, 39);
		frmEditItems.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("Delete Item");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(id.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please enter ID");
				}else {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					String query="Delete from item where ID='"+id.getText()+"'";
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
		btnNewButton_2.setBounds(246, 627, 331, 39);
		frmEditItems.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Update Item");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(no.getText().equals("")||name.getText().equals("")|| qty.getText().equals("")||mfd.getText().equals("")||pdate.getText().equals("")|| exp.getText().equals("")||price.getText().equals("")||supplier.getText().equals("")||id.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please fill the form");
				}else {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
					
					String query="Update item set ItemNumber='"+no.getText()+"',ItemName='"+name.getText()+"',Type='"+comboBox.getSelectedItem()+"',Quantity='"+qty.getText()+"',MFD='"+mfd.getText()+"',PDate='"+pdate.getText()+"',EXP='"+exp.getText()+"',Price='"+price.getText()+"',Supplier='"+supplier.getText()+"' where ID='"+id.getText()+"'";
					PreparedStatement pst=connection.prepareStatement(query);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data Updated");
					pst.close();
					
				}
				catch(Exception ea) {
					ea.printStackTrace();
				}
				}
				
				
				
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2_1.setBounds(246, 586, 331, 39);
		frmEditItems.getContentPane().add(btnNewButton_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("Edit Items");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(622, 73, 167, 48);
		frmEditItems.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1_2 = new JButton("Logout");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login itm = new login();
				login.main(null);
				frmEditItems.setVisible(false);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1_2.setBounds(1135, 13, 97, 31);
		frmEditItems.getContentPane().add(btnNewButton_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 70, 225, 645);
		frmEditItems.getContentPane().add(panel_1);
		
		JButton btnCheckItems = new JButton("Check Items");
		btnCheckItems.setBounds(10, 133, 187, 39);
		panel_1.add(btnCheckItems);
		btnCheckItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				showitem spup = new showitem ();
				showitem.main(null);
				frmEditItems.setVisible(false);
				
				
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
				frmEditItems.setVisible(false);
			}
		});
		btnAddItem_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnCheckSuppliers = new JButton("Check Suppliers");
		btnCheckSuppliers.setBounds(10, 289, 187, 39);
		panel_1.add(btnCheckSuppliers);
		btnCheckSuppliers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				check_sup itm = new check_sup();
				check_sup.main(null);
				frmEditItems.setVisible(false);
				
			}
		});
		btnCheckSuppliers.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnEditItems = new JButton("Edit Items");
		btnEditItems.setBounds(10, 81, 215, 39);
		panel_1.add(btnEditItems);
		btnEditItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditItems.setForeground(Color.RED);
		btnEditItems.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnAddSupplier = new JButton("Add Supplier");
		btnAddSupplier.setBounds(10, 185, 187, 39);
		panel_1.add(btnAddSupplier);
		btnAddSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Sup itm = new Add_Sup();
				Add_Sup.main(null);
				frmEditItems.setVisible(false);
			}
		});
		btnAddSupplier.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnEditSupplier = new JButton("Edit Supplier");
		btnEditSupplier.setBounds(10, 237, 187, 39);
		panel_1.add(btnEditSupplier);
		btnEditSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edit_sup itm = new Edit_sup();
				Edit_sup.main(null);
				frmEditItems.setVisible(false);
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
		btnNewButton_3.setBounds(10, 607, 201, 25);
		panel_1.add(btnNewButton_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
	
		panel.setBounds(589, 135, 631, 27);
		frmEditItems.getContentPane().add(panel);
	}
}
