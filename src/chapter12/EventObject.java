
package chapter12;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author calmp
 */
public class EventObject extends JFrame {
    private JButton button1; 
    private JButton button2;
    private JButton button3;
    private JPanel panel;
    private final int windowwidth = 300;
    private final int windowheight = 70;
    
    public EventObject()
    {
        setTitle("Event object demo");
        setSize(windowwidth,windowheight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
    
        button1.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener());
        button3.addActionListener(new ButtonListener());
        
        panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
    
    add(panel);
    setVisible(true);
    }
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e){
            String actionCommand = e.getActionCommand();
            
            if (actionCommand.equals("button 1"))
            {
                JOptionPane.showMessageDialog(null,"you clicked #1");
            }
            else if (actionCommand.equals("button 2"))
            {
                JOptionPane.showMessageDialog(null,"you clicked #2");
            }
            else if (actionCommand.equals("button 3"))
            {
                JOptionPane.showMessageDialog(null,"you clicked #3");
            }
        }
    }
        public static void main(String[] args){
            new EventObject();
                    }
}
