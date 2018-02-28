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
public class embeddedmain extends JFrame {
    final int winwidth = 350;
    final int winheight = 250;
    public embeddedmain(){
        setTitle("A smpl windo");
        setSize(winwidth,winheight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    
}
    public static void main(String[] args){
        embeddedmain em = new embeddedmain();
        //or "new embeddedmain(); no em...
    }
}