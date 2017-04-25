/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowlyout;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author mehran
 */
public class FlowLyout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame  frame  = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("FlowLayout Sample ");             
        frame.setBounds(1, 1, 450, 400);
        
        Container contentPane  = frame.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER)); // LEFT,RIGHT,CENTER,LEADING,TRAILING
        contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); // LEFT_TO_RIGHT , RIGHT_TO_LEFT 
        JButton[] buttonList = new JButton[40];
        
        for (int i = 0; i < 40; i++) {
            buttonList[i] = new JButton("Button  " + i);
            buttonList[i].setBackground(new Color(i*3,i*4,i*5));
            contentPane.add( buttonList[i]); 
        }
        
        frame.setVisible(true);
        
    }
    
}
