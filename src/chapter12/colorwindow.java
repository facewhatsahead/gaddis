/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;

/**
 *
 * @author calmp
 */
public class colorwindow extends JFrame {

    private JLabel messageLabel;
    private JButton redButton;
    private JButton blueButton;
    private JButton yellowButton;
    private JPanel panel;
    private final int windowwidth = 200;
    private final int windowheight = 125;
    
    public colorwindow()
    {
        setTitle("colors");
        setSize(windowwidth,windowheight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        messageLabel = new JLabel("get your colors");
        
        redButton = new JButton("Red");
        blueButton = new JButton("blue");
        yellowButton = new JButton("yellow");
        
        redButton.addActionListener(new RedButtonListener());
        blueButton.addActionListener(new BlueButtonListener());
        yellowButton.addActionListener(new YellowButtonListener());
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(redButton);
        panel.add(blueButton);
        panel.add(yellowButton);
        
        add(panel);
        
        setVisible(true);
    }
    private class RedButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
                panel.setBackground(Color.red);
                messageLabel.setForeground(Color.blue);
            }
    }
    private class BlueButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
                panel.setBackground(Color.blue);
                messageLabel.setForeground(Color.black);
            }
    }
    private class YellowButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
                panel.setBackground(Color.yellow);
                messageLabel.setForeground(Color.blue);
            }
            }
    public static void main(String[] args){
        new colorwindow();
    }
    }
    
 

