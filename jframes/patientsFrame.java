package jframes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class patientsFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					patientsFrame frame = new patientsFrame();
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
	public patientsFrame() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 809, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(36, 30, 100, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblSurname = new JLabel("surname ");
		lblSurname.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurname.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSurname.setBounds(36, 84, 100, 29);
		contentPane.add(lblSurname);
		
		JLabel lblNewLabel_1_1 = new JLabel("date");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(36, 136, 100, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("to cancel your appointment please press the button ");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(399, 84, 396, 29);
		contentPane.add(lblNewLabel_1_1_1);
		
		
		
		JLabel lblname = new JLabel("");
		lblname.setHorizontalAlignment(SwingConstants.CENTER);
		lblname.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblname.setBounds(269, 30, 100, 29);
		contentPane.add(lblname);
		
		JLabel lblsurname = new JLabel("");
		lblsurname.setHorizontalAlignment(SwingConstants.CENTER);
		lblsurname.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblsurname.setBounds(269, 84, 100, 29);
		contentPane.add(lblsurname);
		
		JLabel lblday = new JLabel("");
		lblday.setHorizontalAlignment(SwingConstants.CENTER);
		lblday.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblday.setBounds(182, 136, 49, 29);
		contentPane.add(lblday);
		
		
		
		
		
		JButton btnNewButton = new JButton("cancel ");
		btnNewButton.setBounds(534, 132, 109, 58);
		contentPane.add(btnNewButton);
		
		JLabel lblmonth = new JLabel((String) null);
		lblmonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblmonth.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblmonth.setBounds(241, 136, 49, 29);
		contentPane.add(lblmonth);
		
		JLabel lblyear = new JLabel((String) null);
		lblyear.setHorizontalAlignment(SwingConstants.CENTER);
		lblyear.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblyear.setBounds(300, 136, 69, 29);
		contentPane.add(lblyear);
		
		
		
		
		
		JButton btnNewButton_1 = new JButton("refresh ");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton_1.setBounds(38, 187, 85, 21);
		contentPane.add(btnNewButton_1);

		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblname.setText(mainclass.mainclass.appointmentList.SearchappointmentByID(mainclass.mainclass.patientID).getName());
				lblsurname.setText(mainclass.mainclass.appointmentList.SearchappointmentByID(mainclass.mainclass.patientID).getSurname());
				lblday.setText(mainclass.mainclass.appointmentList.SearchappointmentByID(mainclass.mainclass.patientID).getDay());
				lblmonth.setText(mainclass.mainclass.appointmentList.SearchappointmentByID(mainclass.mainclass.patientID).getMonth());
				lblyear.setText(mainclass.mainclass.appointmentList.SearchappointmentByID(mainclass.mainclass.patientID).getYear());
				
				
			}
		});
		
		
		
		
btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				mainclass.mainclass.appointmentList.deleteappointment(mainclass.mainclass.patientID);
				setVisible(false);
				
				
				
			}
		});
		
	}
}
