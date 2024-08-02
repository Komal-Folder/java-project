package quiz. application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener {
  
    String name;
    JButton start,back;

    Rules(String name){
         this.name = name;
       getContentPane() .setBackground(Color.WHITE);
       setLayout(null);

       JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN,16));
        rules.setText(
            "<html>"+
                         "1. Participation in the quiz is free and open to all persons above 18 years old." + "<br><br>" +
                         "2. There are a total 10 questions. " + "<br><br>" +
                         "3. You have only 15 seconds to answer the question." + "<br><br>" +
                         "4. No cell phone  or other secondary devices in the room ar test area." + "<br><br>" +
                         "5. No talking." + "<br><br>" +
                         "6. No one else can be in the room with you." + "<br><br>" +
                         "7. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer." + "<br><br>" +
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

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
           setVisible(false);
           new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
       
    public static void main(String args[]) {
        new Rules("User");
    }
}
    

