/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quizapplicationproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

/**
 *
 * @author Ahsan Ali
 */
public class Rules  extends JFrame implements ActionListener{

    String name;
    JButton back,start;

    Rules(String name){
        this.name = name;
         //get the frame with the help of getContentPane
        getContentPane().setBackground(Color.WHITE);
    setLayout(null);

    JLabel heading = new JLabel(" Welcome "+ name +" To Being Tech Quiz");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30 )); // Add Font Family here
        heading.setForeground(Color.BLUE); // add the color for font
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16 )); // Add Font Family here
        rules.setText(
            "<html>"+
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
);
        add(rules);



        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(new Color(255,255,255));
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(new Color(255,255,255));
        start.addActionListener(this);
        add(start);

    setSize(800,650);
    setLocation(350,100);

    setVisible(true);

    }

 public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
new Quiz(name);
setVisible(false);
        }
    else{
    setVisible(false);
    new Login();
    }

 }
    public static void main(String []args){
    new Rules("User");
    }

}
