package inventory_man;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import java.awt.Window.Type;

public class additem {

	private JFrame frmManageInventory;
	private JTextField no;
	private JTextField name;
	private JTextField qty;
	private JTextField sup;
	private JTextField sprice;
	private JDateChooser dateChooser;
	private JTextField madate;
	private JTextField expdate;
	private JTextField pdate;
	private JDateChooser dateChooser_1;
	private JDateChooser dateChooser_2;
	private JComboBox combobox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					additem window = new additem();
					window.frmManageInventory.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public additem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmManageInventory = new JFrame();
		frmManageInventory.setResizable(false);
		frmManageInventory.setTitle("Add Item");
		frmManageInventory.setBounds(350, 150, 1250, 750);
		frmManageInventory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmManageInventory.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(0, 70, 1247, 11);
		frmManageInventory.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Inventory Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(311, 0, 648, 68);
		frmManageInventory.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 10);
		frmManageInventory.getContentPane().add(panel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(225, 70, 9, 645);
		frmManageInventory.getContentPane().add(separator_1);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login itm = new login();
				login.main(null);
				frmManageInventory.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(1135, 13, 97, 31);
		frmManageInventory.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Add Item");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(622, 73, 142, 48);
		frmManageInventory.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(SystemColor.windowBorder);
		separator_2_1.setBackground(SystemColor.windowBorder);
		separator_2_1.setBounds(225, 175, 1022, 11);
		frmManageInventory.getContentPane().add(separator_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Item Number :");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2.setBounds(246, 190, 172, 39);
		frmManageInventory.getContentPane().add(lblNewLabel_2);
		
		no = new JTextField();
		no.setFont(new Font("Tahoma", Font.BOLD, 20));
		no.setBounds(487, 186, 549, 39);
		frmManageInventory.getContentPane().add(no);
		no.setColumns(10);
		
		JSeparator separator_2_1_1 = new JSeparator();
		separator_2_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_1.setBounds(465, 175, 9, 469);
		frmManageInventory.getContentPane().add(separator_2_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Item Name :");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_1.setBackground(Color.BLACK);
		lblNewLabel_2_1.setBounds(246, 243, 313, 39);
		frmManageInventory.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Type :");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_2.setBackground(Color.BLACK);
		lblNewLabel_2_2.setBounds(246, 290, 120, 39);
		frmManageInventory.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Quantity :");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_3.setBackground(Color.BLACK);
		lblNewLabel_2_3.setBounds(246, 342, 113, 39);
		frmManageInventory.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Expiry Date :");
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_4.setBackground(Color.BLACK);
		lblNewLabel_2_4.setBounds(246, 502, 136, 39);
		frmManageInventory.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Purchase Date :");
		lblNewLabel_2_5.setForeground(Color.WHITE);
		lblNewLabel_2_5.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_5.setBackground(Color.BLACK);
		lblNewLabel_2_5.setBounds(246, 450, 165, 39);
		frmManageInventory.getContentPane().add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Supplier :");
		lblNewLabel_2_5_1.setForeground(Color.WHITE);
		lblNewLabel_2_5_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_5_1.setBackground(Color.BLACK);
		lblNewLabel_2_5_1.setBounds(246, 606, 142, 39);
		frmManageInventory.getContentPane().add(lblNewLabel_2_5_1);
		
		JLabel lblNewLabel_2_5_1_1 = new JLabel("Price :");
		lblNewLabel_2_5_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_5_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_5_1_1.setBackground(Color.BLACK);
		lblNewLabel_2_5_1_1.setBounds(246, 554, 90, 39);
		frmManageInventory.getContentPane().add(lblNewLabel_2_5_1_1);
		
		JSeparator separator_2_1_2 = new JSeparator();
		separator_2_1_2.setForeground(SystemColor.windowBorder);
		separator_2_1_2.setBackground(SystemColor.windowBorder);
		separator_2_1_2.setBounds(225, 229, 1022, 11);
		frmManageInventory.getContentPane().add(separator_2_1_2);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.BOLD, 20));
		name.setColumns(10);
		name.setBounds(487, 237, 549, 39);
		frmManageInventory.getContentPane().add(name);
		
		JSeparator separator_2_1_2_1 = new JSeparator();
		separator_2_1_2_1.setForeground(SystemColor.windowBorder);
		separator_2_1_2_1.setBackground(SystemColor.windowBorder);
		separator_2_1_2_1.setBounds(225, 279, 1022, 11);
		frmManageInventory.getContentPane().add(separator_2_1_2_1);
		
		JSeparator separator_2_1_2_1_1 = new JSeparator();
		separator_2_1_2_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_2_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_2_1_1.setBounds(225, 331, 1022, 11);
		frmManageInventory.getContentPane().add(separator_2_1_2_1_1);
		
		qty = new JTextField();
		qty.setFont(new Font("Tahoma", Font.BOLD, 20));
		qty.setColumns(10);
		qty.setBounds(487, 340, 549, 39);
		frmManageInventory.getContentPane().add(qty);
		
		JSeparator separator_2_1_2_1_1_1 = new JSeparator();
		separator_2_1_2_1_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1.setBounds(225, 385, 1022, 11);
		frmManageInventory.getContentPane().add(separator_2_1_2_1_1_1);
		
		JSeparator separator_2_1_2_1_1_1_1 = new JSeparator();
		separator_2_1_2_1_1_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1.setBounds(225, 435, 1022, 11);
		frmManageInventory.getContentPane().add(separator_2_1_2_1_1_1_1);
		
		JSeparator separator_2_1_2_1_1_1_1_1 = new JSeparator();
		separator_2_1_2_1_1_1_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1.setBounds(225, 490, 1022, 11);
		frmManageInventory.getContentPane().add(separator_2_1_2_1_1_1_1_1);
		
		sup = new JTextField();
		sup.setFont(new Font("Tahoma", Font.BOLD, 20));
		sup.setColumns(10);
		sup.setBounds(487, 602, 549, 39);
		frmManageInventory.getContentPane().add(sup);
		
		JSeparator separator_2_1_2_1_1_1_1_1_1 = new JSeparator();
		separator_2_1_2_1_1_1_1_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1_1.setBounds(225, 543, 1022, 11);
		frmManageInventory.getContentPane().add(separator_2_1_2_1_1_1_1_1_1);
		
		sprice = new JTextField();
		sprice.setFont(new Font("Tahoma", Font.BOLD, 20));
		sprice.setColumns(10);
		sprice.setBounds(487, 550, 549, 39);
		frmManageInventory.getContentPane().add(sprice);
		
		JSeparator separator_2_1_2_1_1_1_1_1_1_1 = new JSeparator();
		separator_2_1_2_1_1_1_1_1_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1_1_1.setBounds(225, 596, 1022, 11);
		frmManageInventory.getContentPane().add(separator_2_1_2_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2 = new JButton("Add Item");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String ItemNumber= no.getText();
                String ItemName= name.getText();
                String Type =(String) combobox.getSelectedItem();
                String 	Quantity = qty.getText();
                String MFD = madate.getText();
                String 	PDate = pdate.getText();
                String EXP = expdate.getText();
                String 	Price = sprice.getText();
                String Supplier = sup.getText();
                

                String msg = "" + ItemName;
                msg += " \n";
                
                
                
                if(no.getText().equals("")||name.getText().equals("")|| qty.getText().equals("")||madate.getText().equals("")||pdate.getText().equals("")|| expdate.getText().equals("")||sprice.getText().equals("")||sup.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Please fill the form");
					
					
				}else {
                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantsystem1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");

                    String query = "INSERT INTO item values(0,'" + ItemNumber + "','" + ItemName + "','" + 	Type + "','" +
                    		Quantity + "','" + MFD + "','" + PDate + "','"+ EXP  +"','"+ Price +"','"+ Supplier +"')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(null, "This item is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton_2,
                            "Item, " + msg + "is sucessfully added");
                        no.setText(null);
						name.setText(null);
						qty.setText(null);
						madate.setText(null);
						pdate.setText(null);
						expdate.setText(null);
						sprice.setText(null);
						sup.setText(null);
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
				}
				
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(1072, 654, 148, 36);
		frmManageInventory.getContentPane().add(btnNewButton_2);
		
		dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dateChooser.setBounds(1021, 392, 18, 39);
		frmManageInventory.getContentPane().add(dateChooser);
		
		madate = new JTextField();
		madate.setForeground(Color.WHITE);
		
		madate.setEditable(false);
		madate.setFont(new Font("Tahoma", Font.BOLD, 20));
		madate.setColumns(10);
		madate.setBounds(487, 392, 535, 39);
		frmManageInventory.getContentPane().add(madate);
		
		JButton btnNewButton_3 = new JButton("Set date");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				madate.setText(df.format(dateChooser.getDate()));
				
				
				
			}
		});
		btnNewButton_3.setBounds(1055, 397, 113, 31);
		frmManageInventory.getContentPane().add(btnNewButton_3);
		
		expdate = new JTextField();
		expdate.setForeground(Color.WHITE);
		
		expdate.setEditable(false);
		expdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		expdate.setColumns(10);
		expdate.setBounds(487, 498, 535, 39);
		frmManageInventory.getContentPane().add(expdate);
		
		JLabel lblNewLabel_2_5_1_2 = new JLabel("Manufactured Date :");
		lblNewLabel_2_5_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_5_1_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_5_1_2.setBackground(Color.BLACK);
		lblNewLabel_2_5_1_2.setBounds(246, 394, 215, 39);
		frmManageInventory.getContentPane().add(lblNewLabel_2_5_1_2);
		
		JSeparator separator_2_1_2_1_1_1_1_1_1_1_1 = new JSeparator();
		separator_2_1_2_1_1_1_1_1_1_1_1.setForeground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1_1_1_1.setBackground(SystemColor.windowBorder);
		separator_2_1_2_1_1_1_1_1_1_1_1.setBounds(225, 643, 1022, 11);
		frmManageInventory.getContentPane().add(separator_2_1_2_1_1_1_1_1_1_1_1);
		
		dateChooser_1 = new JDateChooser();
		dateChooser_1.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		dateChooser_1.setBounds(1021, 446, 18, 39);
		frmManageInventory.getContentPane().add(dateChooser_1);
		
		pdate = new JTextField();
		pdate.setForeground(Color.WHITE);
		
		pdate.setEditable(false);
		pdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		pdate.setColumns(10);
		pdate.setBounds(487, 446, 535, 39);
		frmManageInventory.getContentPane().add(pdate);
		
		dateChooser_2 = new JDateChooser();
		dateChooser_2.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dateChooser_2.setBounds(1021, 498, 18, 39);
		frmManageInventory.getContentPane().add(dateChooser_2);
		
		JButton btnNewButton_3_1 = new JButton("Set date");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SimpleDateFormat da = new SimpleDateFormat("dd/MM/yyyy");
				pdate.setText(da.format(dateChooser_1.getDate()));
				
				
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3_1.setBounds(1055, 446, 113, 31);
		frmManageInventory.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("Set date");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SimpleDateFormat dc = new SimpleDateFormat("dd/MM/yyyy");
				expdate.setText(dc.format(dateChooser_2.getDate()));
				
			}
		});
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3_2.setBounds(1055, 499, 113, 31);
		frmManageInventory.getContentPane().add(btnNewButton_3_2);
		 
		combobox = new JComboBox();
		;
		combobox.setFont(new Font("Tahoma", Font.BOLD, 20));
		combobox.addItem("Solid");
		combobox.addItem("Liquid");
		combobox.addItem("Other");
		combobox.setBounds(487, 288, 549, 39);
		frmManageInventory.getContentPane().add(combobox);
		
		JLabel lblNewLabel_2_5_1_1_1 = new JLabel("Rs/=");
		lblNewLabel_2_5_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_5_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_5_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_2_5_1_1_1.setBounds(1065, 554, 90, 39);
		frmManageInventory.getContentPane().add(lblNewLabel_2_5_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 70, 225, 645);
		frmManageInventory.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCheckSuppliers = new JButton("Check Suppliers");
		btnCheckSuppliers.setBounds(12, 289, 187, 39);
		panel_1.add(btnCheckSuppliers);
		btnCheckSuppliers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				check_sup itm = new check_sup();
				check_sup.main(null);
				frmManageInventory.setVisible(false);
			}
		});
		btnCheckSuppliers.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnNewButton = new JButton("Check Items");
		btnNewButton.setBounds(12, 133, 187, 39);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				showitem itm = new showitem();
				showitem.main(null);
				frmManageInventory.setVisible(false);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnAddItem = new JButton("Add Item");
		btnAddItem.setBounds(12, 29, 215, 39);
		panel_1.add(btnAddItem);
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddItem.setForeground(Color.RED);
		
		btnAddItem.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnAddSupplier = new JButton("Add Supplier");
		btnAddSupplier.setBounds(12, 185, 187, 39);
		panel_1.add(btnAddSupplier);
		btnAddSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Sup itm = new Add_Sup();
				Add_Sup.main(null);
				frmManageInventory.setVisible(false);
			}
		});
		btnAddSupplier.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnEditItem = new JButton("Edit Item");
		btnEditItem.setBounds(12, 81, 187, 39);
		panel_1.add(btnEditItem);
		btnEditItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				edit_item spup = new edit_item ();
				edit_item.main(null);
				frmManageInventory.setVisible(false);
			}
		});
		btnEditItem.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnEditSupplier = new JButton("Edit Supplier");
		btnEditSupplier.setBounds(12, 237, 187, 39);
		panel_1.add(btnEditSupplier);
		btnEditSupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Edit_sup itm = new Edit_sup();
				Edit_sup.main(null);
				frmManageInventory.setVisible(false);
			}
		});
		btnEditSupplier.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnNewButton_3_3 = new JButton("Change login details");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				reset_pass itm = new reset_pass();
				reset_pass.main(null);
			}
		});
		btnNewButton_3_3.setForeground(Color.WHITE);
		btnNewButton_3_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3_3.setBackground(Color.BLACK);
		btnNewButton_3_3.setBounds(12, 607, 201, 25);
		panel_1.add(btnNewButton_3_3);
		
		
	}
}
