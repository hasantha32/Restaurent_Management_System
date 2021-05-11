package logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;import javax.swing.table.DefaultTableModel;

import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.ScrollPane;

public class Cashier extends JFrame{

	private JPanel cashierPane;
	private JTextField textBillNo1;
	private JButton btnAdmin;
	private JTextField textTotal;
	private JTextField textPayment;
	private JTextField textBalance;
	private JButton buttonpRINT;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTextField textBillNo2;
	private JTextField textBillNo3;
	/**
	 * Launch the application.
	 */
	
	//calculate total
			private double totTable1 = 0;	//, totTable2 =0, totTable3=0
			private double tbleSum1=0,tbleSum2,tbleSum3;	//
			public double Total=0;
			
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cashier frame = new Cashier();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		
		});
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
	 	System.out.println(sdf.format(date));
	 
	}

//functions for always use	
	
//Methods of the buttons
	
	private void printError(){//handle print errors
		
	}

	
	
// METHODS OF THE BUTTONS --
	
		
	
	/**
	 * Create the frame.
	 */

	public Cashier() {
		addWindowListener(new WindowAdapter() {

		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 750);
		cashierPane = new JPanel();
		cashierPane.setBackground(SystemColor.scrollbar);
		cashierPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cashierPane);
		cashierPane.setLayout(null);
		
		textBillNo1 = new JTextField();
		textBillNo1.setHorizontalAlignment(SwingConstants.CENTER);
		textBillNo1.setBackground(SystemColor.textHighlight);
		textBillNo1.setFont(new Font("Tahoma", Font.BOLD, 12));
		textBillNo1.setBounds(37, 126, 77, 23);
		cashierPane.add(textBillNo1);
		textBillNo1.setColumns(10);
	
		btnAdmin = new JButton("LogIn");
		btnAdmin.setBackground(UIManager.getColor("Tree.selectionBackground"));
		btnAdmin.setForeground(new Color(0, 0, 139));
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login admin = new Login();
				Login.main(null);
			//	Login.setVisible(true);
				dispose(); 
	/*				try{
				
				}catch(NumberFormatException e){
					System.out.println("NO number inserted! or invalid number");
				}		
	*/	
				try {
				
					
					
				} catch (Exception eu) {
					eu.printStackTrace();
					System.out.println(e);
				}
				finally{
					System.out.println( "Data insertion complete!");
				}
			
			}
		});
		

		btnAdmin.setBounds(690, 22, 71, 38);
		cashierPane.add(btnAdmin);
	
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setBackground(UIManager.getColor("Tree.selectionBackground"));
		btnLoad.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		btnLoad.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			try{
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurent_management","root","");
					
					Statement load1 = conn.createStatement();
					Statement loadx2 = conn.createStatement();
					
					String sql = "Select * from ordert where OType = 'food' AND Order_Num='"+textBillNo1.getText().toString()+"'";

			//		String sqlx2 = "SELECT discount FROM discount WHERE ItemId=(Select ItemId from ordert where OType = 'food' AND Order_Num='"+textBillNo.getText().toString()+"')";
					
					
			//		String sqlx2 = "SELECT discount FROM discount WHERE ItemId=(Select ItemId from ordert where OType = 'food' AND Order_Num='3')";					
					
			//		String sqlx2 = "Select * from ordert where OType = 'food' AND Order_Num='"+textBillNo.getText().toString()+"'";
					

					
					ResultSet rs = load1.executeQuery(sql);
			/* foreign keys*/
					ResultSet rsx2 = loadx2.executeQuery("select * from discount");
					
					
					DefaultTableModel tm = new DefaultTableModel();
					tm = (DefaultTableModel)table_1.getModel();
				
					while(rs.next()  ){//&& rsx2.next()
						tm.addRow(new Object[]{
						
								rs.getInt(2),
								rs.getInt(1),
								rs.getString(4),
								rs.getDouble(10),//UnitPrice
								rs.getInt(6),		
								rs.getDouble(11),	//Total
								rs.getDouble(10),	//discount 11
								
								//rsx2.getDouble(3),
				
					});
				}//while1
					
					for(int i=0; i<tm.getRowCount();i++){
						Double d1  =((Double)tm.getValueAt(i, 5));
				//		System.out.println("d1>>>"+d1);
						Double d2  = ((Double)tm.getValueAt(i, 6));
				//		System.out.println("d2>>>"+d2);
						Double gTot =(d1-(d1*(d2/100))); /*discount */
				//		System.out.println(gTot);
						tm.setValueAt(gTot, i, 7);				
					}
					
					
		//Get total of the table
					
					for(int i=0 ; i<table_1.getRowCount();i++){
						if(table_1.getRowCount() > i){
							totTable1 = totTable1 + ((Double)tm.getValueAt(i,7));
							System.out.println("TotSum table1  >> "+ totTable1 + "   "+ i);		
							
						}
					}
					tbleSum1 = totTable1;//pass the value to calculate sum
					System.out.println("<<<<<<<<<<<<<<<<<<<"+tbleSum1);
					
					//set the value to total text below before totTable1 = 0
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>"+tbleSum1);
					totTable1 = 0; //To get the exact sum=
	
						table_1.setModel(tm);

	Total = tbleSum1+ tbleSum2 + tbleSum3	;	//,tbleSum2,tbleSum3	
	textTotal.setText(String.valueOf(Total));
	System.out.println(Total);	
						
		//try				
					
			}catch(Exception ex1){
					System.out.println(ex1);
			}
			
		
			
		}});
		btnLoad.setBounds(142, 126, 77, 27);
		cashierPane.add(btnLoad);
		
		textTotal = new JTextField();
		textTotal.setBackground(Color.CYAN);
		textTotal.setBounds(1005, 62, 159, 28);
		cashierPane.add(textTotal);
		textTotal.setColumns(10);
	
		
		textPayment = new JTextField();
		textPayment.setBackground(Color.WHITE);
		textPayment.setBounds(1005, 126, 159, 28);
		cashierPane.add(textPayment);
		textPayment.setColumns(10);
		
		textBalance = new JTextField();
		textBalance.setBackground(SystemColor.text);
		textBalance.setBounds(1005, 227, 159, 30);
		cashierPane.add(textBalance);
		textBalance.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total  (Rs.):");
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblTotal.setBounds(1005, 38, 82, 14);
		cashierPane.add(lblTotal);
		
		JLabel lblPayment = new JLabel("Payment (Rs.) :");
		lblPayment.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPayment.setBounds(1005, 112, 102, 14);
		cashierPane.add(lblPayment);
		
		JLabel lblBalance = new JLabel("Balance (Rs.) :");
		lblBalance.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblBalance.setBounds(1005, 202, 120, 14);
		cashierPane.add(lblBalance);
		
		JTextArea textBill = new JTextArea();
		textBill.setBounds(976, 346, 248, 355);
		cashierPane.add(textBill);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnUpdate.setBounds(578, 329, 89, 30);
		cashierPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//table_1.remove(table_1.getSelectedRow());
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnDelete.setBounds(721, 329, 89, 30);
		cashierPane.add(btnDelete);
		
		buttonpRINT = new JButton("PRINT");
		buttonpRINT.setBackground(UIManager.getColor("Tree.selectionBackground"));
		buttonpRINT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
/*tablle1*/			
					
					String type1 = "food";
					String date = java.time.LocalDate.now().toString();
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MMM-dd");
				//	String dateXX = format.toString();
				//	Date date = new Date(System.currentTimeMillis());
					System.out.println(java.time.LocalDate.now());
					
					int rows = table_1.getRowCount();
					for(int row=0; row<rows ;row++){
					
				try{	
						int billId = (int)table_1.getValueAt(row, 0);
						int itemId = (int)table_1.getValueAt(row, 1);
						String itemName = (String)table_1.getValueAt(row, 2);
						double unitPrice = (double)table_1.getValueAt(row, 3);
						int quan = (int)table_1.getValueAt(row, 4);
						double dis = (double)table_1.getValueAt(row, 5);
						double total = (double)table_1.getValueAt(row, 6);
						double totAfter = (double)table_1.getValueAt(row, 7);
	
						String Type = type1;
				//		String date = (String)table_1.getValueAt(row, 0);
					
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurent_management","root","");
						
						String query = "INSERT into billinventory(BillId,ItemID,ItemName,unitPrice,quantity,total,discount,totalAfter,Type,date) VALUES(?,?,?,?,?,?,?,?,?,?)";
						PreparedStatement smt = conn.prepareStatement(query);
						smt.setInt(1, billId);
						smt.setInt(2, itemId);
						smt.setString(3, itemName);
						smt.setDouble(4, unitPrice);
						smt.setInt(5, quan);
						smt.setDouble(6, dis);
						smt.setDouble(7, total);
						smt.setDouble(8, totAfter);
						smt.setString(9, type1);
						smt.setString(10, date);

						smt.addBatch();
						smt.executeBatch();
					//	conn.commit();
		}catch(Exception insert1){
			System.out.println(insert1);
			JOptionPane.showMessageDialog(null, "DATA insertion failed !");
		}//catch
			}//for		
/*table1*/		/*	
					int rows2 = table_3.getRowCount();
					for(int row=0; row<rows2 ;row++){
				
				try{	
						int billId = (int)table_3.getValueAt(row, 0);
					//	int itemId = (int)table_3.getValueAt(row, 1);
						String itemName = (String)table_3.getValueAt(row, 1);
					//	double unitPrice = (double)table_3.getValueAt(row, 3);
						int quan = (int)table_3.getValueAt(row, 2);
						double dis = (double)table_3.getValueAt(row, 4);
						double total = (double)table_3.getValueAt(row, 3);
						double totAfter = (double)table_3.getValueAt(row, 5);
	
						int tempi =0;
						Double tempd = (double) 0;
						String temps = "pub";
						String Type = "pub";
				//		String date = (String)table_1.getValueAt(row, 0);
					
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurent_management","root","");
						
						String query = "INSERT into billinventory(BillId,ItemID,ItemName,unitPrice,quantity,total,discount,totalAfter,Type,date) VALUES(?,?,?,?,?,?,?,?,?,?)";
						PreparedStatement smt = conn.prepareStatement(query);
						smt.setInt(1, billId);
						smt.setInt(2, tempi);
						smt.setString(3, itemName);
						smt.setDouble(4, tempd);
						smt.setInt(5, quan);
						smt.setDouble(6, dis);
						smt.setDouble(7, total);
						smt.setDouble(8, totAfter);
						smt.setString(9, Type);
						smt.setString(10, date);

						smt.addBatch();
						smt.executeBatch();
					//	conn.commit();
		}catch(Exception insert1){
			System.out.println(insert1);
			JOptionPane.showMessageDialog(null, "DATA insertion failed !");
		}//catch
			}//for	
			
				*/
/*table1*/				
					
					
					
					
					JOptionPane.showMessageDialog(null, "DATA insertion Successfull !");
				
			}//print
		});
		buttonpRINT.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		buttonpRINT.setBounds(1005, 291, 159, 44);
		cashierPane.add(buttonpRINT);
		
		JPanel panelStatus = new JPanel();
		panelStatus.setBounds(10, 11, 590, 90);
		cashierPane.add(panelStatus);
		panelStatus.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image Img_logo = new ImageIcon(this.getClass().getResource("/logo.png")).getImage().getScaledInstance(130, 90, Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(Img_logo));
		lblNewLabel.setBounds(0, 0, 169, 90);
		panelStatus.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DATE_TIME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(147, 11, 98, 14);
		panelStatus.add(lblNewLabel_1);
	
		JLabel lblCashierId = new JLabel("CASHIER ID");
		lblCashierId.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblCashierId.setBounds(146, 48, 99, 14);
		panelStatus.add(lblCashierId);
		
		JLabel lblStatus = new JLabel("STATUS");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblStatus.setBounds(399, 48, 46, 14);
		panelStatus.add(lblStatus);
		
		JLabel lbldateX = new JLabel("");
		lbldateX.setBounds(255, 11, 158, 14);
		panelStatus.add(lbldateX);
		
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
			Date date = new Date(System.currentTimeMillis());
			lbldateX.setText(format.format(date));
			
		System.out.println(java.time.LocalDateTime.now());	
	//	System.out.println(java.clock.systemUTC().instant());
		
		JLabel labelClose = new JLabel("");
		labelClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int a = JOptionPane.showConfirmDialog(labelClose, "Are You Sure ! ");
				if(a==JOptionPane.YES_OPTION){
					dispose();
				}
			}
		});
		Image Img_Close = new ImageIcon(this.getClass().getResource("/close.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		labelClose.setIcon(new ImageIcon(Img_Close));
		labelClose.setBounds(1189, 11, 35, 35);
		cashierPane.add(labelClose);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(104, 194, 719, 124);
		cashierPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				
			},
			new String[] {
				"BillID", "ItemID", "Item_Name", "Unit_Price", "Quantity", "Total", "Discount%", "TotalAfter"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Double.class, Integer.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.setBackground(SystemColor.scrollbar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(104, 408, 723, 110);
		cashierPane.add(scrollPane);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
				new Object[][] {
				
				},
				new String[] {
					"BillID", "ItemID", "ItemName", "No.Of_People", "Total", "Discount%", "TotalAfter"
				}
			) {
				Class[] columnTypes = new Class[] {
					String.class, String.class, String.class, String.class, Double.class, Double.class, Double.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
			table_2.getColumnModel().getColumn(3).setPreferredWidth(95);
		scrollPane.setViewportView(table_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(104, 587, 723, 78);
		cashierPane.add(scrollPane_2);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
				new Object[][] {
				
				},
				new String[] {
						"OrderID", "ItemName", "Quantity", "TotalPrice", "Type", "Discount%", "TotalAfter"
						//Integer.class, String.class, Integer.class, Double.class, String.class, Double.class, Double.class
				}
			) {
				Class[] columnTypes = new Class[] {
						Integer.class, String.class, Integer.class, Double.class, String.class, Double.class, Double.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
		scrollPane_2.setViewportView(table_3);
		
		JButton button = new JButton("Update");
		button.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button.setBounds(578, 529, 89, 30);
		cashierPane.add(button);
		
		JButton button_1 = new JButton("Delete");
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_1.setBounds(721, 529, 89, 30);
		cashierPane.add(button_1);
		
		JButton button_2 = new JButton("Update");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_2.setBounds(578, 671, 89, 30);
		cashierPane.add(button_2);
		
		JButton button_3 = new JButton("Delete");
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_3.setBounds(721, 671, 89, 30);
		cashierPane.add(button_3);
		
		JLabel lblEnterBillNo = new JLabel("Enter Bill No :");
		lblEnterBillNo.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEnterBillNo.setBounds(20, 112, 89, 14);
		cashierPane.add(lblEnterBillNo);
		
		JLabel label = new JLabel("PUB :");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(104, 567, 46, 14);
		cashierPane.add(label);
		
		JLabel label_1 = new JLabel("RESERVATION :");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(104, 381, 92, 14);
		cashierPane.add(label_1);
		
		JLabel label_2 = new JLabel("FOOD :");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setBounds(104, 164, 92, 14);
		cashierPane.add(label_2);
		
		JButton btnBack = new JButton("Main Menu");
		btnBack.setHorizontalAlignment(SwingConstants.LEADING);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setBounds(778, 22, 102, 38);
		cashierPane.add(btnBack);
		
		JLabel label_3 = new JLabel("Enter Bill No :");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_3.setBounds(20, 322, 89, 14);
		cashierPane.add(label_3);
		
		textBillNo2 = new JTextField();
		textBillNo2.setHorizontalAlignment(SwingConstants.CENTER);
		textBillNo2.setFont(new Font("Tahoma", Font.BOLD, 12));
		textBillNo2.setColumns(10);
		textBillNo2.setBackground(SystemColor.textHighlight);
		textBillNo2.setBounds(37, 336, 77, 23);
		cashierPane.add(textBillNo2);
		
		JLabel label_4 = new JLabel("Enter Bill No :");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label_4.setBounds(20, 529, 89, 14);
		cashierPane.add(label_4);
		
		textBillNo3 = new JTextField();
		textBillNo3.setHorizontalAlignment(SwingConstants.CENTER);
		textBillNo3.setFont(new Font("Tahoma", Font.BOLD, 12));
		textBillNo3.setColumns(10);
		textBillNo3.setBackground(SystemColor.textHighlight);
		textBillNo3.setBounds(37, 543, 77, 23);
		cashierPane.add(textBillNo3);
		
		JButton button_resLoad = new JButton("Load");
		button_resLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurent_management","root","");
						
						
					Statement load2 = conn.createStatement();
					String sql2 = "Select * from ordert where OType='rese' AND Order_Num='"+textBillNo2.getText().toString()+"'";
					ResultSet rs2 = load2.executeQuery(sql2);	
						
					DefaultTableModel table2 = new DefaultTableModel();
					table2 = (DefaultTableModel)table_2.getModel();	
					while(rs2.next()){
						table2.addRow(new Object[]{
						
								rs2.getInt(2),
								rs2.getInt(5),
								rs2.getString(4),
								rs2.getDouble(7),
								rs2.getDouble(11),		
					});
						
						for(int i=0; i<table2.getRowCount();i++){
							Double d1  =((Double)table2.getValueAt(i, 5));
							System.out.println("d1>>>"+d1);
							Double d2  = ((Double)table2.getValueAt(i, 6));
							System.out.println("d2>>>"+d2);
							Double gTot =(d1-(d1*(d2/100))); /*discount */
							System.out.println(gTot);
							table2.setValueAt(gTot, i, 7);				
						}	
						
						
						table_2.setModel(table2);	
					}//while2	
					
					
				}catch(Exception table2){
					System.out.println(table2);
				}//catch
				
			}
		});
		button_resLoad.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_resLoad.setBounds(142, 336, 89, 30);
		cashierPane.add(button_resLoad);
		
		JButton button_pub = new JButton("Load");
		button_pub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					try{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","");
							
							
						Statement load3 = conn.createStatement();
						String sql3 = "Select * from order_table WHERE OrderID='"+textBillNo3.getText().toString()+"'";
						ResultSet rs3 = load3.executeQuery(sql3);	
							
						DefaultTableModel table3 = new DefaultTableModel();
						table3 = (DefaultTableModel)table_3.getModel();	
						while(rs3.next()){
							table3.addRow(new Object[]{
							/*"OrderID", "ItemName", "Quantity", "TotalPrice", "Type", "Discount%", "TotalAfter"
						//Integer.class, String.class, Integer.class, Double.class, String.class, Double.class, Double.class*/
								
									rs3.getInt(1),
									rs3.getString(3),
									rs3.getInt(2),
									rs3.getDouble(4),
									rs3.getString(5),
								/*	rs3.getDouble(7),
									rs3.getDouble(11),
									*/
						});
							
							
							for(int i=0; i<table3.getRowCount();i++){
								Double d1  =((Double)table3.getValueAt(i, 5));
								System.out.println("d1>>>"+d1);
								Double d2  = ((Double)table3.getValueAt(i, 6));
								System.out.println("d2>>>"+d2);
								Double gTot =(d1-(d1*(d2/100))); /*discount */
								System.out.println(gTot);
								table3.setValueAt(gTot, i, 7);				
							}		
							
							double dGTot1 = 0;
							double dTot1 = 0;
							for(int i=0; i<table3.getRowCount();i++){
								dTot1  =((Double)table3.getValueAt(i, 7));
								System.out.println("d1>>>"+dTot1);
								dGTot1  = dGTot1 + dTot1;
								System.out.println("d2>>>"+ dGTot1);
			
								System.out.println(dGTot1);		
							}
		
							table_3.setModel(table3);	
						}//while2	
						
						
					}catch(Exception table3){
						System.out.println(table3);
					}
			
			}
		});
		button_pub.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		button_pub.setBounds(142, 546, 89, 30);
		cashierPane.add(button_pub);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textPayment.getText().equals("") ){
					JFrame f;	
					f = new JFrame();
					JOptionPane.showMessageDialog(f, "Please Enter Payment Amount");

					/*	int a = JOptionPane.showConfirmDialog(labelClose, "Please Enter Payment Amount! ");
					if(a==JOptionPane.YES_OPTION){
						dispose();
					}
				*/	
				}else{
					double temp = Double.parseDouble(textPayment.getText()) - Double.parseDouble(textTotal.getText()) ;
					System.out.println(temp);
					textBalance.setText(String.valueOf(temp));
				}
				
				
				
/*				//display total
			Total = tbleSum1+ tbleSum2 + tbleSum3	;	//,tbleSum2,tbleSum3	
			textTotal.setText(String.valueOf(Total));
			System.out.println(Total);
*/				
			}
		});
		btnCalculate.setBounds(1080, 165, 89, 25);
		cashierPane.add(btnCalculate);
	

	}//class
}//frame
