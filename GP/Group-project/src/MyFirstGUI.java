import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class MyFirstGUI {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JLabel lblNewLabel_1;
	private JTextField tf3;
	private JLabel lblNewLabel_2;
	private JButton btnSubstract;
	private JButton btnMultiply;
	private JButton btnReverse;
	private JButton btnRepeat;
	private JButton btnRemoveFirstLetter;
	private JButton btnRemoveLastLetter;
	private JTextField tfresult;
	private JButton btnAdd;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstGUI window =new MyFirstGUI();
					window.frame.setVisible (true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MyFirstGUI() {
		initialize();
	}

	private void initialize() {
		frame=new JFrame();
		frame.setBounds(100,100,450,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Divide");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String x = tf1.getText();
				String y = tf2.getText();
				double x1 = Double.parseDouble(x);
				double y1 = Double.parseDouble(y);
				
					double result = divide(x1, y1);	
					System.out.print(result);
					String ans = Double.toString(result);
					
					tfresult.setText(ans);

			}
		});
		btnNewButton.setBounds(224, 84, 100, 29);
		frame.getContentPane().add(btnNewButton);
		
		tf1 = new JTextField();
		tf1.setBounds(18, 29, 130, 26);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(160, 29, 130, 26);
		frame.getContentPane().add(tf2);
		
		JLabel lblNewLabel = new JLabel("First Number");
		lblNewLabel.setBounds(34, 6, 94, 16);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Second Number");
		lblNewLabel_1.setBounds(182, 6, 108, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(302, 29, 130, 26);
		frame.getContentPane().add(tf3);
		
		lblNewLabel_2 = new JLabel("Word");
		lblNewLabel_2.setBounds(338, 6, 94, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		btnSubstract = new JButton("Substract");
		btnSubstract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String x = tf1.getText();
				String y = tf2.getText();
				double x1 = Double.parseDouble(x);
				double y1 = Double.parseDouble(y);
				
					double result = subtract(x1, y1);	
					System.out.print(result);
					String ans = Double.toString(result);
					
					tfresult.setText(ans);
			}
		});
		btnSubstract.setBounds(119, 84, 97, 29);
		frame.getContentPane().add(btnSubstract);
		
		btnMultiply = new JButton("Multiply");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String x = tf1.getText();
				String y = tf2.getText();
				double x1 = Double.parseDouble(x);
				double y1 = Double.parseDouble(y);
				
					double result = multiply(x1, y1);	
					System.out.print(result);
					String ans = Double.toString(result);
					
					tfresult.setText(ans);
			}
		});
		btnMultiply.setBounds(324, 84, 108, 29);
		frame.getContentPane().add(btnMultiply);
		
		btnReverse = new JButton("Reverse");
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String z = tf3.getText();
				String newStr = "";
			    int zLength = z.length();
				for (int i = (zLength - 1); i >=0; i--) {
					newStr = newStr + z.charAt(i);
				    }
				tfresult.setText(newStr);
			}
		});
		btnReverse.setBounds(11, 125, 117, 29);
		frame.getContentPane().add(btnReverse);
		
		btnRepeat = new JButton("Repeat");
		btnRepeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String z = tf3.getText();
				int zLength = z.length();
				//String newStr = z;
				//int i=0;
				String newStr = "";
				ArrayList <String> repeat = new ArrayList <String>();
				
				for (Integer i=1; i<repeat.size();i++) {
					repeat.add(z);

				}
				
				/*for (Integer i=1; i<repeat.size();i++) {
					
					Integer x=repeat.get(i);
					if (i<zLength) {
						newStr += z;
					}
					else {
						newStr += "";
					}
				}*/
				//tfresult.setText(newStr);
				//System.out.println(repeat);
				//tfresult.printText(repeat);

				

				
				/*if (i == 0) {
					tfresult.setText(z);
			    }
				else {
			        char ac[] = new char[count + i];
			        getChars(0, count, ac, 0);
			        z.getChars(0, i, ac, count);
			        tfresult.String(0, count + i, ac);
			    }*/
				//tfresult.setText(newStr);
			}
		});
		btnRepeat.setBounds(131, 125, 117, 29);
		frame.getContentPane().add(btnRepeat);
		
		btnRemoveFirstLetter = new JButton("Remove first letter");
		btnRemoveFirstLetter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String z = tf3.getText();
				String newStr= z.substring(1);
				tfresult.setText(newStr);

			}
		});
		
		btnRemoveFirstLetter.setBounds(248, 125, 160, 29);
		frame.getContentPane().add(btnRemoveFirstLetter);
		
		btnRemoveLastLetter = new JButton("Remove last letter");
		btnRemoveLastLetter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				String z = tf3.getText();
				String newStr = z.substring(0, z.length() - 1);  
				tfresult.setText(newStr);  

			}
		});
		
		btnRemoveLastLetter.setBounds(119, 166, 146, 29);
		frame.getContentPane().add(btnRemoveLastLetter);
		
		tfresult = new JTextField();
		tfresult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		tfresult.setBounds(162, 219, 146, 26);
		frame.getContentPane().add(tfresult);
		tfresult.setColumns(10);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = tf1.getText();
				String y = tf2.getText();
				double x1 = Double.parseDouble(x);
				double y1 = Double.parseDouble(y);
				
					double result = add(x1, y1);	
					System.out.print(result);
					String ans = Double.toString(result);
					
					tfresult.setText(ans);
			}
		});
		btnAdd.setBounds(0, 84, 117, 29);
		frame.getContentPane().add(btnAdd);
		
		
	}
	
	public double add(double x, double y )
	{
		return x+y;
	}
	public double subtract(double x, double y)
	{
		return x-y;
	}
	public double divide(double x, double y)
	{
		return x/y;
	}

	public double multiply(double x, double y) {
		return x*y;
	}
	public String reverseW(String w)
	{
		return "";
	}
	public String repeat(String w)
	{
		return "";
	}
	public String removeFirstChar(String w) {
		return "";
	}
	public String removeLastChar(String w)
	{

		return "";
	}
}
