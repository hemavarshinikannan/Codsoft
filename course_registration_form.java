package task; 
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.util.Arrays;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class course_registration_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtfname;
	private JTextField txtlname;
	private JTextField txtstuid;
	private JTextField txtemail;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtdob;
	private JTextField txtmobno;
	private JTextField txtage;
	private JComboBox comboBoxcourse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					course_registration_form frame = new course_registration_form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public course_registration_form() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hema varshini\\Pictures\\Camera Roll\\scr.jpg"));
		setTitle("Student Course Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1004, 784);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("    COURSE REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBackground(new Color(29, 71, 32));
		lblNewLabel.setBounds(294, 38, 370, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name*");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(130, 126, 121, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name*");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(525, 126, 152, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email*");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(525, 203, 141, 14);
		contentPane.add(lblNewLabel_3);
		
		txtfname = new JTextField();
		txtfname.setBounds(129, 151, 304, 20);
		contentPane.add(txtfname);
		txtfname.setColumns(10);
		
		txtlname = new JTextField();
		txtlname.setBounds(525, 151, 312, 20);
		contentPane.add(txtlname);
		txtlname.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Student ID Number*");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(130, 203, 237, 14);
		contentPane.add(lblNewLabel_4);
		
		txtstuid = new JTextField();
		txtstuid.setBounds(130, 228, 303, 20);
		contentPane.add(txtstuid);
		txtstuid.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setBounds(525, 228, 312, 20);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Gender*");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(130, 269, 92, 14);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdbtnmale = new JRadioButton("Male");
		rdbtnmale.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonGroup.add(rdbtnmale);
		rdbtnmale.setBounds(130, 297, 49, 23);
		contentPane.add(rdbtnmale);
		
		JRadioButton rdbtnfemale = new JRadioButton("Female");
		rdbtnfemale.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonGroup.add(rdbtnfemale);
		rdbtnfemale.setBounds(196, 297, 109, 23);
		contentPane.add(rdbtnfemale);
		
		JLabel lblNewLabel_6 = new JLabel("Date of Birth");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(525, 271, 152, 14);
		contentPane.add(lblNewLabel_6);
		
		txtdob = new JTextField();
		txtdob.setBounds(525, 299, 152, 20);
		contentPane.add(txtdob);
		txtdob.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Course*");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(130, 337, 70, 14);
		contentPane.add(lblNewLabel_7);
		
		JComboBox comboBoxcourse = new JComboBox();
		comboBoxcourse.setEditable(true);
		comboBoxcourse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxcourse.setToolTipText("");
		comboBoxcourse.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "C  - P01", "C++ - P02", "Java - P03", "Python - P04", "HTML CSS - P05", "Java SCript - P06"}));
		comboBoxcourse.setBounds(130, 362, 263, 22);
		contentPane.add(comboBoxcourse);
		
		JLabel lblNewLabel_8 = new JLabel("Mobile Number*");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(525, 339, 152, 14);
		contentPane.add(lblNewLabel_8);
		
		txtmobno = new JTextField();
		txtmobno.setBounds(525, 364, 216, 20);
		contentPane.add(txtmobno);
		txtmobno.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("View Course Details : ");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(448, 451, 152, 14);
		contentPane.add(lblNewLabel_10);
		
		JButton btnregister = new JButton("REGISTER");
		btnregister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/course_registration","root","Hema@0304");
					String query = "INSERT INTO register VALUES (?,?,?,?,?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(query);
					ps.setString(1, txtfname.getText());
					ps.setString(2, txtlname.getText());
					ps.setString(3, txtstuid.getText());
					ps.setString(4, txtemail.getText());
					if(rdbtnmale.isSelected()) {
						ps.setString(5, rdbtnmale.getText());
					}
					else {
						ps.setString(5, rdbtnfemale.getText());
					}
					ps.setString(6, txtdob.getText());
					String selectedCourse = (String) comboBoxcourse.getSelectedItem();
					ps.setString(7, selectedCourse);
					ps.setString(8, txtmobno.getText());
					ps.setInt(9,Integer.parseInt(txtage.getText()));
					
					int i = ps.executeUpdate();
					JOptionPane.showMessageDialog(btnregister, i+"Course Registered Successfully!!");
					reset(ps);
					ps.close();
					con.close();
					
					} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			private void reset(PreparedStatement ps) {
				// TODO Auto-generated method stub
				txtfname.setText(""); 
			    txtlname.setText(""); 
			    txtstuid.setText(""); 
			    txtemail.setText(""); 
			    buttonGroup.clearSelection(); 
			    txtdob.setText(""); 
			    comboBoxcourse.setSelectedIndex(0);
			    txtmobno.setText(""); 			
			    txtage.setText("");
				
			}
		});
		btnregister.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnregister.setBounds(248, 648, 152, 49);
		contentPane.add(btnregister);
		
		JButton btndrop = new JButton(" Drop  course   \r\n");
		btndrop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
			            Class.forName("com.mysql.cj.jdbc.Driver");
			            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/course_registration", "root", "Hema@0304");
			            String query = "DELETE FROM register WHERE student_id=?";
			            PreparedStatement ps = con.prepareStatement(query);
			            ps.setString(1, txtstuid.getText()); 

			            int i = ps.executeUpdate();
			            if (i > 0) {
			                JOptionPane.showMessageDialog(btndrop, "Course dropped successfully for student ID: " + txtstuid.getText());
			            } else {
			                JOptionPane.showMessageDialog(btndrop, "No records found to drop course for student ID: " + txtstuid.getText());
			            }
			            reset(ps);
			            ps.close();
			            con.close();

			        } catch (Exception ex) {
			            ex.printStackTrace();
			        }
			}

			private void reset(PreparedStatement ps) {
				// TODO Auto-generated method stub
				txtfname.setText(""); 
			    txtlname.setText(""); 
			    txtstuid.setText(""); 
			    txtemail.setText(""); 
			    buttonGroup.clearSelection(); 
			    txtdob.setText("");
			    comboBoxcourse.setSelectedIndex(0);
			    txtmobno.setText(""); 			
			    txtage.setText("");
			}

			
		});
		btndrop.setFont(new Font("Tahoma", Font.BOLD, 16));
		btndrop.setBounds(525, 648, 172, 49);
		contentPane.add(btndrop);
		
		JTextPane txtpnCourseWithTiming = new JTextPane();
		txtpnCourseWithTiming.setText("  \r\n  Course with timing\r\n    C                 - Time (6.00 pm to 7.00 pm)\r\n    C++           - Time (6.30 pm to 7.30 pm)\r\n    Java            - Time (7.00 pm to 8.00 pm)\r\n    Python       - Time (9.00 pm to 10.00 pm)\r\n    HTML CSS - Time (6.00 pm to 7.00 pm)\r\n    Java Script - Time (8.30 pm to 9.30 pm)");
		txtpnCourseWithTiming.setBounds(610, 423, 237, 130);
		contentPane.add(txtpnCourseWithTiming);
		
		JLabel lblNewLabel_9 = new JLabel("Age*");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(133, 395, 46, 32);
		contentPane.add(lblNewLabel_9);
		
		txtage = new JTextField();
		txtage.setBounds(130, 423, 86, 20);
		contentPane.add(txtage);
		txtage.setColumns(10);
		
		JTextArea txtrNoteEnter = new JTextArea();
		txtrNoteEnter.setText("NOTE : Enter your ID correctly");
		txtrNoteEnter.setBounds(525, 708, 280, 22);
		contentPane.add(txtrNoteEnter);
		
	}
}
