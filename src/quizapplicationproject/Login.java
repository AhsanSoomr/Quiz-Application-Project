/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quizapplicationproject;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Ahsan Ali
 */
public class Login  extends JFrame implements ActionListener{

 
    JButton rules,back;
    JTextField tfname;
    Login(){ // make constructor
        //get the frame with the help of getContentPane
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
// add image icon in screen which help of jframe class
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500); // set according the screen size
        add(image);

        JLabel heading = new JLabel(" Being Tech");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40 )); // Add Font Family here
        heading.setForeground(Color.BLUE); // add the color for font
        add(heading);

        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mangolian Baiti",Font.BOLD,18 )); // Add Font Family here
        name.setForeground(new Color(30,144,254)); // add the color for font
        add(name);

        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Time New Roman",Font.BOLD,15));
        add(tfname);


        rules = new JButton("Next");
      /*  rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(new Color(255,255,255));*/
        rules.setBounds(915,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(new Color(255,255,255));
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
       /* back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(new Color(255,255,255));*/
        back.setBounds(735,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(new Color(255,255,255));
        back.addActionListener(this);
        add(back);


        setSize(1200,500);
        setLocation(200, 150); // set frame of location on your laptop
        setVisible(true);
        


    }
    public void actionPerformed(ActionEvent ae){
        // here we differentiate b/w rules and back button
    if(ae.getSource()==rules){
        String name = tfname.getText();
            setVisible(false);
            new Rules(name);
    }
    else if(ae.getSource()==back){
         setVisible(false);
    }

    }


    public static void main(String[]args){
    new Login();
    }

}
