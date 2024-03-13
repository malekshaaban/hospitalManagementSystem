package jframes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mainclass.mainclass;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class newAppointment extends JFrame {
	
	appointmentsArray arr = new appointmentsArray();
	
	
	
	private JPanel contentPane;
	private JTextField textname;
	private JTextField textsurname;
	private JLabel lblName;
	private JLabel lblsurname;
	private JLabel lblspec;
	private JTextField textnumber;
	private JLabel lblnumber;
	private JComboBox comboBoxday;
	private JComboBox comboBoxmonth;
	private JComboBox comboBoxyear;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JButton btnNewButton;
	private JLabel lblapID;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newAppointment frame = new newAppointment();
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
	public newAppointment() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 754, 492);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("please enter your info");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel.setBounds(35, 32, 252, 54);
		contentPane.add(lblNewLabel);
		
		textname = new JTextField();
		textname.setBounds(170, 96, 187, 41);
		contentPane.add(textname);
		textname.setColumns(10);
		
		textsurname = new JTextField();
		textsurname.setColumns(10);
		textsurname.setBounds(170, 148, 187, 41);
		contentPane.add(textsurname);
		
		String speciality[] = {"choose","ophthalmologist","cardiologist","general doctor","neurologist","gynecologist"};
		
		
		JComboBox comboBox = new JComboBox(speciality);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setToolTipText("");
		comboBox.setBounds(170, 199, 187, 33);
		contentPane.add(comboBox);
		
		lblName = new JLabel("name");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblName.setBounds(21, 96, 139, 41);
		contentPane.add(lblName);
		
		lblsurname = new JLabel("surname");
		lblsurname.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblsurname.setBounds(21, 148, 139, 43);
		contentPane.add(lblsurname);
		
		lblspec = new JLabel("Speciality");
		lblspec.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblspec.setBounds(21, 199, 112, 33);
		contentPane.add(lblspec);
		
		textnumber = new JTextField();
		textnumber.setColumns(10);
		textnumber.setBounds(170, 254, 187, 41);
		contentPane.add(textnumber);
		
		lblnumber = new JLabel("phone number");
		lblnumber.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblnumber.setBounds(10, 254, 161, 41);
		contentPane.add(lblnumber);
		
		String day[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};		
		String month[]= {"1","2","3","4","5","6","7","8","9","10","11","12"};
		String year[]= {"2023","2024"};
		
		comboBoxday = new JComboBox(day);
		comboBoxday.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBoxday.setBounds(170, 357, 45, 33);
		contentPane.add(comboBoxday);
		
		comboBoxmonth = new JComboBox(month);
		comboBoxmonth.setFont(new Font("Tahoma", Font.PLAIN, 17));
		comboBoxmonth.setBounds(225, 357, 45, 33);
		contentPane.add(comboBoxmonth);
		
		comboBoxyear = new JComboBox(year);
		comboBoxyear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxyear.setBounds(280, 358, 68, 32);
		contentPane.add(comboBoxyear);
		
		lblNewLabel_5 = new JLabel("Date");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(10, 349, 101, 41);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("D");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(170, 319, 45, 39);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("M");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(225, 319, 45, 39);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Y");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(291, 319, 45, 39);
		contentPane.add(lblNewLabel_8);
		
		lblapID = new JLabel("");
		lblapID.setHorizontalAlignment(SwingConstants.CENTER);
		lblapID.setBackground(Color.GRAY);
		lblapID.setForeground(Color.RED);
		lblapID.setFont(new Font("STFangsong", Font.PLAIN, 27));
		lblapID.setBounds(467, 357, 236, 57);
		contentPane.add(lblapID);
		
		lblNewLabel_2 = new JLabel("appointment ID");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(424, 319, 236, 33);
		contentPane.add(lblNewLabel_2);
		
		lblapID = new JLabel("");
		lblapID.setBounds(424, 357, 236, 33);
		contentPane.add(lblapID);
		
		lblNewLabel_2 = new JLabel("appointment ID");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(424, 319, 236, 33);
		contentPane.add(lblNewLabel_2);
		
		
		btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Random rn = new Random();
				String ID = Integer.toString(rn.nextInt(100000));
				
				 appointment ap = new appointment(textname.getText(), textsurname.getText(), comboBox.getSelectedItem().toString(), comboBoxday.getSelectedItem().toString(), comboBoxmonth.getSelectedItem().toString(), comboBoxyear.getSelectedItem().toString(),(String)ID);
				System.out.println(ap);
				lblapID.setText(ID);
				
				//arr.addappointment(ap);
				mainclass.appointmentList.addapointment(ap);
				mainclass.appointmentList.printlist();
				lblapID.setForeground(Color.RED);
				lblapID.setHorizontalAlignment(SwingConstants.CENTER);
				lblapID.setFont(new Font("STFangsong", Font.PLAIN, 27));
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnNewButton.setBounds(170, 412, 117, 33);
		contentPane.add(btnNewButton);
		
		
		
		
	}
}
