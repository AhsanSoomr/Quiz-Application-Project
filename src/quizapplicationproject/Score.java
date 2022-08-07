/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quizapplicationproject;

import java.awt.event.ActionListener;
import javax.swing.Action;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Ahsan Ali
 */
public class Score extends JFrame implements ActionListener {

    Score(String name,int score){
    setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2= i1.getImage().getScaledInstance(300, 250,Image.SCALE_DEFAULT  );
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thank you "+name+" for taking quiz");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(heading);

        JLabel stscore = new JLabel("You Score is "+score);
        stscore.setBounds(350, 200, 300, 30);
        stscore.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(stscore);

       JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);

        add(submit);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
setVisible(false);
new Login();

    }


    public static void main(String []args){
    new Score("User",0);
    }

}
