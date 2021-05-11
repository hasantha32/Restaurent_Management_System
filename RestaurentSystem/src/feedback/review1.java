package feedback;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;

import services.FeedbackService;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class review1 extends JFrame{

	private JFrame frame;
	private JTextField txtR;
	private ButtonGroup bg = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					review1 window = new review1();
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
	public review1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 1422, 736);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtR = new JTextField();
		txtR.setEditable(false);
		txtR.setText("                                                                                      REVIEWS");
		txtR.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtR.setColumns(10);
		
		txtR.setBounds(0, 42, 1412, 82);
		frame.getContentPane().add(txtR);
		
		JTextArea txtrHowIsOur = new JTextArea();
		txtrHowIsOur.setEditable(false);
		txtrHowIsOur.setText("How is our service");
		txtrHowIsOur.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
		
		txtrHowIsOur.setBounds(170, 150, 513, 29);
		frame.getContentPane().add(txtrHowIsOur);
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Excellent");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(230, 229, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Excellent");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(230, 385, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Excellent");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_2.setBounds(230, 535, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnVeryGood = new JRadioButton("Very Good");
		rdbtnVeryGood.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnVeryGood.setBounds(448, 231, 131, 19);
		frame.getContentPane().add(rdbtnVeryGood);
		
		JRadioButton rdbtnVeryGood_1 = new JRadioButton("Very Good");
		rdbtnVeryGood_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnVeryGood_1.setBounds(448, 385, 131, 19);
		frame.getContentPane().add(rdbtnVeryGood_1);
		
		JRadioButton rdbtnVeryGood_2 = new JRadioButton("Very Good");
		rdbtnVeryGood_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnVeryGood_2.setBounds(448, 536, 131, 19);
		frame.getContentPane().add(rdbtnVeryGood_2);
		
		JRadioButton rdbtnGood = new JRadioButton(" Good");
		rdbtnGood.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnGood.setBounds(682, 231, 131, 19);
		frame.getContentPane().add(rdbtnGood);
		
		JRadioButton rdbtnGood_1 = new JRadioButton(" Good");
		rdbtnGood_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnGood_1.setBounds(682, 387, 131, 19);
		frame.getContentPane().add(rdbtnGood_1);
		
		JRadioButton rdbtnGood_2 = new JRadioButton(" Good");
		rdbtnGood_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnGood_2.setBounds(682, 536, 131, 19);
		frame.getContentPane().add(rdbtnGood_2);
		
		JRadioButton rdbtnAve = new JRadioButton("Average");
		rdbtnAve.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAve.setBounds(915, 231, 131, 19);
		frame.getContentPane().add(rdbtnAve);
		
		JRadioButton rdbtnAve_1 = new JRadioButton("Average");
		rdbtnAve_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAve_1.setBounds(915, 387, 131, 19);
		frame.getContentPane().add(rdbtnAve_1);
		
		JRadioButton rdbtnAve_2 = new JRadioButton("Average");
		rdbtnAve_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnAve_2.setBounds(915, 536, 131, 19);
		frame.getContentPane().add(rdbtnAve_2);
		
		JRadioButton rdbtnPoor = new JRadioButton("Poor");
		rdbtnPoor.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnPoor.setBounds(1150, 231, 131, 19);
		frame.getContentPane().add(rdbtnPoor);
		
		JRadioButton rdbtnPoor_1 = new JRadioButton("Poor");
		rdbtnPoor_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnPoor_1.setBounds(1150, 387, 131, 19);
		frame.getContentPane().add(rdbtnPoor_1);
		
		JRadioButton rdbtnPoor_2 = new JRadioButton("Poor");
		rdbtnPoor_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnPoor_2.setBounds(1150, 536, 131, 19);
		frame.getContentPane().add(rdbtnPoor_2);
		
		JTextArea txtrHowIsOur_1 = new JTextArea();
		txtrHowIsOur_1.setEditable(false);
		txtrHowIsOur_1.setText("How is our experience");
		txtrHowIsOur_1.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));

		txtrHowIsOur_1.setBounds(170, 312, 513, 29);
		frame.getContentPane().add(txtrHowIsOur_1);
		
		JTextArea txtrHowIsOur_1_1 = new JTextArea();
		txtrHowIsOur_1_1.setEditable(false);
		txtrHowIsOur_1_1.setText("How is our food");
		txtrHowIsOur_1_1.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 18));
		
		txtrHowIsOur_1_1.setBounds(170, 479, 513, 29);
		frame.getContentPane().add(txtrHowIsOur_1_1);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(rdbtnNewRadioButton);
		group1.add(rdbtnVeryGood);
		group1.add(rdbtnGood);
		group1.add(rdbtnAve);
		group1.add(rdbtnPoor);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(rdbtnNewRadioButton_1);
		group2.add(rdbtnVeryGood_1);
		group2.add(rdbtnGood_1);
		group2.add(rdbtnAve_1);
		group2.add(rdbtnPoor_1);
		
		
		

		ButtonGroup group3 = new ButtonGroup();
		group3.add(rdbtnNewRadioButton_2);
		group3.add(rdbtnVeryGood_2);
		group3.add(rdbtnGood_2);
		group3.add(rdbtnAve_2);
		group3.add(rdbtnPoor_2);
		
		
		
		JButton btnSubmitReviews = new JButton("Submit reviews");
		btnSubmitReviews.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if(getSelectedButtonText(group1) == null|| getSelectedButtonText(group2) == null||getSelectedButtonText(group3) == null) {
				JOptionPane.showMessageDialog(null, "Enter all feilds");
			}else {
				int a=JOptionPane.showConfirmDialog(btnSubmitReviews,"Are Yor Sure","efefefefe", JOptionPane.YES_NO_OPTION);
				if(a==JOptionPane.YES_OPTION) {
					
					FeedbackService service = new FeedbackService();
					service.addreview(getSelectedButtonText(group1), getSelectedButtonText(group2), getSelectedButtonText(group3));
					
					Feedbacknreview logodut=new Feedbacknreview ();
					Feedbacknreview .main(null);
					frame.setVisible(false);
					
					
					
				}else {
			}
			}
				
				
		}
		});
		
		
		
		
		btnSubmitReviews.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSubmitReviews.setBounds(1130, 612, 155, 37);
		frame.getContentPane().add(btnSubmitReviews);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Feedbacknreview feed = new Feedbacknreview();
				Feedbacknreview.main(null);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(1273, 165, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}
	
	public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
	
	
	
}

