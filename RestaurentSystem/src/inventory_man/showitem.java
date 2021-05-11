package inventory_man;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.SystemColor;
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
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JPanel;

public class showitem {

	private JFrame frmCheckItems;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					showitem window = new showitem();
					window.frmCheckItems.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public showitem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckItems = new JFrame();
		frmCheckItems.setResizable(false);
		frmCheckItems.setAutoRequestFocus(false);
		frmCheckItems.setTitle("Check Items");
		frmCheckItems.setBounds(350, 150, 1250, 750);
		frmCheckItems.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckItems.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 70, 1244, 11);
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		frmCheckItems.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Inventory Management System");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(311, 0, 648, 68);
		
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		frmCheckItems.getContentPane().add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(225, 70, 9, 633);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		frmCheckItems.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Check Items");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(587, 73, 215, 48);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		frmCheckItems.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(1086, 637, 146, 41);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
		frmCheckItems.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(237, 155, 995, 469);
		frmCheckItems.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(Color.WHITE);
		table.setFillsViewportHeight(true);
		table.setEnabled(false);
		table.setFont(new Font("SansSerif", Font.BOLD, 17));
		
		table.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setViewportView(table);
		
		JButton btnPrintItemList = new JButton("Print Item List");
		btnPrintItemList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
	            	
	                
	                MessageFormat header = new MessageFormat("Inventory Report|Grand Mantion Restaurent"
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
		btnPrintItemList.setBounds(236, 637, 146, 41);
		frmCheckItems.getContentPane().add(btnPrintItemList);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(2, 70, 225, 645);
		frmCheckItems.getContentPane().add(panel_1);
		
		JButton btnEditSupplier = new JButton("Edit Supplier");
		btnEditSupplier.setBounds(12, 237, 187, 39);
		panel_1.add(btnEditSupplier);
		btnEditSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Edit_sup itm = new Edit_sup();
				Edit_sup.main(null);
				frmCheckItems.setVisible(false);
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
				frmCheckItems.setVisible(false);
			}
		});
		btnAddSupplier.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnCheckSuppliers = new JButton("Check Suppliers");
		btnCheckSuppliers.setBounds(12, 289, 187, 39);
		panel_1.add(btnCheckSuppliers);
		btnCheckSuppliers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				check_sup itm = new check_sup();
				check_sup.main(null);
				frmCheckItems.setVisible(false);
				
			}
		});
		btnCheckSuppliers.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnCheckItem = new JButton("Check Items");
		btnCheckItem.setBounds(12, 133, 215, 39);
		panel_1.add(btnCheckItem);
		btnCheckItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCheckItem.setForeground(Color.RED);
		btnCheckItem.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnAddItem_1 = new JButton("Add Item");
		btnAddItem_1.setBounds(12, 29, 187, 39);
		panel_1.add(btnAddItem_1);
		btnAddItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				additem itm = new additem();
				additem.main(null);
				frmCheckItems.setVisible(false);
				
				
				
				
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
				frmCheckItems.setVisible(false);
			}
		});
		btnEditItem.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnNewButton_3 = new JButton("Change login details");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
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
				frmCheckItems.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(1135, 13, 97, 31);
		frmCheckItems.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(237, 129, 995, 27);
		frmCheckItems.getContentPane().add(panel);
	}
}
