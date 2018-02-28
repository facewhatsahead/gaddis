/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;
import javax.swing.*;
/**
 *
 * @author calmp
 */
public class ShowWindow {
    public static void main(String[] args){
        final int WINDOWWIDTH=350;
        final int WINDOWHEIGHT=250;
        
        JFrame window = new JFrame();
        
        window.setTitle("a simple window");
        
        window.setSize(WINDOWWIDTH,WINDOWHEIGHT);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.setVisible(true);
        
    }
}
