
package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class Quiz extends JFrame implements ActionListener{
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    public static int timer = 15;
    public static int ans_given=0;
    public static int count=0;
    public static int score=0;
    ButtonGroup groupoptions;
    JButton submit,next,lifeline;
    String useranswers[][] = new String[10][1];
    String name;
    
    Quiz(String name){
        this.name = name;
        setBounds(50,0,1440,850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons\\quiz.jpeg"));
		JLabel image = new JLabel(i1);
		image.setBounds(0,100,1400,392);
		add(image);
                
                 qno = new JLabel();
                qno.setBounds(100,450,50,30);
                qno.setFont(new Font("Tahoma",Font.PLAIN,24));
                add(qno);
                
                 question = new JLabel();
                question.setBounds(150,450,900,30);
                question.setFont(new Font("Tahoma",Font.PLAIN,24));
                add(question);
                
questions[0][0] = "What is the default value of a boolean variable in Java?";
questions[0][1] = "true";
questions[0][2] = "false";
questions[0][3] = "0";
questions[0][4] = "1";

questions[1][0] = "Which of the following is not a primitive data type in Java?";
questions[1][1] = "int";
questions[1][2] = "char";
questions[1][3] = "String";
questions[1][4] = "double";

questions[2][0] = "Which statement is true about Java's garbage collection?";
questions[2][1] = "Java provides explicit memory deallocation using the 'delete' keyword";
questions[2][2] = "Garbage collection ensures that objects are never destroyed";
questions[2][3] = "Java's garbage collector runs on a low priority background thread";
questions[2][4] = "Objects with no references are immediately removed from memory";

questions[3][0] = "What is the purpose of the 'this' keyword in Java?";
questions[3][1] = "It refers to the current instance of the class";
questions[3][2] = "It refers to the parent class of the current instance";
questions[3][3] = "It refers to the superclass of the current instance";
questions[3][4] = "It refers to a static method within the class";

questions[4][0] = "Which keyword is used to define a constant in Java?";
questions[4][1] = "constant";
questions[4][2] = "var";
questions[4][3] = "final";
questions[4][4] = "static";

questions[5][0] = "What is the output of the following code snippet?\nint x = 5;\nSystem.out.println(x++);";
questions[5][1] = "5";
questions[5][2] = "6";
questions[5][3] = "Compilation error";
questions[5][4] = "Runtime error";

questions[6][0] = "Which of the following statements is true about the 'break' statement in Java?";
questions[6][1] = "It can only be used within loops";
questions[6][2] = "It can only be used within switch statements";
questions[6][3] = "It can be used within both loops and switch statements";
questions[6][4] = "It can't be used in any Java program";

questions[7][0] = "What is the correct syntax for declaring an array in Java?";
questions[7][1] = "int[] myArray;";
questions[7][2] = "myArray = new int[];";
questions[7][3] = "int myArray[];";
questions[7][4] = "All of the above";

questions[8][0] = "Which of the following methods can be used to convert a String to an int in Java?";
questions[8][1] = "Integer.parseInt()";
questions[8][2] = "String.toInt()";
questions[8][3] = "int.valueOf()";
questions[8][4] = "parseInteger()";

questions[9][0] = "What is the correct way to declare a static method in Java?";
questions[9][1] = "static int myMethod() {}";
questions[9][2] = "int static myMethod() {}";
questions[9][3] = "int myMethod() static {}";
questions[9][4] = "All of the above";

answers[0][0] = "false";
answers[1][1] = "String";
answers[2][1] = "Java's garbage collector runs on a low priority background thread";
answers[3][1] = "It refers to the current instance of the class";
answers[4][1] = "final";
answers[5][1] = "5";
answers[6][1] = "It can be used within both loops and switch statements";
answers[7][1] = "All of the above";
answers[8][1] = "Integer.parseInt()";
answers[9][1] = "static int myMethod() {}";
        
         opt1 = new JRadioButton();
        opt1.setBounds(170,520,700 , 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt1);
        
         opt2 = new JRadioButton();
        opt2.setBounds(170,560,700 , 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt2);
        
         opt3 = new JRadioButton();
        opt3.setBounds(170,600,700 , 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt3);
        
         opt4 = new JRadioButton();
        opt4.setBounds(170,640,700 , 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt4);
        
         groupoptions = new ButtonGroup();       
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
                
         next = new JButton("Next");
        next.setBounds(1100,550,200,40);
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        
        
        submit = new JButton("Submit");
        submit.setBounds(1100,710,200,40);
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
                        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){
            repaint();
            ans_given=1;
            if(groupoptions.getSelection()==null){
                useranswers[count][0]="";
            }
            else{
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        
        }
        
        
        else if(ae.getSource()==submit){
             if(groupoptions.getSelection()==null){
                    useranswers[count][0]="";
                }
                else{
                    useranswers[count][0]=groupoptions.getSelection().getActionCommand();
                }
                for(int i=0;i<useranswers.length;i++){
                    if(useranswers[i][0].equals(answers[i][1])){
                        score+=10;
                    }
                    else{
                        score+=0;
                    }
                }
                setVisible(false);
                new Score(name, score);
        }
        
    }
        
    public void paint(Graphics g){
        super.paint(g);
        
        String time = "Time left -  " + timer + " seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma",Font.BOLD,25));
        
        if(timer>0){
            g.drawString(time, 1100, 500);
        }
        else{
             g.drawString("Times up!!", 1100, 500);
        }
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if(ans_given ==1){
            ans_given=0;
            timer=15;
        }
        else if(timer < 0){
            timer=15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count==9){
                if(groupoptions.getSelection()==null){
                    useranswers[count][0]="";
                }
                else{
                    useranswers[count][0]=groupoptions.getSelection().getActionCommand();
                }
                for(int i=0;i<useranswers.length;i++){
                    if(useranswers[i][0].equals(answers[i][1])){
                        score+=10;
                    }
                    else{
                        score+=0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            }
            else{
            
            
            if(groupoptions.getSelection()==null){
                useranswers[count][0] = "";
            }
            else{
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            count++;
            start(count);
        }
        }
    }
    
    public void start(int count){
        qno.setText(""+ (count+1) +". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        groupoptions.clearSelection();
    }
    public static void main(String[] args) {
        new Quiz("User");
    }

    
    
}
