package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class movieticket {

	protected static final int YES_OPTION = 0;
	private JFrame frame;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieticket window = new movieticket();
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
	public movieticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(90, 21, 263, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel KHWGBFHS = new JLabel("NAME");
		KHWGBFHS.setFont(new Font("Tahoma", Font.BOLD, 13));
		KHWGBFHS.setBounds(31, 74, 46, 14);
		frame.getContentPane().add(KHWGBFHS);
		
		tf1 = new JTextField();
		tf1.setBounds(227, 71, 86, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(31, 124, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KGF", "SALAR", "TILLU SQUARE"}));
		cb1.setBounds(227, 121, 77, 22);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_3 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(31, 176, 130, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8"}));
		cb2.setBounds(227, 172, 77, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tf1.getText();
				String movie = (String)cb1.getSelectedItem();
				String tickets=(String)cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("KGF")) {
					bill=bill+nt*150;
				}
				if(movie.equals("SALAR")) {
					bill=bill+nt*200;
				}
				if(movie.equals("TILLU SQUARE")) {
					bill=bill+nt*250;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "NAME :" +name + "\n MOVIE NAME :"+ movie + "\n NUMBER TICKETS :"+nt + "\n total bill : "+ bill );
				if(res==YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CONFORMED");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "booking cancelled");
				}
		
			}
		});
		btnNewButton.setBounds(161, 270, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Book");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\360_F_255676210_fiOrmx7LosKnQrtNrWPllUrunUkqTuCy.jpg"));
		lblNewLabel_1.setBounds(0, 0, 461, 315);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Book ");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(339, 56, 70, 32);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblBook = new JLabel("Book");
		lblBook.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBook.setBounds(349, 75, 46, 14);
		frame.getContentPane().add(lblBook);
	}
}
