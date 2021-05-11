package inventory_man;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JPanel;

public class check_sup {

	private JFrame frmCheckSuppliers;
	private JTable table;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					check_sup window = new check_sup();
					window.frmCheckSuppliers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public check_sup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckSuppliers = new JFrame();
		frmCheckSuppliers.setResizable(false);
		frmCheckSuppliers.setTitle("Check Suppliers");
		frmCheckSuppliers.setBounds(350, 150,1250, 750);
		frmCheckSuppliers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckSuppliers.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inventory Management System");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(311, 0, 648, 68);
		frmCheckSuppliers.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Check Supplires");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(622, 73, 288, 48);
		frmCheckSuppliers.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(0, 70, 1244, 11);
		frmCheckSuppliers.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(225, 70, 9, 645);
		frmCheckSuppliers.getContentPane().add(separator_1);
		
		JButton btnPrintItemList = new JButton("Print Item List");
		btnPrintItemList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
	            	
	                
	                MessageFormat header = new MessageFormat("Supplier Details|Grand Mantion Restaurent"
	                		+ ""
	                		+ ".");
	                MessageFormat footer = new MessageFormat("Page{0,number,integer}");
	                table.print(JTable.PrintMode.NORMAL, header, footer);
	            }catch(java.awt.print.PrinterException er){
	                System.err.format("Cannot print %s%n", er.getMessage());
	            }
				
				
			}
			
			
			
		});
		btnPrintItemList.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrintItemList.setBounds(237, 637, 146, 41);
		frmCheckSuppliers.getContentPane().add(btnPrintItemList);
		
		JButton btnNewButton = new JButton("Refresh");
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
		btnNewButton.setBounds(1086, 637, 146, 41);
		frmCheckSuppliers.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(237, 151, 995, 469);
		frmCheckSuppliers.getContentPane().add(scrollPane);
		
		table = new JTable();
		
		table.setFont(new Font("Tahoma", Font.BOLD, 17));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID", "REG Number", "Supplier Name", "Email", "Contact Number", "Address"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(1).setPreferredWidth(125);
		table.getColumnModel().getColumn(2).setPreferredWidth(130);
		table.getColumnModel().getColumn(3).setPreferredWidth(180);
		table.getColumnModel().getColumn(4).setPreferredWidth(163);
		table.getColumnModel().getColumn(5).setPreferredWidth(170);
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 70, 225, 645);
		frmCheckSuppliers.getContentPane().add(panel_1);
		
		JButton btnCheckItem = new JButton("Check Suppliers");
		btnCheckItem.setBounds(12, 289, 215, 39);
		panel_1.add(btnCheckItem);
		btnCheckItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCheckItem.setForeground(Color.RED);
		btnCheckItem.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnCheckSuppliers = new JButton("Check Items");
		btnCheckSuppliers.setBounds(12, 133, 187, 39);
		panel_1.add(btnCheckSuppliers);
		btnCheckSuppliers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				showitem itm = new showitem();
				showitem.main(null);
				frmCheckSuppliers.setVisible(false);
				
				
				
				
				
			}
		});
		btnCheckSuppliers.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnAddItem_1 = new JButton("Add Item");
		btnAddItem_1.setBounds(12, 29, 187, 39);
		panel_1.add(btnAddItem_1);
		btnAddItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				additem itm = new additem();
				additem.main(null);
				frmCheckSuppliers.setVisible(false);
			}
		});
		btnAddItem_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnEditItem = new JButton("Edit Item");
		btnEditItem.setBounds(12, 81, 187, 39);
		panel_1.add(btnEditItem);
		btnEditItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edit_item itm = new edit_item();
				edit_item.main(null);
				frmCheckSuppliers.setVisible(false);
			}
		});
		btnEditItem.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnAddSupplier = new JButton("Add Supplier");
		btnAddSupplier.setBounds(12, 185, 187, 39);
		panel_1.add(btnAddSupplier);
		btnAddSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Add_Sup add = new Add_Sup();
				Add_Sup.main(null);
				frmCheckSuppliers.setVisible(false);
				
				
				
				
			}
		});
		btnAddSupplier.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnEditSupplier = new JButton("Edit Supplier");
		btnEditSupplier.setBounds(12, 237, 187, 39);
		panel_1.add(btnEditSupplier);
		btnEditSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edit_sup itm = new Edit_sup();
				Edit_sup.main(null);
				frmCheckSuppliers.setVisible(false);
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
				frmCheckSuppliers.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(1135, 13, 97, 31);
		frmCheckSuppliers.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(237, 127, 995, 27);
		frmCheckSuppliers.getContentPane().add(panel);
	}
}
