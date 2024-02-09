
package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener
{
    Score(String name, int score){
        setBounds(600,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons\\scorei.jpeg"));
            Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,200,300,250);
		add(image);
                
                
                JLabel heading = new JLabel("Thankyou "+ name+" for playing Quiz Time");
                heading.setBounds(45,30,700,30);
                heading.setFont(new Font("Tahoma",Font.PLAIN,26));
                add(heading);
                
                JLabel blscore = new JLabel("YOUR SCORE IS :  "+ score);
                blscore.setBounds(350,200,300,30);
                blscore.setFont(new Font("Tahoma",Font.PLAIN,26));
                add(blscore);
                
                JButton submit = new JButton("Play Again");
                submit.setBounds(380,270,120,30);
                submit.setBackground(new Color(30,144,255));
                submit.setForeground(Color.WHITE);
                submit.addActionListener(this);
                add(submit);
                setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args) {
        new Score("User",0);
    }
    
}
