/*e
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author calmp
 */
public class KiloConverter extends JFrame 
{
    private JPanel panel;
    private JLabel messageLabel;
    private JTextField kiloTextField;
    private JButton calcButton;
    private final int winwidth = 310;
    private final int winheight = 100;
    
    
    
    public KiloConverter()
    {
        setTitle ("Kilometer Converter");
        
        setSize(winwidth,winheight);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        //my netbeans doesn't like Gaddis's buildPanel, it wants a new class... this fixed itself...
        
        add(panel);
        
        setVisible(true);
        
    } 
    private void buildPanel(){
        messageLabel = new JLabel("Enter a distance in kilometers");
        kiloTextField = new JTextField(10);
        
        calcButton = new JButton("Calculate");
        
        calcButton.addActionListener(new CalcButtonListener());
        
        panel = new JPanel();
        
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);
        
        
    }
    private class CalcButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            final double conversion = .6214;
            String input;
            double miles;
            
            input = kiloTextField.getText();
            
            miles = Double.parseDouble(input) * conversion;
            
            JOptionPane.showMessageDialog(null,input + "kilometers is " +miles +" miles.");
            
        }
    }
    public static void main(String[] args){
        new KiloConverter();
        
    }
}
