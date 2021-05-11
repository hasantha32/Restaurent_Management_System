package logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminDashboard extends JFrame {

	private JPanel adminPane;
	
	private PanelTotalSales panelTotalSales;
	private PanelDiscount panelDiscount;
	private PanelBill panelBill;
	private PanelReports panelReports;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard frame = new AdminDashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminDashboard() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);

		setUndecorated(true);
		setLocationRelativeTo(null);

	
		
		adminPane = new JPanel();
		adminPane.setForeground(new Color(0, 0, 0));
		adminPane.setBackground(Color.GRAY);
		adminPane.setBorder(new LineBorder(new Color(105, 105, 105), 2));
		setContentPane(adminPane);
		
	/*setting panels*/	
		panelTotalSales = new PanelTotalSales();
		panelTotalSales.setSize(800, 550);
		panelDiscount = new PanelDiscount();
		panelBill = new PanelBill();
		panelReports = new PanelReports();
		
		
		JPanel panelCAdmin = new JPanel();
		panelCAdmin.setBounds(4, 115, 229, 550);
		panelCAdmin.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelCAdmin.setBackground(new Color(0, 0, 128));
		panelCAdmin.setLayout(null);
	
		JLabel labelLogo = new JLabel("");
		labelLogo.setBounds(10, 11, 140, 80);
		//Image Img_Logo = new ImageIcon(this.getClass().getResource("/logo.png")).getImage().getScaledInstance(140, 90, Image.SCALE_SMOOTH);
		//labelLogo.setIcon(new ImageIcon(Img_Logo));
		
		
		JLabel lblIcon = new JLabel("");
		//Image Img_cAdmin = new ImageIcon(this.getClass().getResource("/Admin2.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
		//lblIcon.setIcon(new ImageIcon(Img_cAdmin));
		lblIcon.setToolTipText("Logo");
		lblIcon.setBounds(10, 11, 191, 101);
		panelCAdmin.add(lblIcon);
		
		JPanel panelTSales = new JPanel();
		panelTSales.addMouseListener(new PanelButtonMouseAdapter(panelTSales){
			@Override
			public void mouseClicked(MouseEvent e){
				menuClicked(panelTSales);
			}
		});
		panelTSales.setForeground(new Color(0, 0, 0));
		panelTSales.setBorder(new LineBorder(new Color(105, 105, 105), 2));
		panelTSales.setBackground(new Color(128, 128, 128));
		panelTSales.setBounds(0, 123, 229, 42);
		panelCAdmin.add(panelTSales);
		panelTSales.setLayout(null);
		
		JLabel lblTotalSales = new JLabel("TOTAL SALES");
		lblTotalSales.setForeground(new Color(135, 206, 235));
		lblTotalSales.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTotalSales.setBounds(32, 11, 107, 20);
		panelTSales.add(lblTotalSales);
		
		JLabel lblIconSales = new JLabel("");
	/*	Image Img_sales = new ImageIcon(this.getClass().getResource("/2.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		lblIconSales.setIcon(new ImageIcon(Img_sales));
		*/
		lblIconSales.setBounds(2, 15, 20, 15);
		panelTSales.add(lblIconSales);
		
		JPanel paneDiscount = new JPanel();
		paneDiscount.addMouseListener(new PanelButtonMouseAdapter(panelDiscount){
			@Override
			public void mouseClicked(MouseEvent e){
				menuClicked(panelDiscount);
			}
		});
		paneDiscount.setForeground(new Color(0, 0, 0));
		paneDiscount.setBorder(new LineBorder(new Color(105, 105, 105), 2));
		paneDiscount.setBackground(new Color(128, 128, 128));
		paneDiscount.setBounds(0, 177, 229, 42);
		panelCAdmin.add(paneDiscount);
		paneDiscount.setLayout(null);
		
		JLabel lblAddDiscount = new JLabel("REMOVE / UPDATE DISCOUNT");
		lblAddDiscount.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAddDiscount.setBackground(new Color(135, 206, 235));
		lblAddDiscount.setForeground(new Color(135, 206, 250));
		lblAddDiscount.setBounds(33, 11, 186, 14);
		paneDiscount.add(lblAddDiscount);
		
		JLabel lblIconDiscount = new JLabel("");
	/*	Image Img_discount = new ImageIcon(this.getClass().getResource("/1.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		lblIconDiscount.setIcon(new ImageIcon(Img_discount));
		*/
		lblIconDiscount.setBounds(2, 15, 20, 15);
		paneDiscount.add(lblIconDiscount);
		
		JPanel paneBill = new JPanel();
		paneBill.addMouseListener(new PanelButtonMouseAdapter(panelBill){
			@Override
			public void mouseClicked(MouseEvent e){
				menuClicked(panelBill);
			}
		});
		paneBill.setForeground(new Color(0, 0, 0));
		paneBill.setBorder(new LineBorder(new Color(105, 105, 105)));
		paneBill.setBackground(new Color(128, 128, 128));
		paneBill.setBounds(0, 230, 229, 42);
		panelCAdmin.add(paneBill);
		paneBill.setLayout(null);
		
		JLabel lblBillDetails = new JLabel("BILL DETAILS");
		lblBillDetails.setForeground(new Color(135, 206, 250));
		lblBillDetails.setFont(new Font("Dialog", Font.BOLD, 12));
		lblBillDetails.setBounds(34, 11, 138, 20);
		paneBill.add(lblBillDetails);
		
		JLabel lblIconBill = new JLabel("");
	/*	Image Img_bill = new ImageIcon(this.getClass().getResource("/1.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		lblIconBill.setIcon(new ImageIcon(Img_bill));
		*/
		lblIconBill.setBounds(2, 15, 20, 15);
		paneBill.add(lblIconBill);
		
		JPanel paneReports = new JPanel();
		paneReports.addMouseListener(new PanelButtonMouseAdapter(panelReports){
			@Override
			public void mouseClicked(MouseEvent e){
				menuClicked(panelReports);
			}
		});
		paneReports.setForeground(new Color(0, 0, 0));
		paneReports.setBorder(new LineBorder(new Color(105, 105, 105), 2));
		paneReports.setBackground(new Color(128, 128, 128));
		paneReports.setBounds(0, 283, 229, 42);
		panelCAdmin.add(paneReports);
		paneReports.setLayout(null);
		
		JLabel lblGenerateReports = new JLabel("GENERATE REPORTS");
		lblGenerateReports.setForeground(new Color(135, 206, 235));
		lblGenerateReports.setFont(new Font("Dialog", Font.BOLD, 12));
		lblGenerateReports.setBounds(34, 11, 185, 14);
		paneReports.add(lblGenerateReports);
		
		JLabel lblIconReport = new JLabel("");
	/*	Image Img_Reports = new ImageIcon(this.getClass().getResource("/1.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		lblIconReport.setIcon(new ImageIcon(Img_Reports));
		*/
		lblIconReport.setBounds(2, 15, 20, 15);
		paneReports.add(lblIconReport);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(4, 102, 1050, 2);
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		
		JLabel lblExit = new JLabel("");
		lblExit.setBounds(1024, 11, 30, 30);
	//	lblExit.setHorizontalAlignment(SwingConstant.CENTER);
		Image Img_Exit = new ImageIcon(this.getClass().getResource("/close.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		lblExit.setIcon(new ImageIcon(Img_Exit));
		lblExit.setFont(new Font("Serif", Font.PLAIN, 11));
		lblExit.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0){
				//if(JOptionPane.showConfirmDialog(null, "Are You sure you want to close this application ? ","Confirmation",JOptionPane.OK_CANCEL_OPTION)==0);
	/*set the frame cashierLogin visible		*/
				int a = JOptionPane.showConfirmDialog(lblExit, "Are You Sure ! ");
				if(a==JOptionPane.YES_OPTION){
					AdminDashboard.this.dispose();
				}
				
				//	AdminDashboard.this.dispose();
				}
			@Override
			public void mouseEntered(MouseEvent e){
				lblExit.setForeground(Color.RED);
			}
			
			@Override
			public void mouseExited(MouseEvent e){
				lblExit.setForeground(Color.WHITE);
			}
		});
		
		JPanel panelMainContent = new JPanel();
		panelMainContent.setBounds(243, 117, 800, 550);
		panelMainContent.setLayout(null);
/*		*/
		panelMainContent.add(panelTotalSales);
		panelMainContent.add(panelDiscount);
		panelMainContent.add(panelBill);
		panelMainContent.add(panelReports);
	
		menuClicked(panelTotalSales);
		adminPane.setLayout(null);
		adminPane.add(panelCAdmin);
		adminPane.add(labelLogo);
		adminPane.add(separator);
		adminPane.add(lblExit);
		adminPane.add(panelMainContent);
		
		JButton btnNewButton = new JButton("LOG OUT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Login admin = new Login();
				Login.main(null);
				dispose(); 
				
				
			}
		});
		btnNewButton.setBounds(906, 32, 86, 30);
		adminPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("ADMIN PANEL");
		lblNewLabel.setForeground(UIManager.getColor("Tree.selectionBackground"));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(429, 22, 384, 44);
		adminPane.add(lblNewLabel);
				
	}
	
/*set visibility of panels*/
	
	public void menuClicked(JPanel panel){
		/**/
		panelTotalSales.setVisible(false);
		panelDiscount.setVisible(false);
		panelBill.setVisible(false);
		panelReports.setVisible(false);
	
		panel.setVisible(true);
	}
	
/* Give graphical mouse hover */	
	private class PanelButtonMouseAdapter extends MouseAdapter{
	
		JPanel panel; 
		
		public PanelButtonMouseAdapter(JPanel panel){
			this.panel = panel;
		}
		
		@Override
		public void mouseEntered(MouseEvent e){
			panel.setBackground(new Color(147, 167, 171));	//112, 128, 140
		}
		
		@Override
		public void mouseExited(MouseEvent e){
			panel.setBackground(new Color(150, 171, 147)); //49, 79, 79
		}
		
		@Override
		public void mousePressed(MouseEvent e){
			panel.setBackground(new Color(150, 171, 147));	//60, 179, 113 *
		}
		
		@Override
		public void mouseReleased(MouseEvent e){
			panel.setBackground(new Color(150, 171, 147));	//112, 128, 144    150, 171, 147**
		}
	}
}
