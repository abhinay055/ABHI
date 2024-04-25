package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metro {

	private JFrame frame;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
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
	public metro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(79, 11, 267, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(20, 70, 59, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tf = new JTextField();
		tf.setBounds(105, 67, 86, 20);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setBounds(20, 115, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION");
		lblNewLabel_3.setBounds(20, 158, 72, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_4.setBounds(225, 70, 121, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("JOURNEY DATE");
		lblNewLabel_5.setBounds(225, 115, 94, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "JNTU", "KPHB", "AMEERPET", "MIYAPUR"}));
		cb1.setBounds(105, 111, 86, 22);
		frame.getContentPane().add(cb1);
		
		JSpinner s1 = new JSpinner();
		s1.setModel(new SpinnerNumberModel(0, null, 10, 1));
		s1.setBounds(351, 64, 46, 20);
		frame.getContentPane().add(s1);
		
		JSpinner s2 = new JSpinner();
		s2.setModel(new SpinnerDateModel(new Date(1713886200000L), new Date(1713810600000L), new Date(1714415400000L), Calendar.DAY_OF_WEEK_IN_MONTH));
		s2.setBounds(314, 112, 110, 20);
		frame.getContentPane().add(s2);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "JNTU", "MIYAOUR", "NIZAMPET"}));
		cb2.setBounds(105, 154, 86, 22);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_6 = new JLabel("NUMBER TICKETS");
		lblNewLabel_6.setBounds(225, 158, 94, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JSpinner s3 = new JSpinner();
		s3.setModel(new SpinnerNumberModel(1, null, 10, 1));
		s3.setBounds(351, 155, 46, 20);
		frame.getContentPane().add(s3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tf.getText();
				String source= (String)cb1.getSelectedItem();
				String dest=(String)cb2.getSelectedItem();
				int nt= (int) s1.getValue();
				String date= "15-11-2024 21:21:77";
				int bill=0;
				if(nt>=1) {
					bill=bill+nt*30;
				}
				if(source.equals(dest)) {
					JOptionPane.showMessageDialog(btnNewButton, "invalid stations");		
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "NAME :"+ name + "\n SOURCE :"+source+"\n DESTINATION "+dest+
							"\n NUMBER OF TICKETS :" + nt+ "\n DATE :" + date + "\n total bill :"+bill+"\n*!!!!!HAPPY JOURNEY!!!!!");
							
							
						
				}
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(159, 209, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
