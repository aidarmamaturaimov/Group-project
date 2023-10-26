import java.awt.EventQueue;
import java.util.Random;


import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Scanner;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.regex.Pattern;


public class Passengers extends JFrame {

	private JPanel contentPane;
	private JTextField tNumber;
	private JTextField eAdress;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField lName;
	private JTextField fName;
	private JTextField pNumber;
	private JDateChooser dOfBirth;
	private JTextField pCountry;
	private JTextField dInfo;
	private JLabel lblNewLabel_5_4_2;
	

    
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Passengers frame = new Passengers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	
	
	public Passengers() {
		

		ArrayList <String> listData = new ArrayList<String>();


		
		
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 618);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tNumber = new JTextField();
		tNumber.setBounds(168, 348, 130, 26);
		contentPane.add(tNumber);
		tNumber.setColumns(10);
		

		
		
		JLabel lblNewLabel = new JLabel("Passenger details");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(135, 25, 244, 32);
		contentPane.add(lblNewLabel);
		
		eAdress = new JTextField();
		eAdress.setColumns(10);
		eAdress.setBounds(168, 310, 130, 26);
		contentPane.add(eAdress);
		
		lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(26, 141, 130, 16);
		contentPane.add(lblNewLabel_1);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(135, 232, 1, 1);
		contentPane.add(layeredPane);
		
		lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(26, 100, 130, 16);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Date of Birth");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBounds(26, 267, 130, 16);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Telephone Number");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBounds(26, 353, 130, 16);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Email Address");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setBounds(26, 315, 130, 16);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Luggage");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setBounds(26, 386, 130, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_1 = new JLabel("Seat Departing");
		lblNewLabel_5_1.setForeground(Color.BLACK);
		lblNewLabel_5_1.setBounds(26, 421, 130, 16);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Seat Returning");
		lblNewLabel_5_2.setForeground(Color.BLACK);
		lblNewLabel_5_2.setBounds(26, 452, 130, 16);
		contentPane.add(lblNewLabel_5_2);
		
		lName = new JTextField();
		lName.setColumns(10);
		lName.setBounds(171, 136, 130, 26);
		contentPane.add(lName);
		
		fName = new JTextField();
		fName.setColumns(10);
		fName.setBounds(171, 95, 130, 26);
		contentPane.add(fName);
		
		pCountry = new JTextField();
		pCountry.setColumns(10);
		pCountry.setBounds(168, 229, 130, 26);
		contentPane.add(pCountry);
		
		JLabel lblNewLabel_5_4 = new JLabel("Passport Country");
		lblNewLabel_5_4.setForeground(Color.BLACK);
		lblNewLabel_5_4.setBounds(26, 232, 130, 16);
		contentPane.add(lblNewLabel_5_4);
		
		dInfo = new JTextField();
		dInfo.setColumns(10);
		dInfo.setBounds(171, 488, 130, 26);
		contentPane.add(dInfo);
		
		JLabel lblNewLabel_5_4_1 = new JLabel("Disability Information");
		lblNewLabel_5_4_1.setForeground(new Color(255, 93, 88));
		lblNewLabel_5_4_1.setBounds(26, 493, 143, 16);
		contentPane.add(lblNewLabel_5_4_1);
		

		JComboBox sDeparting = new JComboBox();
		sDeparting.setModel(new DefaultComboBoxModel(new String[] {" ","1A", "1B", "2A", "2B", "3A", "3B", "4A", "4B", "5A", "5B", "6A", "6B", "7A", "7B"}));
		sDeparting.setToolTipText("");
		sDeparting.setBounds(171, 408, 130, 44);
		contentPane.add(sDeparting);
		
		dOfBirth = new JDateChooser();
		dOfBirth.setBounds(168, 267, 130, 26);
		contentPane.add(dOfBirth);
		
		JComboBox sReturning = new JComboBox();
		sReturning.setModel(new DefaultComboBoxModel(new String[] {" ","1A", "1B", "2A", "2B", "3A", "3B", "4A", "4B", "5A", "5B", "6A", "6B", "7A", "7B"}));
		sReturning.setToolTipText("");
		sReturning.setBounds(171, 439, 130, 44);
		contentPane.add(sReturning);
		
		JList list = new JList();
		list.setBounds(438, 249, 1, 1);
		contentPane.add(list);
		
		JComboBox luggage = new JComboBox();
		luggage.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		luggage.setToolTipText("");
		luggage.setBounds(171, 373, 130, 44);
		contentPane.add(luggage);
		
		JLabel lblNewLabel_5_3 = new JLabel("Passport Number");
		lblNewLabel_5_3.setForeground(Color.BLACK);
		lblNewLabel_5_3.setBounds(26, 190, 130, 16);
		contentPane.add(lblNewLabel_5_3);
		
		pNumber = new JTextField();
		pNumber.setColumns(10);
		pNumber.setBounds(168, 185, 130, 26);
		contentPane.add(pNumber);
		
		lblNewLabel_5_4_2 = new JLabel("Optional");
		lblNewLabel_5_4_2.setForeground(new Color(255, 93, 88));
		lblNewLabel_5_4_2.setBounds(64, 521, 143, 16);
		contentPane.add(lblNewLabel_5_4_2);
		
		

        
    
         
		
		JButton button = new JButton("Save");
		button.addActionListener(new ActionListener() {				
			public void actionPerformed(ActionEvent e) {
				
			    boolean nameCorrect = false;
			    boolean ageCorrect = false;
			    boolean emailCorrect = false;
			    boolean telephoneCorrect = false;
			    boolean lNameCorrect = false;
			    boolean passportCorrect = false;
			    boolean pCountryCorrect = false;
			    boolean disabilityCorrect = false;
			    
			    Random random = new Random();
			 
				
				String text = tNumber.getText();
				
				if( text.matches("[0-9]+"))
				{
					telephoneCorrect = true;

				}
				else {
					JOptionPane.showMessageDialog(null, "Write number, check telephone number", "Message", JOptionPane.ERROR_MESSAGE);
				}
				
				
			    String text1 = fName.getText();

			    if (text1.matches("[A-Z][a-z]+")) {
			    	nameCorrect = true;

			    }
			    else {
					JOptionPane.showMessageDialog(null, "Write letter or check name again","Message",JOptionPane.ERROR_MESSAGE);

			    }
				
			    String text2 = lName.getText();

			    if (text2.matches("[A-Z][a-z]+")) {
			    	lNameCorrect = true;

			    }
			    else {
					JOptionPane.showMessageDialog(null, "Write letter or check last name again","Message",JOptionPane.ERROR_MESSAGE);

			    }
				
			    Pattern pattern1 = Pattern.compile("[a-zA-Z]+[0-9]+");
			    String text3 = pNumber.getText();
			    
			    if (text3 != null && pattern1.matcher(text3).find()) {
			    	passportCorrect = true;
			    } 
			    else {
					JOptionPane.showMessageDialog(null, "Check passport number","Message",JOptionPane.ERROR_MESSAGE);

			    }
				
				String text4 = eAdress.getText();
		       
				Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

				
				if (text4 != null && emailPattern.matcher(text4).matches()) {
					emailCorrect = true;
				} else {
		            JOptionPane.showMessageDialog(null, "Check email address", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				 String text5 = pCountry.getText();

				    if (text5.matches("[a-zA-Z]+")) {
				    	pCountryCorrect = true;

				    }
				    else {
						JOptionPane.showMessageDialog(null, "Check passport country","Message",JOptionPane.ERROR_MESSAGE);

				    }
				 
				    
				    String text6 = dInfo.getText();
				   
				    if (text6.isEmpty()){
				    	button.setEnabled(false);
				    }
				    else {
				    
				    	button.setEnabled(true);
				    	if (text6.matches("[a-zA-Z]+")) {
					    	disabilityCorrect = true;
			                JOptionPane.showMessageDialog(null, "Your diasbility information saved","Message",JOptionPane.INFORMATION_MESSAGE);

					    }
					    else {
							JOptionPane.showMessageDialog(null, "Check disability information","Message",JOptionPane.ERROR_MESSAGE);
	
					    }
				    	
				    	


				    	
				    }
				
		        
		        Date selectedDate = dOfBirth.getDate(); 	            
	            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	            String dateString = formatter.format(selectedDate);

	            
	            Calendar dobCalendar = Calendar.getInstance();
	            dobCalendar.setTime(selectedDate);
	            Calendar nowCalendar = Calendar.getInstance();
	            int age = nowCalendar.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);
	            
	            if (nowCalendar.get(Calendar.DAY_OF_YEAR) < dobCalendar.get(Calendar.DAY_OF_YEAR)) {
	                age--;
	            }


	           
	            if (age >=18) {
	                
	            	ageCorrect = true;

	            }
	            

	            else {
	            	JOptionPane.showMessageDialog(null, "Pasenger should be over 18 years old ", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	            
	            

	            
	            listData.add(fName.getText());
	            listData.add(lName.getText());
	            listData.add(pNumber.getText());
	            listData.add(dateString);
	            listData.add(eAdress.getText());
	            listData.add(tNumber.getText());
	            listData.add(dInfo.getText());
	            listData.add(luggage.getSelectedItem().toString());
	            listData.add(sDeparting.getSelectedItem().toString());
	            listData.add(sReturning.getSelectedItem().toString());
	            	            
	            
	            if (nameCorrect && emailCorrect && telephoneCorrect && lNameCorrect && passportCorrect && pCountryCorrect  && ageCorrect) {
	            	if (disabilityCorrect ==true)
	                JOptionPane.showMessageDialog(null, "Information saved!","Message",JOptionPane.INFORMATION_MESSAGE);
	                
	                int randomNumber = random.nextInt(90000000) + 10000000;
	                JOptionPane.showMessageDialog(null, "Your ID number:" + randomNumber,"Message",JOptionPane.INFORMATION_MESSAGE);

	                
	                listData.add("08/03/2023");
	                listData.add("06:20");
	                listData.add("11:57");
	                listData.add("05:37");
	                listData.add("7021.04");
	                listData.add("179");
	                listData.add("HND");
	                listData.add("Tokyo");
	                listData.add("SYD");
	                listData.add("Sydney");
	                listData.add("TS4977");
	                listData.add("Easyplane");
	                
	                listData.add("27/03/2023");
	                listData.add("18:23");
	                listData.add("03:44");
	                listData.add("09:21");
	                listData.add("11687.85");
	                listData.add("10");
	                listData.add("SYD");
	                listData.add("Sydney");
	                listData.add("HND");
	                listData.add("Tokyo");
	                listData.add("ST4138");
	                listData.add("Eastair");

		            
	                System.out.println(listData);
		            
	                fName.setText(null);
		            lName.setText(null);
		            pNumber.setText(null);
		            eAdress.setText(null);
		            tNumber.setText(null);
		            pCountry.setText(null);
		            dInfo.setText(null);
		            luggage.setSelectedIndex(-1);
		            sDeparting.setSelectedIndex(-1);
		            sReturning.setSelectedIndex(-1);
		            dOfBirth.setDate(null);
		            

	            } else {
	                JOptionPane.showMessageDialog(null, "Please enter correct information!", "Error", JOptionPane.ERROR_MESSAGE);
	            }
			}
			
		});
		button.setForeground(new Color(63, 63, 63));
		button.setBackground(new Color(72, 72, 72));
		button.setBounds(388, 439, 117, 29);
		contentPane.add(button);
		
		
		
		
		
		
		
	}
}
