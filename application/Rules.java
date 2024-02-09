
package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start, back;
    Rules(String name) {
        this.name = name;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome "+name+" to QUIZ TIME");
		heading.setBounds(50,20,700,30);
                heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
                heading.setForeground(new Color(30,144,254));
                add(heading);
                
                JLabel rules = new JLabel("Rules");
                rules.setBounds(20,90,700,350);
                rules.setFont(new Font("Tahoma",Font.PLAIN,16));
                rules.setText(
               "<html>"+
                      "1 . In this quiz, participants will face a series of 15 questions, each with a strict time limit of 15 seconds."+"<br><br>"+
                       "2 . Questions will be displayed one at a time, and participants must provide their answers within the allocated time frame."+"<br><br>"+
                       "3 . Once the time for a question elapses, the quiz automatically moves to the next question."+"<br><br>"+
                       "4 . Participants are encouraged to manage their time wisely and focus on accuracy to maximize their score within the time constraints."+"<br><br>"+
                       "5 . Cheating or using external aids during the quiz is strictly prohibited to ensure fair play and maintain the integrity of the competition."+"<br><br>"+
                      
                      "<html>"
                );
                add(rules);
                
                
                back = new JButton("Back");
                back.setBounds(250,500,100,30);
                back.setBackground(new Color(30,144,254));
                back.setForeground(Color.WHITE);
                back.addActionListener(this);
                add(back);
                
                start = new JButton("Start");
                start.setBounds(400,500,100,30);
                start.setBackground(new Color(30,144,254));
                start.setForeground(Color.WHITE);
                start.addActionListener(this);
                add(start);
                
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    
      public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==start){
          setVisible(false);
          new Quiz(name);
      }
      else if(ae.getSource()==back){
          setVisible(false);
          new Login();
      }
  }
      
    public static void main(String[] args) {
        new Rules("User");
    }
}
